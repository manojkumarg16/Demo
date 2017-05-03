package com.demo.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	@Test
	 public void testPalindrome()
    {
		App a = new App();
		Assert.assertEquals(454, a.Palindrome());
		System.out.println("Palindrome : "+a.Palindrome());
    }

}
