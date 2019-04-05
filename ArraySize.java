package com.regnant.array;

import java.util.Arrays;

public class ArraySize {

	int a[] = { 1, 2, 3, 4 };
	int r[] = new int[6];

	void add() {
		for (int i = 0; i < a.length; i++) {
			r[i] = a[i];
		}
		for (int k = 0; k < r.length; k++) {
			System.out.println(r[k] + " ");
		}
	}

	void remove() {
		System.out.println("remove an element");
		for (int k = 0; k < r.length - 1; k++) {
			System.out.println(r[k] + " ");
		}
	}

}
