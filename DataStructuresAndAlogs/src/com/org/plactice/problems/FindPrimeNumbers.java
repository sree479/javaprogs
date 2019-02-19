package com.org.plactice.problems;

import java.util.ArrayList;
import java.util.List;

/*Problem Statement*/
/*
You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000

SAMPLE INPUT       SAMPLE OUTPUT 
9			       2 3 5 7



*/
public class FindPrimeNumbers {

	public static void main(String[] args) {
		int n;
		//Scanner s = new Scanner(System.in);
		//System.out.println("enter value:");
		//n = s.nextInt();
		n=100000;
		boolean flag = false;
		System.out.println("output");
		List<Integer> output=new ArrayList<>();
		for (int i = 2; i <=n; i++) {
			
			flag = false;
			for (int j = 2; j <=Math.sqrt(i); j++) {
				//System.out.println();
				if (i % j == 0 ) {
					flag = true;
					//System.out.println("log"+j);
					break;
				}

			}
			if (flag == false) {
				output.add(i);
				
			}
		}
		System.out.print(output);

	}
}
