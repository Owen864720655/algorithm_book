/**
 * Project Name: algorithms_java
 * File Name: MergeSort.java
 * Package Name: com.fanglei.chapter_2_3_merge_sort
 * Date: Apr 12, 2017 10:48:08 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_2.chapter_2_3_merge_sort;


/**
 * ClassName: MergeSort
 * Description: Merge-sort algorithm
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 12, 2017 10:48:08 PM
 */
public class MergeSort
{

	/**
	 * Method Name: merge
	 * Description: assume A is an array and p, q, r are indices into the array
	 * such that p<= q < r, and the subarrays A[p, ..., q] and A[q+1, ..., r]
	 * are in sorted order. The merge procedure merges them to form a single
	 * sorted subarry that replaces the current subarray A[p, ..., r].
	 * 
	 * @param A the array where the subarray A[p, ..., r] is to be sorted
	 * @param p the start point of the sorted subarray A1 = A[p, ..., q]
	 * @param q the end point of the sorted subarray A1 = A[p, ..., q] and (q+1)
	 * 			is the start point of the sorted subarray A2 = A[q+1, ..., r]
	 * @param r the end point of the sorted subarray A2 = A[q+1, ..., r]
	 *
	 * ALGORITHM-MERGE(A, p, q, r)
	 * n_1 = q - p + 1
	 * n_2 = r - q
	 * let L[1, ..., n_1 + 1] and R[1, ..., n_2 + 1] be new arrays
	 * for i = 1 to n_1
	 * 		L[i] = A[p+i - 1]
	 * for j = 1 to n_2
	 * 		R[i] = A[q+j]
	 * L[n_1 + 1] = infinity
	 * R[n_2 + 1] = infinity
	 * i = 1
	 * j = 1
	 * for k = p to r
	 * 	if L[i] <= R[j]
	 * 		A[k] = L[i]
	 * 		i = i + 1
	 * 	else
	 * 		A[k] = R[j]
	 * 		j = j + 1
	 * 
	 * 
	 * @author Lei Fang
	 */
	public static void merge(int A[], int p, int q, int r)
	{
		int n1 = (q - p) + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i ++)
		{
			L[i] = A[p + i];
		}
		for (int i = 0; i < n2; i++)
		{
			R[i] = A[q + i + 1];
		}

		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k ++)
		{
			if((j < n2) && (i < n1)) // If both subarrays do not end
			{
				if(L[i] <= R[j])
				{
					A[k] = L[i++];
				}
				else
				{
					A[k] = R[j++];
				}
			}
			else if (i < n1) // That is, the subarray R is over
			{
				A[k] = L[i++];
			}
			else // that is, the subarray L is over
			{
				A[k] = R[j++];
			}
		}
	}

	/**
	 * Method Name: mergeSort
	 * Description:
	 * 
	 * @param A the array whose subarray A[p, ..., r] is expected to be sorted
	 * @param p the start point of the subarray A[p, ..., r] to be sorted
	 * @param r the end point of the subarray A[p, r] to be sorted
	 *
	 * ALGORITHM-MERGE-SORT(A, p, r)
	 * if p < r
	 * 		q = ceil((p+r)/2)
	 * 		MERGE-SORT(A, p, q)
	 * 		MERGE-SORT(A, q+1, r)
	 * 		MERGE(A, p, q, r)
	 * 
	 * @author Lei Fang
	 */
	public static void mergeSort(int[] A, int p, int r)
	{
		if (p >= r)
		{
			return;
		}
		if (p < r)
		{
			int q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}

}
