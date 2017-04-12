package com.fanglei.chapter_2_1_insertion_sort;

import com.fanglei.utils.Print;

/**
 *
 * ClassName: TestInsertionSort <br/>
 * Description: Test insertion sort algorithm
 *
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 11, 2017 12:58:55 AM
 */
public class TestInsertionSort
{

	/**
	 *
	 * Method Name: main <br/>
	 * Description: Test the insertion sort. <br/>
	 *
	 * @param args
	 *
	 * @author Lei Fang
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] A = { 5, 2, 4, 6, 1, 3 };
		// int[] A = {5};

		Print.println("The raw array A: ");
		Print.println(A);

		// Sort A
		int[] B = InsertionSort.insertionSort(A);

		Print.println("The sorted array B: ");
		Print.println(B);
	}
}
