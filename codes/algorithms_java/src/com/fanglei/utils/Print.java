package com.fanglei.utils;

/**
 *
 * ClassName: Print <br/>
 * Description: Print the variables to console <br/>
 *
 * date: Apr 11, 2017 1:05:08 AM <br/>
 *
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 */
public class Print
{

	/**
	 *
	 * println <br/>
	 * Print one int array A.<br/>
	 *
	 * @param A the int array to be printed
	 *
	 * @author Lei Fang
	 */
	public static void println(int[] A)
	{
		if (A.length == 1)
		{
			System.out.println("[" + A[0] + "]");
		} else
		{
			System.out.print("[");
			for (int i = 0; i < (A.length - 1); i++)
			{
				System.out.print(A[i] + ", ");
			}
			System.out.println(A[A.length - 1] + "]");
		}
	}

	/**
	 *
	 * println <br/>
	 * Print one string .<br/>
	 *
	 * @param A the string to be printed
	 *
	 * @author Lei Fang
	 */
	public static void println(String A)
	{
		System.out.println(A);
	}

}
