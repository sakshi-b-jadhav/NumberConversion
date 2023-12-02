package com.prowings.numberconversion;

import java.util.Arrays;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		int num=21;
		int[]result=convertIntoBinary(num);
		System.out.print(Arrays.toString(result));
		
		
	
				
	}

	public static int[] convertIntoBinary(int num) {
		int [] remainder=new int[5];
		int count=0;
		int rem=0;
		while(num>0)
		{
		  rem=num%2;
		  remainder[count]=rem;
		  
		  num=num/2;
	      count++;
		}
	  return remainder;
	}
			
}


