package com.fanglei.resource.chapter_2.chapter_2_1_insertion_sort;

/**
 *
 * ClassName: InsertionSort
 * 
 * Problem Formulation: Sorting problem
 * Input: A sequence of n numbers <a_1, a_2, ..., a_n> <br\>
 * Output: A permutation <a'_1, a'_2, ..., a'_n> of the input sequence such that
 * a'_1 <= a'_2 <= ... <= a'_n
 *
 * ALGORITHM-INSERTION-SORT(A)
 * for j = 2 to A.length
 * 		key = A[j]
 * 		// Insert A[j] into the sorted sequence A[1, ..., j-1]
 * 		i = j - 1
 * 		while i > 0 and A[i] > key
 * 			A[i + 1] = A[i]
 * 			i = i -1
 * 		A[i + 1] = key
 *
 * WARNING: In the Java's array, the index starts from 0; while in the
 * pseudocode, the default index starts from 1.
 *
 *
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 11, 2017 1:12:54 AM
 */
public class InsertionSort
{

	/**
	 *
	 * insertionSort Insertion sort.
	 *
	 * @param A the int array to be sorted
	 * @return the sorted array
	 *
	 * @author Lei Fang
	 */
	public static int[] insertionSort(int[] A)
	{

		for (int j = 1; j < A.length; j++)
		{
			int key = A[j];
			int i = j - 1;
			while ((i >= 0) && (A[i] > key))
			{
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = key;
		}

		return A;
	}
}
