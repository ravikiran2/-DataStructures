package com.regnant.array;

public class ArrayRemove {

	int[] remove(int[] v) {
		int size = v.length - 2;
		int[] s = new int[size];
		for (int i = 0; i < s.length; i++) {
			s[i] = v[i];
			// System.out.println(s[i]);
		}
		return s;

	}

}
