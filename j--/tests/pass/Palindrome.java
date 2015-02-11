// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package pass;

import java.lang.System;

public class Palindrome{
	public String palindrome (String s){
		int y = s.length()-1;
		int x = 0;
		
		while(x < y){
			if(s[x] != s[y]){
				return "";
			}
			x++;
			y--;
		}	
		return s;
	}
}
