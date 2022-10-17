package introduction;

import java.util.Scanner;

public class stdinout {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Task: read 3 integers from stdin and print them
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		scan.close();

	}

}
