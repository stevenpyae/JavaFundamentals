package string;

import java.util.Scanner;

public class stringreversepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int lastindex = A.length()-1;
        boolean flag= true;
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i < A.length()/2; i++)
        {
        	//System.out.println(A.charAt(lastindex));
        	if(A.charAt(i) != A.charAt(lastindex))
        	{
        		flag = false;
        	}
        	lastindex--;
        }
        
        if (flag)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
	}

}
