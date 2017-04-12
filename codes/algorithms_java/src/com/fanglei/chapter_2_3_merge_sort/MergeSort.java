/**
 * Project Name: algorithms_java
 * File Name: MergeSort.java
 * Package Name: com.fanglei.chapter_2_3_merge_sort
 * Date: Apr 12, 201710:48:08 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */
/**
 * Project Name: algorithms_java
 * File Name: MergeSort.java
 * Package Name: com.fanglei.chapter_2_3_merge_sort
 * Date: Apr 12, 2017 10:48:08 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.chapter_2_3_merge_sort;


/**
 * ClassName: MergeSort
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 12, 2017 10:48:08 PM
 */
public class MergeSort
{
	public static void merge(int A[], int p, int q, int r)
	{
		int n1 = (q - p) + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int R[] = new int[n2];

		System.out.println("L.length: " + L.length + ", R.length: " + R.length);

		for (int i = 0; i < n1; i ++)
		{
			L[i] = A[p + i];
		}
		for (int i = 0; i < n2; i++)
		{
			R[i] = A[q + i + 1];
		}

		System.out.println("p: " + p + ", q: " + q + ", r: " + r);

		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k ++)
		{
			System.out.println("i: " + i + ", j: " + j);
			if((j < n2) && (i < n1))
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
			else if (i < n1)
			{
				A[k] = L[i++];
			}
			else
			{
				A[k] = R[j++];
			}
		}
	}

	public static void mergeSort(int[] A, int p, int r)
	{
		if (p > r)
		{
			return;
		}
		if (p < r)
		{
			int q = (p+r)/2;
			System.out.println("p: " + p + ", q: " + q + ", r: " + r);
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}



}
