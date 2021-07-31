/*
Sanju needs your help! He gets a list of employees with their salary. The maximum salary is 100.

Sanju is supposed to arrange the list in such a manner that the list is sorted in decreasing order of salary. And if two employees have the same salary, they should be arranged in lexicographical manner such that the list contains only names of those employees having salary greater than or equal to a given number x.

Help Sanju prepare the same!

Input Format
On the first line of the standard input, there is an integer x. The next line contans integer N, denoting the number of employees. N lines follow, which contain a string and an integer, denoting the name of the employee and his salary.

Constraints
1 <= N <= 10^5 1 <= | Length of the name | <= 100 1 <= x, salary <= 100

Output Format
You must print the required list.

Sample Input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86
Sample Output
Bob 99
Alice 86
Suzy 86
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        String employee[]=new String[n];
        int salary[]= new int[n];
    
    	for(int i=0;i<n;i++)
    	{
    	    employee[i]=sc.next();
    	    salary[i]=sc.nextInt();  
    	}
	
	
    	int temp;
    	String temp1;
	
	    for(int i=0;i<n-1;i++)
	    {
	        for(int j=0;j<n-i-1;j++)
	        {
	          if(salary[j]==salary[j+1])
	            {
	                if(employee[j].compareTo(employee[j+1])>0)
	                {
	                    temp=salary[j];
	                    salary[j]=salary[j+1];
	                    salary[j+1]=temp;
	             
	                    temp1=employee[j];
	                    employee[j]=employee[j+1];
	                    employee[j+1]=temp1;
	                }
	            }
	         if(salary[j]<salary[j+1])
	         {
	             temp=salary[j];
	             salary[j]=salary[j+1];
	             salary[j+1]=temp;
	             
	             temp1=employee[j];
	             employee[j]=employee[j+1];
	             employee[j+1]=temp1;
	         }
	        
	        }
       	}
	
    	for(int i=0;i<n;i++)
    	{
    	    if(salary[i]<x)
    	    {
    	        break;
    	    }
    	    else
    	    {
    	    System.out.println(employee[i]+" "+salary[i]);
    	    }
    	}
    }
}
