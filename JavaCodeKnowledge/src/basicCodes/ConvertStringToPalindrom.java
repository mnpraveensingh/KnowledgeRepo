package basicCodes;

public class ConvertStringToPalindrom {

	public static void main(String[] args) {
		String str = "abcdef"; 
        System.out.println(cost(str));
	}
	static int cost(String str) 
    { 
        // length of string 
        int len = str.length();  
          
        // Iterate from both sides of string. 
        // If not equal, a cost will be there 
        int res = 0; 
        for (int i = 0, j = len - 1; i < j; i++, j--)      
            if (str.charAt(i) != str.charAt(j))  
                res += Math.min(str.charAt(i), str.charAt(j))  
                                - 'a' + 1;      
          
        return res; 
    } 
}
