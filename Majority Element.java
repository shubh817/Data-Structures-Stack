/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Constraints
Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1
Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
*/

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int i : ar) {
			int value = freqMap.getOrDefault(i, 0);
			value++;
			freqMap.put(i, value);
		}
		int minVal =  n / 2;
		for(int key : freqMap.keySet()) {
			if(freqMap.get(key) > minVal) {
				System.out.println(key);
			}	
		}
	}
}
