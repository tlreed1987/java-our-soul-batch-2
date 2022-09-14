package com.lambda;

public class Main {
	public static int sum(int[]numbers, Calculator c) {
		int total=0;
		for(int v:numbers) {
			if(c.test(v)) {
				total+=v;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		//sum of all even numbers
		int result=sum(numbers,n->n%2==0);
		System.out.println(result);
		
		//sum of all odd numbers
		Calculator c= n-> n%2!=0;

		
		result=sum(numbers,c);
		System.out.println(result);
		
		
		//sum of all even numbers
		 result=sum(numbers,n-> true);
		System.out.println(result);
		
		//sum of all  numbers > 5
		 result=sum(numbers,n-> n>5);
		System.out.println(result);
	}

}
