/*
Kartik bhaiya gave monu an array 'nums' of n elements and an integer k .Find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k . monu is not good in maths help monu to solve the problem.
Return true if nums[i] = nums[j] and the absolute difference between i and j is at most k,otherwise return false.

Input Format
First line contains integer n as size of array.
Next N lines contains element of array.
Last line contains value of k.

Constraints
None

Output Format
The output will be of the boolean form (true/false).

Sample Input
4
1 
2 
3 
1
3
Sample Output
true
Explanation
None
*/

import java.util.*;
public class Main
{
	public static boolean containsDuplicate(int[] nums,int k) {
    for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < i; ++j) {
            if (nums[j] == nums[i] && Math.abs(i-j)<=k) 
                return true;  
        }
    }
    return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(containsDuplicate(ar, k));
    }
}
