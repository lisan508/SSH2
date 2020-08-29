package com.testThread;

public class CreateThread implements Runnable {
	
	 char data []= {'a','b','C','d','e','f'};
     boolean flg = true;
     MyStack mystack= new  MyStack();
     CreateThread(boolean flg){
    	 this.flg=flg;
     }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if  (flg){
		for (int i=0;i<data.length;i++){
			System.out.println(" true I=" + i);
		    mystack.push(data[i]);
		   
		}
		}else{
			while(true){
			System.out.println(" t2 start");
			System.out.println(mystack.pop());
			}
		}
		};
	
	}


