/*

Given an array of n elements, check if the array contains any duplicates.
The function should return true if there are duplicates,otherwise return false.

Input Format
First line contains integer n as size of array.
Next line contains a n integer as element of array.

Constraints
None

Output Format
The output will be of the boolean form.

Sample Input
4
1 2 3 1
Sample Output
true
Explanation
None
*/

import java.util.*;
public class Main
{
	public static boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < i; ++j) {
            if (nums[j] == nums[i]) return true;  
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
        System.out.println(containsDuplicate(ar));
    }
}
