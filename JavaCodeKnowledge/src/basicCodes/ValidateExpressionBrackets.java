package basicCodes;

import java.util.Stack;

public class ValidateExpressionBrackets {

	public static void main(String[] args) {
		String str = "({a+b})";
		char[] ch = str.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (char ch1 : ch) {
			if (ch1 == '(' || ch1 == '{' || ch1 == '[') {
				st.push(ch1);
			} else if (ch1 == ')' || ch1 == '}' || ch1 == ']') {
				char ch2 = st.pop();
				if (ch2 == '(' && ch1 == ')') {
					continue;
				} else if (ch2 == '{' && ch1 == '}') {
					continue;
				} else if (ch2 == '[' && ch1 == ']') {
					continue;
				} else {
					break;
				}
			}
		}
		if (st.size() > 0) {
			System.out.println("Not Balanced");
		} else {
			System.out.println("Balanced");
		}
	}
}
