package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str1 = sc.nextLine();
		System.out.println("enter the string");
		String str2 = sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()==str2.length()) {
				char [] ch = str1.toCharArray();
					char [] c = str2.toCharArray();
					Arrays.sort(ch);
					Arrays.sort(c);
					if(Arrays.equals(ch, c)) {
						System.out.println("anagaram");
					}
					else {
						System.out.println("not an anagaram");
					}
					
				}
			}
		}
		