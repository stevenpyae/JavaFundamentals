package introduction;

import java.util.Scanner;

public class stdinouttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        //If you use nextLine() Immediately, string S will take the \n as a string and end the thing
        // Hence you have to next line first. 
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
