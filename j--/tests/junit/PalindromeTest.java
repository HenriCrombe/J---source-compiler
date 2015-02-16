// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import pass.Palindrome;

public class PalindromeTest extends TestCase {
	
	Palindrome p = new Palindrome();
    public void testPalindrome() {
        this.assertEquals(p.palindrome("kayak"), "kayak");
        this.assertEquals(p.palindrome("kayaak"), "");
        this.assertEquals(p.palindrome("AzzzzA"), "AzzzzA");
        //ETC...
    }

}
