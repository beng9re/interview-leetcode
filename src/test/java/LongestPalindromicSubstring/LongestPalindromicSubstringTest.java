package LongestPalindromicSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {



	@Test
	void 회문을_판별한다_테스트() {
		LongestPalindromicSubstring longestPalindromicSubstring =  new LongestPalindromicSubstring();
		assertTrue(longestPalindromicSubstring.palindromeCheck("a"));
		assertTrue(longestPalindromicSubstring.palindromeCheck("aa"));
		assertTrue(longestPalindromicSubstring.palindromeCheck("aba"));
		assertFalse(longestPalindromicSubstring.palindromeCheck("abb"));
		assertFalse(longestPalindromicSubstring.palindromeCheck("abc"));
		assertTrue(longestPalindromicSubstring.palindromeCheck("adada"));
	}
	@Test
	void longestPalindrome() {
		LongestPalindromicSubstring longestPalindromicSubstring =  new LongestPalindromicSubstring();
		assertEquals(longestPalindromicSubstring.longestPalindrome("aaas"),"aaa");
		assertEquals(longestPalindromicSubstring.longestPalindrome("aba"),"aba");
		assertEquals(longestPalindromicSubstring.longestPalindrome("cbbd"),"bb");
		assertEquals(longestPalindromicSubstring.longestPalindrome("babad"),"bab");


		String testdata = "jrjnbctoqgzimtoklkxcknwmhiztomaofwwzjnhrijwkgmwwuazcowskjhitejnvtblqyepxispasrgvgzqlvrmvhxusiqqzzibcyhpnruhrgbzsmlsuacwptmzxuewnjzmwxbdzqyvsjzxiecsnkdibudtvthzlizralpaowsbakzconeuwwpsqynaxqmgngzpovauxsqgypinywwtmekzhhlzaeatbzryreuttgwfqmmpeywtvpssznkwhzuqewuqtfuflttjcxrhwexvtxjihunpywerkktbvlsyomkxuwrqqmbmzjbfytdddnkasmdyukawrzrnhdmaefzltddipcrhuchvdcoegamlfifzistnplqabtazunlelslicrkuuhosoyduhootlwsbtxautewkvnvlbtixkmxhngidxecehslqjpcdrtlqswmyghmwlttjecvbueswsixoxmymcepbmuwtzanmvujmalyghzkvtoxynyusbpzpolaplsgrunpfgdbbtvtkahqmmlbxzcfznvhxsiytlsxmmtqiudyjlnbkzvtbqdsknsrknsykqzucevgmmcoanilsyyklpbxqosoquolvytefhvozwtwcrmbnyijbammlzrgalrymyfpysbqpjwzirsfknnyseiujadovngogvptphuyzkrwgjqwdhtvgxnmxuheofplizpxijfytfabx";
		System.out.println("testdata = " + testdata);
		System.out.println("longestPalindromicSubstring.longestPalindrome(testdata) = " + longestPalindromicSubstring.longestPalindrome(testdata));
	}
}