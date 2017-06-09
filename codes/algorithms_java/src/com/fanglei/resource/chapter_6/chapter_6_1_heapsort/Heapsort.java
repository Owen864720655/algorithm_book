/**
 * Project Name: algorithms_java
 * File Name: HeapSort.java
 * Package Name: com.fanglei.resource.chapter_6.chapter_6_1_heapsort
 * Date: Jun 9, 2017 3:15:08 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_6.chapter_6_1_heapsort;

/**
 * ClassName: Heapsort
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 9, 2017 3:15:08 PM
 */
public class Heapsort
{
	/**
	 * getParent
	 * 	Get the parent node of the node i
	 * 
	 * @param i the current node
	 * @return the parent node
	 */
	private static int getParent(int i)
	{
		return (i - 1)/2;
	}

	/**
	 * getLeftChildren
	 * 	Get the left children node
	 * 
	 * @param i the current node
	 * @return the left children node
	 */
	private static int getLeftChildren(int i)
	{
		return (i*2) + 1;
	}

	/**
	 * getRightChildren
	 *  Get the right children node
	 * 
	 * @param i the current node
	 * @return the right children node
	 */
	private static int getRightChildren(int i)
	{
		return (i*2) + 2;
	}

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
	 * maxHeapify
	 * 
	 * MAX-HEAPIFY(A, i)
	 * 	l = LEFT(i)
	 * 	r = RIGHT(i)
	 * 	if l <= A.heap-size and A[l] > A[i]
	 * 		largest = l;
	 * 	else
	 * 		largest = i;
	 * 	if r <= A.heap-size and A[r] > A[largest]
	 * 		largest = r;
	 * 	if largest != i
	 * 		exchange A[i] with A[largest]
	 * 		MAX-HEAPIFY(A, largest)
	 * 
	 * @param A the array
	 * @param heapSize the heap-size of A
	 * @param i the index
	 */
	private static void maxHeapify(int[] A, int heapSize, int i)
	{
		int l = getLeftChildren(i);
		int r = getRightChildren(i);
		int largest = 0;
		if((l < heapSize) && (A[l] > A[i]))
		{
			largest = l;
		}
		else
		{
			largest = i;
		}
		if((r < heapSize) && (A[r] > A[largest]))
		{
			largest = r;
		}

		if(largest != i)
		{
			swap(A, i, largest);
			maxHeapify(A, heapSize, largest);
		}
	}

	/**
	 * buildMaxHeap
	 * 
	 * BUILD-MAX-HEAP(A)
	 * 	A.heap-size = A.length
	 * for i = floor(A.length/2) downto 1
	 * 		MAX-HEAPIFY(A, i)
	 * 
	 * @param A the array
	 * @param heapSize the heap-size of A
	 */
	private static void buildMaxHeap(int[] A, int heapSize)
	{
		for (int i = getParent(heapSize - 1); i >=0; i--)
		{
			maxHeapify(A, heapSize, i);
		}
	}

	/**
	 * heapsort
	 * 
	 * HEAPSORT(A)
	 * 	BUILD-MAX-HEAP(A)
	 * 	for i = A.length downto 2
	 * 		exchange A[1] with A[i]
	 * 		A.heap-size = A.heap-size - 1
	 * 		MAX-HEAPIFY(A, 1)
	 * 
	 * @param A the array
	 */
	public static void heapsort(int[] A)
	{
		int heapSize = A.length;
		buildMaxHeap(A, heapSize);
		for(int i = A.length -1; i > 0; i--)
		{
			swap(A, 0, i);
			heapSize--;
			maxHeapify(A, heapSize, 0);
		}
	}
}
