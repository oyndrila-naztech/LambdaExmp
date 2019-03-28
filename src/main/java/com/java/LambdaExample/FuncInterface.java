package com.java.LambdaExample;

interface FuncInterface {

	
	void abstructFun(int x);
	default void normalFun()
	{
		System.out.println("Hello");
	}	
	int operation(int a , int b);
	
}
