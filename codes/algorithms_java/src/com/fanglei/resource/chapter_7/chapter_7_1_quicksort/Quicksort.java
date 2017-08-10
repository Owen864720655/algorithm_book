/**
 * Project Name: algorithms_java
 * File Name: Quicksort.java
 * Package Name: com.fanglei.resource.chapter_7.chapter_7_1_quicksort
 * Date: Jun 10, 2017 11:52:47 AM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_7.chapter_7_1_quicksort;

/**
 * ClassName: Quicksort
 * Description:
 * 	Quicksort
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 10, 2017 11:52:47 AM
 */
public class Quicksort
{
	/**
	 * swap
	 * swap the two values at the positions of i and j in the array A
	 * 
	 * @param A one array
	 * @param i the first index
	 * @param j the second index
	 */
	private static void swap(int[] A, int i, int j)
	{
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	/**
	 * partition
	 * 
	 * PARTION(A, p, r)
	 * 	x = A[r]
	 * 	i = p - 1;
	 *  for j = p to r-1
	 *  	if A[j] <= x
	 *  		i = i + 1
	 *  		exchange A[i] with A[j]
	 *  exchange A[i+1] with A[r]
	 *  return i + 1
	 * 
	 * @param A the array
	 * @param p the start index
	 * @param r the end index
	 * @return
	 */
	private static int partition(int[] A, int p, int r)
	{
		int x = A[r];
		int i = p - 1;
		for (int j = p; j <= (r - 1); j++)
		{
			if(A[j] <= x)

			{
				i ++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}

	/**
	 * Quicksort
	 * 
	 * QUICKSORT(A, p, r)
	 * 	if p < r
	 * 		q = PARTITION(A, p, r)
	 * 	QUICKSORT(A, p, q-1)
	 *  QUICKSORT(A, q+1, r)
	 * 
	 * @param A the array
	 * @param p the start index
	 * @param r the end index
	 */
	public static void quicksort(int[] A, int p, int r)
	{
		if (p < r)
		{
			int q = partition(A, p, r);
			quicksort(A, p, q - 1);
			quicksort(A, q + 1, r);
		}
	}

}
