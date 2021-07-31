/*
Kartik Bhaiya, mentor at Coding Blocks, organized a party for their interns at Coding Blocks. In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, she/he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
Find the stranger (celebrity) in minimum number of questions.

Input Format
First line contains N, number of persons in party. Next line contains the matrix of N x N which represents A knows B when it's value is one.

Constraints
None

Output Format
Print the celebrity ID which is between 0 and N-1. If celebrity is not present then print "No Celebrity".

Sample Input
4
0 0 1 0
0 0 1 0
0 0 0 0
0 0 1 0
Sample Output
2
Explanation
In the given case there are 4 persons in the party let them as A, B, C, D. The matrix represents A knows B when it's value is one. From the matrix, A knows C, B knows C and D knows C. Thus C is the celebrity who doesnot know anyone and it's ID is 2. Hence output is 2.
*/
import java.util.Scanner;
import java.util.Stack;
public class Main
{
    public static void main(String[] args) 
       {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Stack<Integer> st = new Stack<>();
        
        for(int i =0;i<arr.length;i++)
        {
            st.push(i);
        }
        
        while(st.size()>=2)
        {
            int i=st.pop();
            int j=st.pop();
            
            if(arr[i][j]==0)
            {
                st.push(i);
            }
            else
            {
                st.push(j);
            }
        }
        int position=st.pop();
        for(int i=0;i<arr.length;i++)
        {
            if(i!=position)
            {
                if(arr[i][position]==0||arr[position][i]==1)
                {
                    System.out.println("No Celebrity");
                    return;
                }
            }
        }
        System.out.println(position);
    }
}
