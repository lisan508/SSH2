package com.test;
public class Outer
{
		int out_x  = 0;
		public void method()
		{
			Inner1 inner1 = new Inner1();
			class Inner2   //�ڷ������ڲ�������ڲ���
			{
				public void method(){
					
					out_x = 3;
				}
			}
			Inner2 inner2 = new Inner2();
		}

		public class Inner1   //�ڷ��������涨����ڲ���
		{
			
		}
		
}
