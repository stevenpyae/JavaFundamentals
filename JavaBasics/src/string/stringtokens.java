package string;

import java.util.Scanner;

public class stringtokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		scan.close();
		if (s.length() == 0) {
			System.out.println("0");
		} else {
			String[] sarr = s.split("[ !,?._'@]+");

			System.out.println(sarr.length);
			for (String str : sarr) {
				System.out.println(str);
			}
		}
		// Write your code here.

	}

}
