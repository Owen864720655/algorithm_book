/**
 * Project Name: algorithms_java
 * File Name: Maximum_Subarray_Problem.java
 * Package Name: com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem
 * Date: May 11, 201711:01:27 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn All Rights Reserved.
 * 
 */
/**
 * Project Name: algorithms_java
 * File Name: Maximum_Subarray_Problem.java
 * Package Name: com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem
 * Date: May 11, 2017 11:01:27 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com All Rights Reserved.
 * 
 */

package com.fanglei.resource.chapter4.chapter_4_1_maximum_subarray_problem;


/**
 * ClassName: MaximumSubarrayProblem
 * Description: Find from an array the non-empty and contiguous subarray whose
 * values have the largest sum
 * 
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: May 11, 2017 11:01:27 PM
 */
public class MaximumSubarrayProblem
{
	/**
	 * 最小值
	 */
	public static int MIN_VALUE = -10000;

	/**
	 * 
	 * ClassName: Result
	 * Description: The result of the MaximumSubarrayProblem
	 * 
	 * @author Lei Fang
	 * @email fanglei@pku.edu.cn
	 * @version MaximumSubarrayProblem
	 * @date: May 26, 2017 10:18:59 PM
	 */
	public static class Result
	{
		/**
		 * the left index
		 */
		public int low;

		/**
		 * the right index
		 */
		public int high;

		/**
		 * the sum of the subarray
		 */
		public int sum;
	}

	/**
	 * Method Name: findMaxCrossingSubarray
	 * Description:
	 * FIND-MAX-CROSSING-SUBARRAY(A, low, mid, high)
	 * 	left-sum = -infinity
	 * 	sum = 0
	 * 	for i = mid downto low
	 * 		sum = sum + A[i]
	 * 		if sum > left-sum
	 * 			left-sum = sum
	 * 			max-left = i
	 * 	right-sum = -infinity
	 * 	sum = 0
	 * 	for j = mid + 1 to high
	 * 		sum = sum + A[j]
	 * 		if sum > right-sum
	 * 			right-sum = sum
	 * 			max-right = j
	 * 	return (max-left, max-right, left-sum + right-sum)
	 * 
	 * @param A the array
	 * @param low the lowest index of subarray
	 * @param mid the midpoint
	 * @param high the highest index of subarray
	 * @return
	 *
	 * @author Lei Fang
	 */
	private static Result findMaxCrossingSubarray(int A[], int low, int mid, int high)
	{
		Result result = new Result();

		int left_sum = MIN_VALUE;
		int sum = 0;

		for (int i = mid; i >= low; i--)
		{
			sum += A[i];
			if( sum > left_sum)
			{
				left_sum = sum;
				result.low = i;
			}
		}

		int right_sum  = MIN_VALUE;
		sum = 0;
		for (int j = mid + 1; j <= high; j++)
		{
			sum += A[j];
			if( sum > right_sum)
			{
				right_sum = sum;
				result.high = j;
			}
		}

		result.sum = left_sum + right_sum;
		return result;
	}

	/**
	 * Method Name: findMaximumSubarray
	 * Description:
	 * FIND_MAXIMUM_SUBARRAY(A, low, high)
	 * 	if high == low
	 * 		return (low, high, A[low])
	 * 	else mid = ceil((low + high)/2)
	 * 		(left-low, left-high, left-sum) = FIND-MAXIMUM-SUBARRAY(A, low, mid)
	 * 		(right-low, right-high, right-sum) = FIND-MAXIMUM-SUBARRAY(A, mid + 1, high)
	 * 		(cross-low, cross-high, cross-sum) = FIND-MAX-CROSSING-SUBARRAY(A, low, mid, high)
	 * 		if left_sum >= right_sum and left_sum >= cross_sum
	 * 			return (left-low, left-high, left-sum)
	 * 		elseif right-sum >= left-sum and right-sum >= cross_sum
	 * 			return (right-low, right-high, right-sum)
	 * 		else
	 * 			return (cross-low, cross-high, cross-sum)
	 * 
	 * @param A the array
	 * @param low the lowest index
	 * @param high the highest index
	 * @return the maximum subarray
	 *
	 * @author Lei Fang
	 */
	private static Result findMaximumSubarray(int[] A, int low, int high)
	{

		if (high == low)
		{
			Result result = new Result();

			result.low = low;
			result.high = high;
			result.sum = A[low];

			return result;
		}
		else
		{
			int mid = (low + high) / 2;
			Result result_left = findMaximumSubarray(A, low, mid);
			Result result_right = findMaximumSubarray(A, mid + 1, high);
			Result result_cross = findMaxCrossingSubarray(A, low, mid, high);

			if((result_left.sum >= result_right.sum) && (result_left.sum >= result_cross.sum))
			{
				return result_left;
			}
			else if ((result_right.sum >= result_left.sum) && (result_right.sum >= result_cross.sum))
			{
				return result_right;
			}
			else
			{
				return result_cross;
			}
		}
	}

	/**
	 * Method Name: find
	 * Description: Find the maximum subarray
	 * 
	 * @param A the array
	 * @return the subarray
	 *
	 * @author Lei Fang
	 */
	public static Result find(int[] A)
	{
		int low = 0;
		int high = A.length - 1;
		return findMaximumSubarray(A, low, high);
	}



}
