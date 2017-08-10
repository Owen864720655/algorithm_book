/**
 * Project Name: algorithms_java
 * File Name: TestQuickSort.java
 * Package Name: com.fanglei.resource.chapter_7.chapter_7_1_quicksort
 * Date: Jun 10, 2017 11:53:05 AM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_7.chapter_7_1_quicksort;

import com.fanglei.utils.Print;

/**
 * ClassName: TestQuickSort
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 10, 2017 11:53:05 AM
 */
public class TestQuickSort
{

	public static void main(String[] args)
	{
		int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		// int[] A = {5};

		Print.println("The raw array A: ");
		Print.println(A);

		// Sort A
		Quicksort.quicksort(A, 0, A.length - 1);

		Print.println("The sorted array B: ");
		Print.println(A);
	}
}
