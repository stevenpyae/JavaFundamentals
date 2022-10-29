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
        /*Loop through until half of the strings */
        for(int i = 0; i < A.length()/2; i++)
        {
        	//If current character not equals to the corresponding character from the back
        	if(A.charAt(i) != A.charAt(lastindex))
        	{
        		//put flag to false, and say it is not palindrome.
        		flag = false;
        	}
        	lastindex--;
        }
        
        //tenary  if else expression 
        String s = ((flag) ? "Yes" : "No");
        System.out.println(s);
        
	}

}
