package com.regnant.array;

public class ArrayBubbleSort {
	int[] arr= {40,80,20,33,90};
	int temp;
	
	void sort() {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		System.out.println("after sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
