package Introduction;

import java.util.Scanner;

public class ifelse {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
        int N = scanner.nextInt();
        // Below line skips the input if the input is not an integer
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2 != 0) {
        	System.out.println("Weird");
        }
        else
        {
        	if(N>=2 && N <=5) {
        		System.out.println("Not Weird");
        	}
        	if(N>=6 && N<=20) {
        		System.out.println("Weird");
        	}
        	if(N >20)
        	{
        		System.out.println("Not Weird");
        	}
        }
        scanner.close();

	}

}
