package string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternsyntaxchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
			try {
				// If can compile, print out valid, if not catch the exception
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e) {
				// Print out Invalid when you catch the exception
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}

}
