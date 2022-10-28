package string;

import java.util.HashMap;
import java.util.Scanner;

public class anagramshashmap {
	static boolean isAnagram(String a, String b) {

		HashMap<Character, Integer> hsmap = new HashMap<>();
		HashMap<Character, Integer> hsmap1 = new HashMap<>();

		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length()) {
			return false;
		}
		
		for (int i = 0; i < a.length(); i++) {
			if (hsmap.containsKey(a.charAt(i))) {
				Integer frequency = hsmap.get(a.charAt(i));
				hsmap.put(a.charAt(i), ++frequency);
			} else {
				// Put into the hashmap as first occurance
				hsmap.put(a.charAt(i), 1);
			}
		}
		
		for (int i = 0; i < b.length(); i++) {
			if (hsmap1.containsKey(b.charAt(i))) {
				Integer frequency = hsmap1.get(b.charAt(i));
				hsmap1.put(b.charAt(i), ++frequency);
			} else {
				// Put into the hashmap as first occurance
				hsmap1.put(b.charAt(i), 1);
			}
		}
		return hsmap.equals(hsmap1);
		// Complete the function
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
