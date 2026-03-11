/*
Author: Alex Liang
Lesson: 2.2 - More Functions
Date Created: March 11, 2026
Date Last Modified: March 11, 2026
*/


public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isEven(int num){
		return num%2 == 0;
	}
	
	public static boolean isOdd(int num){
		return num%2 != 0;
	}
	
	public static boolean isPositive(int num){
		return num > 0;
	}

	public static boolean isNegative(int num){
		return num < 0;
	}

	public static int combinedLength(String word1, String word2){
		int cLen = word1.length() + word2.length();
		return cLen;
	}
}
