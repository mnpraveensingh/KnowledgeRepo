package basicCodes;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringBasics {

	public static void main(String[] args) {
		StringBasics sb = new StringBasics();
		String s = "Pravin";
		String s1 = s.intern();
		s1 = "Pravin";
		System.out.println(s==s1);
		System.out.println(s.hashCode() == s1.hashCode());
		ArrayList<String> arrList = new ArrayList<>(); 
        
	       arrList.add("Ram"); 
	       arrList.add("Shyam"); 
	       arrList.add("arrListice"); 
	       arrList.add("Bob"); 
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

}
