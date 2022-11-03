package string;

import java.util.Scanner;

public class myregexforIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
	}

}
class MyRegex {
	
	/*A simple approach is:
	1) \\d{1,2} catches any one or two digit number
	2) (0|1)\\d{2} catches any three digit number starting with 0 or 1. 000-199
	3) 2[0-4]\\d catches numbers between 200 and 249.
	4) 25[0-5] catches numbers between 250 and 255.

Note that \d represents digits in regular expressions, same as [0-9]*/
	String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	
}
