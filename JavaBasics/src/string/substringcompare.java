package string;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class substringcompare {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        SortedSet<String> ts = new TreeSet<String>();

        for(int i =0; i<=s.length()-k;i++)
        {
        	ts.add(s.substring(i,i+k));
        }

        smallest = ts.first();
        largest = ts.last();
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
