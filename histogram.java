/*
Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars.


Input Format
First line contains a single integer N, denoting the number of bars in th histogram.
Next line contains N integers, ith of which, denotes the height of ith bar in the histogram.

Constraints
1<=N<=10^6
Height of each bar in histogram <= 10^9

Output Format
Output a single integer denoting the area of the required rectangle.

Sample Input
5
1 2 3 4 5
Sample Output
9
Explanation
The largest rectangle can be obtained of breadth=3 and length=3. Its starting index is 2 and ending index is 4 and it has a height of 3. Hence area = 3*3 = 9
*/

import java.util.Stack;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
		Stack<Integer> st = new Stack<>();

		st.push(0);
        // next smaller
		long[] nse = new long[n];
		for (int curr = 1; curr < arr.length; curr++) {

			while (!st.isEmpty() && arr[st.peek()] > arr[curr]) {
				nse[st.pop()] = curr;
			}

			st.push(curr);
		}

		while (!st.isEmpty()) {
			nse[st.pop()] = n;
		}
		// previous smaller 
		st = new Stack<>();

		st.push(0); 

		long[] pse = new long[n];
		
		pse[0] = -1;
		
		for(int curr = 1; curr < n; curr++) {
			
			while(!st.isEmpty() && arr[st.peek()] >= arr[curr]) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				pse[curr] = st.peek();
			} else {
				pse[curr] = -1;
			}
			
			st.push(curr);
		}

		long maxArea = 0;
		
		for(int i = 0; i < n; i++) {
			long width = nse[i] - pse[i] - 1;
			long height = arr[i];
			
			long area = width * height;
			
			maxArea = Math.max(area,maxArea);
		}
		
		System.out.println(maxArea);
	}

}
