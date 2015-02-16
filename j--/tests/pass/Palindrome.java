package pass;

import java.lang.System;

public class Palindrome{
	public String palindrome (String s){
		char [] st = s.toCharArray();
		int y = s.length()-1;
		int x = 0;
		
		while(y>x){
			int a = (int) st[x];
			int b = (int) st[y];
			if( (!(a>b)) && (!(a< b)) ){
				y=y-1;
				x=x+1;
			}else {
				return "";
			}
		}	
		return s;
	}
}
