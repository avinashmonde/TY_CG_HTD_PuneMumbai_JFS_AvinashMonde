package com.capgemini.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {

	public static void main(String[] args) {

		Pattern pat = Pattern.compile("\\d{1,10}");
		Matcher mat = pat.matcher("1234567890");
		System.out.println("For pattern \\d: " + mat.matches());

		Pattern pat2 = Pattern.compile("\\d{10}");
		Matcher mat2 = pat2.matcher("1234567890");
		System.out.println("For pattern \\d: " + mat2.matches());

		Pattern pat1 = Pattern.compile("\\d");
		Matcher mat1 = pat1.matcher("1");
		System.out.println("For pattern \\d: " + mat1.matches());

		Pattern pat11 = Pattern.compile("\\d+");
		Matcher mat11 = pat11.matcher("1132315");
		System.out.println("For pattern \\d: " + mat11.matches());

		Pattern pat111 = Pattern.compile("\\D");
		Matcher mat111 = pat111.matcher("a");
		System.out.println("For pattern \\d: " + mat111.matches());

		Pattern pat1111 = Pattern.compile("\\D+");
		Matcher mat1111 = pat1111.matcher("aaaa");
		System.out.println("For pattern \\d: " + mat1111.matches());

		Pattern pat3 = Pattern.compile("\\d{1,9}");
		Matcher mat3 = pat3.matcher("123456789");
		System.out.println("For pattern \\d: " + mat3.matches());

		Pattern p = Pattern.compile("\\d{0}");
		Matcher m = p.matcher("");
		System.out.println("For pattern \\d: " + m.matches());

		Pattern p1 = Pattern.compile("\\D{10}");
		Matcher m1 = p.matcher("AVINASHMON");
		System.out.println("For pattern \\D: " + m1.matches());

		Pattern p2 = Pattern.compile("\\D{1,10}");
		Matcher m2 = p2.matcher("asdsacabrs");
		System.out.println("For pattern \\D: " + m2.matches());

		Pattern p3 = Pattern.compile("\\s");
		Matcher m3 = p3.matcher(" ");
		System.out.println("For space \\s: " + m3.matches());

		Pattern p4 = Pattern.compile("\\s+");
		Matcher m4 = p4.matcher("    ");
		System.out.println("For space \\s: " + m4.matches());

		Pattern p5 = Pattern.compile("\\S");
		Matcher m5 = p5.matcher("abn");
		System.out.println("For space \\S: " + m5.matches());

		Pattern p6 = Pattern.compile("\\w");
		Matcher m6 = p6.matcher("a");
		System.out.println("For space \\w: " + m6.matches());

		Pattern p7 = Pattern.compile("\\w+");
		Matcher m7 = p7.matcher("abn");
		System.out.println("For space \\w+: " + m7.matches());

		Pattern p8 = Pattern.compile("\\W");
		Matcher m8 = p8.matcher("@");
		System.out.println("For space \\W: " + m8.matches());

		Pattern p9 = Pattern.compile("\\W+");
		Matcher m9 = p9.matcher("@&*");
		System.out.println("For space \\W+: " + m9.matches());
		Pattern p10 =Pattern.compile("\\w+"+"\\@"+"\\w+"+"\\.\\w+");
		Matcher m10 =p10.matcher("avinash@gmail.com");
		System.out.println("For email \\w+\\@\\w+\\.\\w+: "+m10.matches());
	}
}
