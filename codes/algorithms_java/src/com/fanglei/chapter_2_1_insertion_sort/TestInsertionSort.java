package com.fanglei.chapter_2_1_insertion_sort;

import com.fanglei.utils.Print;

/**
 * Test Insertion Sort Algorithm
 * @author Owen
 *
 */
public class TestInsertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 2, 4, 6, 1, 3};
		
		Print.println("The raw arry A: ");
		Print.println(A);
		
		// Sort A
		int[] B = InsertionSort.insertionSort(A);
		
		Print.println("The sorted array B: ");
		Print.println(B);

	}
}
