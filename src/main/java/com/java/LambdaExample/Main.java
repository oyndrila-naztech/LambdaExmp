package com.java.LambdaExample;

import java.util.ArrayList;

public class Main {

	interface FuncInter1{
		int operation(int a, int b);
	}
	private static int operate(int a, int b, FuncInter1 fobj )
	{
		return fobj.operation(a, b);
	}
	public static void main(String[] args) {
		
		
		FuncInter1 add = (int x,int y)->x+y;
		Main m = new Main();
		System.out.println("Addition is "+m.operate(6, 3,add));
		FuncInter1 sub = (int x,int y)->x-y;
		System.out.println("Subtrsction is "+operate(6,3,sub));
		FuncInter1 multipication = (int x,int y)->x*y;
		System.out.println("Multiplication is "+operate(6,3,multipication));
		FuncInter1 division = (int x,int y)->x/y;
		System.out.println("Division is "+operate(6,3,division));
		
	}

}
