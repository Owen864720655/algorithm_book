package com.fanglei.chapter_2_1_insertion_sort;

/**
 * INSERTION-SORT(A)
 * for j = 2 to A.length
 * 		key = A[j]
 * 		// Insert A[j] into the sorted sequence A[1, ..., j-1]
 * 		i = j - 1;
 * 		while i > 0 and A[i] > key
 * 			A[i + 1] = A[i]
 * 			i = i -1;
 * 		A[i + 1] = key
 * 
 * WARNING: 
 * 	In the Java's array, the index starts from 0;
 * while in the pseudocode, the default index starts from 1
 * 
 * @author Owen
 * @email 864720655@qq.com
 * @version 2017-04-10
 *
 */
public class InsertionSort {

	public static int[] insertionSort(int[] A)
	{

		for (int j = 1; j < A.length; j++)
		{
			int key = A[j];			
			int i = j - 1;			
			while(i >= 0 && A[i] > key)
			{
				A[i+1] = A[i];
				i = i - 1;
			}			
			A[i + 1] = key;
		}
		
		return A;		
	}
}
