package introduction;

import java.util.Scanner;

@SuppressWarnings("resource")
public class staticinitializerblk {

	public static int breadth;
	public static int height;
	public static boolean flag = true;
	
	static {
		Scanner sc = new Scanner(System.in);
		breadth = sc.nextInt();
		height = sc.nextInt();
		try {
			if(breadth<=0||height<=0)
			{
				flag = false;
				var exception = new Exception("Breadth and height must be positive");
				throw exception;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag)
		{
			int area = breadth*height;
			System.out.println(area);
		}
	}


}
