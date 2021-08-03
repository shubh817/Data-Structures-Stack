import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++)
        {
		    String str = sc.next();
    		Stack<Integer> st = new Stack<>();
    		for(int i = 0; i <= str.length(); i++) {
    			st.push(i + 1);
    			
    			if(i == str.length() || str.charAt(i)%2 == 0) {
    				while(!st.isEmpty()) {
    					System.out.print(st.pop());
    				}
    			}
    		}
    		System.out.println();
        }
	}

}
