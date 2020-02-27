package code.experiment;

/**
 * @author M1047624
 *
 */
public class StringSplit {

	public static void main(String[] args) {
		String str = "Pravin Singh (M1047624)";
		String name = str.split("\\(")[0].trim();
		String s = str.split("\\(")[1].split("\\)")[0];
		System.out.println("string  "+s+"   "+name);
		
		String str1 = "CMMI (Maintenance,Testing) + ISO 27K Checklist (MQTM10038_v1)";
		
		String templateName = str1.substring(0, str1.lastIndexOf("("))
				.trim();
		String templateId = str1.trim()
				.substring(str1.lastIndexOf("(") + 1,
						str1.length() - 1).trim();
		
		String spltstr = str.substring(str.lastIndexOf("(") + 1, str.length() - 1).trim();
		System.out.println("spltstr "+spltstr);
		
		String MID = str.trim()
				.substring(str.lastIndexOf("(") + 1,
						str.length() - 1).trim();
		
		System.out.println("templateName   "+templateName);
		System.out.println("templateId   "+templateId);
		
		System.out.println("MID   "+MID);
		
		String s1 = "Laa Cascade 8th cross Roopena Agrahara Bommanhalli police station" ;
		System.out.println(s1.length());
		
		System.out.println(str.replaceAll("[^A-Za-z]", ""));
		System.out.println(str.replaceAll("\\.", ""));

	}

}
