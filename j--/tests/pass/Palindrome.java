
// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package pass;

import java.lang.System;

public class Palindrome{
	public String palindrome (String s){
		int y = s.length()-1;
		int x = 0;

		while(y > x){
			if ((s.charAt(x) == s.charAt(y)) == false){
				return "";
			}
			++x;
			y=y-1;
		}
		return s;
	}
}