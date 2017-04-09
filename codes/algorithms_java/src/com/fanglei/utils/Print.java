package com.fanglei.utils;

/**
 * Print the variables to console
 * 
 * @author Owen
 *
 */
public class Print 
{
	/**
	 * Print one Array A
	 * @param A the array to be printed
	 */
	public static void println(int[] A)
	{
		if (A.length == 1)
		{
			System.out.println("[" + A[0] + "]");
		}
		else
		{ 
			System.out.print("[");
			for (int i = 0; i < A.length - 1; i ++)
				System.out.print(A[i] + ", ");
			System.out.println(A[A.length - 1] + "]");
		}
	}
	
	/**
	 * Print one string
	 * @param A the string to be printed
	 */
	public static void println(String A)
	{
		System.out.println(A);		
	}

}
