package com.regnant.array;

import java.util.Arrays;

public class ArrayAddTest {

	public static void main(String[] args) 
	{

		ArrayAdd p=new ArrayAdd();
		p.copy();
		p.add();
		int[] m= {9,9,9,9};
		m=p.addition(m);
		System.out.println(Arrays.toString(m));
		
		
	}

}
