/**
 * Project Name: algorithms_java
 * File Name: TestBubbleSort.java
 * Package Name: com.fanglei.resource.chapter_2.chapter_2_problems_bubble_sort
 * Date: Apr 15, 201710:04:13 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */
/**
 * Project Name: algorithms_java
 * File Name: TestBubbleSort.java
 * Package Name: com.fanglei.resource.chapter_2.chapter_2_problems_bubble_sort
 * Date: Apr 15, 2017 10:04:13 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter_2.chapter_2_problems_bubble_sort;

import com.fanglei.utils.Print;

/**
 * ClassName: TestBubbleSort
 * Description: test bubble-sort algorithm
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 15, 2017 10:04:13 PM
 */
public class TestBubbleSort
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Define A
		int[] A = { 5, 2, 7, 99, 4, 6, 1, 3 };

		Print.println("The raw array A: ");
		Print.println(A);

		// Sort A
		BubbleSort.bubbleSort(A);

		Print.println("The sorted array B: ");
		Print.println(A);
	}

}
