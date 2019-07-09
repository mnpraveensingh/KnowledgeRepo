package code.experiment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ListExperiment {

	public static void main(String[] args) throws ParseException {
		
		List<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) 
            list.add(i); 
        System.out.println(list);
        String s=new String("Pravin");
        String s1=new String("Pravin");
        if(s.equals(s1)) {
        	System.out.println("true  "+s.hashCode()+"   "+s1.hashCode());
        }else {
        	System.out.println("false  "+s.hashCode()+"   "+s1.hashCode());
        }
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); String
		 * strDate = formatter.format(new Date()); System.out.println(strDate);
		 * 
		 * SimpleDateFormat formatter5=new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		 * 
		 * Date date = (Date)formatter5.parse("Wed May 29 15:29:55 IST 2019");
		 * System.out.println(date);
		 * 
		 * Date date1= formatter5.parse("Mon Jul 01 18:53:02 IST 2019");
		 * System.out.println(formatter.format(date1));
		 */
	    
	    
		/*
		 * LocalDateTime dateTime = LocalDateTime.parse
		 * ("Wed May 29 15:29:55 IST 2019"); String s =
		 * dateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
		 * System.out.println("dateTime    "+dateTime+"    s   "+s);
		 */
		 
		
		/*
		 * UserInfo user = new UserInfo(); if(user.getFirstName() == null ) {
		 * System.out.println("true"); }
		 * 
		 * List<UserInfo> list = new ArrayList<>(); list.add(new UserInfo("1",
		 * "liquidweb.com", "80000")); list.add(new UserInfo("2", "linode.com",
		 * "90000")); list.add(new UserInfo("3", "digitalocean.com", "120000"));
		 * list.add(new UserInfo("4", "aws.amazon.com", "200000")); list.add(new
		 * UserInfo("5", "mkyong.com", "1"));
		 * 
		 * Map<String, String> result1 = list.stream().collect(
		 * Collectors.toMap(UserInfo::getUserId, UserInfo::getFirstName));
		 * 
		 * System.out.println("Result 1 : " + result1);
		 * 
		 * // key = name, value - websites Map<String, String> result2 =
		 * list.stream().collect( Collectors.toMap(UserInfo::getUserId,
		 * UserInfo::getFirstName));
		 * 
		 * System.out.println("Result 2 : " + result2);
		 * 
		 * // Same with result1, just different syntax // key = id, value = name
		 * Map<String, String> result3 = list.stream().collect( Collectors.toMap(x ->
		 * x.getUserId(), x -> x.getFirstName()));
		 * 
		 * System.out.println("Result 3 : " + result3);
		 */
		
		/*
		 * String s = "Pravin Singh (M1047624)"; String s1 = "#qGp_MQQG10090_v1";
		 * 
		 * System.out.println(s.substring(s.lastIndexOf("(") + 1, s.length() - 1));
		 * System.out.println(s.split("\\(")[1].split("\\)")[0]);
		 * System.out.println(s1.split("_")[1]); List<Integer> list = new ArrayList<>();
		 * list.add(10); list.add(50); list.add(30); list.add(60); list.add(20);
		 * list.add(90); Collections.sort(list);
		 * System.out.println("printing list in descending order...."+list); Comparator
		 * cmp = Collections.reverseOrder(); Collections.sort(list,cmp);
		 * System.out.println("printing list in descending order...."+list);
		 */  
		/*to convert list<Object> to List<String
		 * List<String> Object = list<object>.stream() .map(s ->
		 * s.getSurveyTypeDesc()).collect(Collectors.toList());
		 */
		
		/*
		 * int p = 784; p = 784/50 + 1; System.out.println(p); List<UserInfo> l = new
		 * ArrayList<>(); l.add(new UserInfo("userId" , "firstName" , "lastName"));
		 * l.add(new UserInfo("userId" , "firstName" , "lastName")); l.add(new
		 * UserInfo("userId" , "firstName" , "lastName")); // l.add("Capacity");
		 * 
		 * System.out.println(Constant.GREEN_BOLD+l);
		 * 
		 * List<String> l2 = new ArrayList<>();
		 * l2.add("Business Relationship Management (BRM)");
		 * l2.add("Capacity Management"); // l2.add("Critical Artifacts");
		 * l2.add("Generic Process Governance");
		 * System.out.println(Constant.GREEN_BOLD+l2); if(l.size() != l2.size()) {
		 * System.out.println(Constant.RED_BOLD+"Not equal"); }else if(l.size() ==
		 * l2.size()){ int cnt = 0 ; for(int i=0 ; i<l.size() ; i++) {
		 * if(!l2.contains(l.get(i))) { ++cnt;
		 * System.out.println(Constant.RED_BOLD+"Not equal"); } }
		 * if(cnt==0)System.out.println(Constant.GREEN_BOLD+"Equal"); }
		 */
	       
	}

}
