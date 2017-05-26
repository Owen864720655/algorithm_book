/**
 * Project Name: algorithms_java
 * File Name: TestMaximuSubarrayProblem.java
 * Package Name: com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem
 * Date: May 26, 201710:58:58 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem;

import com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem.MaximumSubarrayProblem.Result;

/**
 * ClassName: TestMaximuSubarrayProblem
 * Description: Test MaximumSubarrayProblem
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: May 26, 2017 10:58:58 PM
 */
public class TestMaximumSubarrayProblem
{

	public static void main(String args[])
	{
		// Define the array A
		int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4};

		// find(A)
		Result result = MaximumSubarrayProblem.find(A);

		// Print the result
		System.out.println(result.low + ", " + result.high + ", " + result.sum);
	}

}
