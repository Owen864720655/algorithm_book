/**
 * Project Name: algorithms_java
 * File Name: TestHeapsort.java
 * Package Name: com.fanglei.resource.chapter_6.chapter_6_1_heapsort
 * Date: Jun 9, 2017 3:43:45 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_6.chapter_6_1_heapsort;

import com.fanglei.utils.Print;

/**
 * ClassName: TestHeapsort
 * Description:
 * 	Test the Heapsort algorithm
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 9, 2017 3:43:45 PM
 */
public class TestHeapsort
{
	public static void main(String[] args)
	{
		int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		// int[] A = {5};

		Print.println("The raw array A: ");
		Print.println(A);

		// Sort A
		Heapsort.heapsort(A);

		Print.println("The sorted array B: ");
		Print.println(A);
	}
}
