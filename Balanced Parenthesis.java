/*
You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

Input Format
A string of '(' , ')' , '{' , '}' and '[' , ']' .

Constraints
1<=|S|<=10^5

Output Format
Print "Yes" if the brackets are balanced and "No" if not balanced.

Sample Input
(())
Sample Output
Yes
Explanation
(()) is a balanced string.
*/

import java.util.Stack;
import java.util.*;
public class Main {
	private static boolean sol(String p) {
		Stack<Character> s = new Stack<>();
		for(int i = 0; i < p.length(); i++) {
			char ci = p.charAt(i);
			
			if(ci == '[' || ci == '{' || ci == '(') 
			{
				s.push(ci);
			} 
			else if(ci == ')' || ci == '}' || ci == ']')
			{
				
				if(s.isEmpty()) 
				{
					return false;
				} 
				
				char top = s.pop();
				
				if(top == '(' && ci == ')') 
				{
					continue;
				} 
				
				if(top == '{' && ci == '}') 
				{
					continue;
				} 
				
				if(top == '[' && ci == ']') 
				{
					continue;
				}
				
				return false; 
			}
		}
		if(s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
		
		if (sol(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
