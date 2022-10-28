package string;

import java.util.Scanner;

public class substringcompare {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0,k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i =0; i<=s.length()-k;i++)
        {
        	if(s.substring(i, i+k).compareTo(smallest)<=0)
        	{
        		smallest = s.substring(i, i+k);
        	}
        	if(s.substring(i, i+k).compareTo(largest)>=0)
        	{
        		largest = s.substring(i, i+k);
        	}
        	
        }
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
