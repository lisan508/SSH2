package com.testThread;

public class MyStack {

	int idx = 0;
	char[] data = new char[6];

	public void push(char c) {
		synchronized(this){
		data[idx] = c;
		idx++;
		}
	}

	public char pop() {
		idx--;
		if(idx>0 ||idx <6  )
		{
		    return data[idx];
		}else
			idx =3;
			return  data[idx];
	}
}