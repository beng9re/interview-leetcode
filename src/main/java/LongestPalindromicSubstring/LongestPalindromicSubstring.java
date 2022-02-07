package LongestPalindromicSubstring;

import java.util.HashMap;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		int endLength = s.length();
		int currringCount = 0;

		while (currringCount !=  endLength) {
			for (int i = 0; i <= currringCount; i++) {
				int lastIndex =  endLength - (currringCount - i);
				if (palindromeCheck(s.substring(i,lastIndex))) {
					return s.substring(i,lastIndex);
				}
			}
			currringCount++;
		}

		//s.substring(0,endLength);

//		startindex = 0;
//		endIndex = endLength - 1;
//		startindex = 1;
//		endIndex = endLength;

//		startindex = 0;
//		endIndex = endLength - 2;
//
//		startindex = 1;
//		endIndex = endLength - 1;
//
//		startindex = 2;
//		endIndex = endLength - 2;


		return null;
	}


	public boolean palindromeCheck(String s) {

		// 리버스는 성능이 떨어짐
		// CASE 1
//		if (!new StringBuffer(s).reverse().toString().equals(s)) {
//			return false;
//		}

		//CASE 2 뒤에서부터 비교후 판단 -- 267

		//System.out.println("s = " + s);
		for (int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}

		return true;
	}

}
