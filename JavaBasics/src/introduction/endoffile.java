package introduction;

import java.util.Scanner;

public class endoffile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		do
		{
			String string = sc.nextLine();
			System.out.println(i + " " + string);
			i++;
		}while(sc.hasNext());
		
		sc.close();
	}

}
