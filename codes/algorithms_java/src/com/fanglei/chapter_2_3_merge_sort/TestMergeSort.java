/**
 * Project Name: algorithms_java
 * File Name: TestMergeSort.java
 * Package Name: com.fanglei.chapter_2_3_merge_sort
 * Date: Apr 12, 201711:04:32 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */
/**
 * Project Name: algorithms_java
 * File Name: TestMergeSort.java
 * Package Name: com.fanglei.chapter_2_3_merge_sort
 * Date: Apr 12, 2017 11:04:32 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.chapter_2_3_merge_sort;

import com.fanglei.utils.Print;

/**
 * ClassName: TestMergeSort
 * Description:
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Apr 12, 2017 11:04:32 PM
 */
public class TestMergeSort
{

	public static void main(String[] arg)
	{
		int[] A = { 5, 2, 4, 6, 1, 3 };

		Print.println("The raw array A: ");
		Print.println(A);

		// Sort A
		MergeSort.mergeSort(A, 0, A.length-1);

		Print.println("The sorted array B: ");
		Print.println(A);
	}

}
