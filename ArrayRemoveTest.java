package com.regnant.array;

import java.util.Arrays;

public class ArrayRemoveTest {

	public static void main(String[] args) 
	{
		ArrayRemove a=new ArrayRemove();
		int []v= {9,9,9,9};
		 System.out.println(Arrays.toString(v));
	       v=a.remove(v);
	       System.out.println(Arrays.toString(v));
	}

}
