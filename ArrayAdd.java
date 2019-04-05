package com.regnant.array;

public class ArrayAdd {

	int a[] = { 1, 2, 3, 4 };
	int b[] = new int[10];

	void copy() {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];

		}
		// System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	void add() {
		b[4] = 6;
		b[6] = 20;
		b[8] = 11;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	int[] addition(int[] m) {

		for (int i = 0; i < m.length; i++) {
			m[i] = m[i] + 2;
		}
		return m;
	}

}
