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
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}

}
