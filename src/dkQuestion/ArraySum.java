package dkQuestion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraySum {
	

	public static int sumArray(int[] input){
		int maxSum = input[0];
		for(int i=1;i<input.length;i++){
			int sum = input[i]+input[i-1];
			if(sum> maxSum){
				maxSum = sum;
			}
		
		}
		
		
		return maxSum;
	}
	
	public static void main(String[] args){
		
		int[] array = {2,4,1,5,6,2,1,3};
		int[] array1 = {6,8,1,5,6,2,1,3};
		int[] array2 = {6,8,1,5,6,2,9,8};
		int[] array3 = {6,6,6,6};
		int[] array4 = {0};
		
		
		System.out.println(sumArray(array));
		System.out.println(sumArray(array1));
		System.out.println(sumArray(array2));
		System.out.println(sumArray(array3));
		System.out.println(sumArray(array4));
	}
}
