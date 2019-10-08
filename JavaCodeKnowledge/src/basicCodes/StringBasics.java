package basicCodes;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringBasics {

	public static void main(String[] args) {
		StringBasics sb = new StringBasics();
		String s = "   Pravin     Singh   ";
		
		removeExtraSpaces(s);
		
		String s1 = s.intern();
		System.out.println("s1 "+s1+"  before s.contentEquals(s1)  "+s.contentEquals(s1));
		s1 = "Pravin";
		System.out.println("s1 changed "+s1+"  after s.contentEquals(s1)  "+s.contentEquals(s1));
		System.out.println(s==s1);
		System.out.println(s.hashCode() == s1.hashCode());
		
//		String Joiner Use Case
		ArrayList<String> arrList = new ArrayList<>(); 
	       arrList.add("Ram");arrList.add("Shyam"); 
	       arrList.add("arrListice");arrList.add("Bob"); 
	       StringJoiner sj = new StringJoiner(",");
		for(String str : arrList) {
			sj.add(str);
		}
		System.out.println(sj.toString());
		
//		sb.doSomething(null);
	}
	
	/*
	 * public static void doSomething(NullPointerException npe) {
	 * System.out.println("NullPointerException"); }
	 * 
	 * public void doSomething(Exception e) { System.out.println("Exception"); }
	 */
	
	public void doSomething(Object obj) {
		System.out.println("Exception");
	}
	
	public static void doSomething(String str) {
		System.out.println("Exception");
	}
	
	public void doSomething(StringBuilder stringBuilder) {
		System.out.println("Exception");
	}
	
	public static void removeExtraSpaces(String str) {
		System.out.println("before  "+str.length()+"   "+str);
		str = str.trim() ;
		System.out.println("after  "+str.length()+"   "+str);
		str = str.replaceAll("\\s+"," ") ;
		System.out.println("after next  "+str.length()+"   "+str);
	}

}
