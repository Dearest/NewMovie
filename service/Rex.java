package com.movie.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rex {
	public Rex() {
		// TODO Auto-generated constructor stub
	}
	
	public static String matchRex(String result){
		String cbraces1 = null;
		System.out.println("进去正则匹配");
		String re1=".({*.})";	// Non-greedy match on filler

	    Pattern p = Pattern.compile(re1);
	    Matcher m = p.matcher(result);
	    if (m.find())
	    {
	        cbraces1=m.group(1);
	        System.out.print("("+cbraces1.toString()+")"+"\n");
	    }
		return cbraces1;
	  }
}
