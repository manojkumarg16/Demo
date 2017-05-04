package com.demo.Demo;



import junit.framework.Assert;

public class AppTest {

	 public void testPalindrome()
    {
		App a = new App();
		Assert.assertEquals(454, a.Palindrome());
		System.out.println("Palindrome String : "+a.Palindrome());
    }

}
