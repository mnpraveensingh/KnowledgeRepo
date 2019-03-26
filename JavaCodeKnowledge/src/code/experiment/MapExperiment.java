package code.experiment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExperiment {

	public static void main(String[] args) {
		/*
		 * Map<String,String> map =new HashMap<>(); map.put("MQAC19631",
		 * "Affinion Group"); map.put("MQAC19626", "Unilever"); map.put("MQAC19631",
		 * "Affinion Group"); map.put("MQAC19631", "Affinion Group");
		 * map.put("MQAC19631", "Affinion Group"); map.put("MQAC19631",
		 * "Affinion Group"); map.put("MQAC19631", "Affinion Group");
		 * map.put("MQAC19631", "Affinion Group");
		 * System.out.println("Size ----> "+map.size()); map.forEach((k,v)->{
		 * 
		 * System.out.println("k -----> "+k+"    v ------> "+v); }); String json = "{ ";
		 * // json = json+"\"\":\"\"}"; System.out.println(json); int i = 1 ; for
		 * (Map.Entry<String,String> entry : map.entrySet()) { if(i<map.size()) json =
		 * json+"\""+entry.getKey()+"\" : \""+entry.getValue()+"\" , \n"; else json =
		 * json+"\""+entry.getKey()+"\" : \""+entry.getValue()+"\" } "; ++i; }
		 * Map<String,String> ac = new HashMap<>(); String string =
		 * "\"MQAC19626 : Unilever,MQAC19631 : Affinion Group\"";
		 * System.out.println(string); string = string.replaceAll("\"", "");
		 * System.out.println(string); String[] s = string.split(","); for(String str :
		 * s) { String[] str1 = str.trim().split(":"); ac.put(str1[0].trim(),
		 * str1[1].trim()); }
		 * System.out.println("---------------------------------------------------");
		 * ac.forEach((k,v)->{ System.out.println("k -----> " + k+"   "+k.length() +
		 * "    v ------> " + v +"  "+v.length()); });
		 * System.out.println("json -----> "+json);
		 */
		
		
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
		Map<String,String> map =new HashMap<>();
		List<String> list = new ArrayList<>();
		map.put("accountId", "MQAC19626");
		map.put("engagementModelId", "");
		map.put("horizontalId", "");
		map.put("digitalOrSmacId", "");
		map.put("ownershipId", "");
		map.put("teamSize", "");		
		map.put("projectType", "APPLICATION DEVELOPMENT");
		map.put("vertical", "151001");
		map.put("accountNames", "\"MQAC19626 : Unilever,MQAC19631 : Affinion Group\"");
		map.put("horizontalList", "\"IMTS,DEVOPS,IG Delivery,ENTERPRISE RE-IMAGIN,AMS,SALESFORCE,EIM,ER");
		map.put("D,EAI,DEL EXLCE", "");
		map.put("PGM MGT,Core Solutions,DIGITAL,Package Solutions,Testing\"", "");
		map.put("ownershipList", "\"Independent,Staff Aug,Out Come Based,Co-Managed\"");
		map.put("engagementModelList", "\"HYB,TNM,FPC,FMC\"");
		
		list.add("accountId");list.add("engagementModelId");list.add("horizontalId");
		list.add("digitalOrSmacId");list.add("ownershipId");list.add("teamSize");
		list.add("projectType");list.add("vertical");list.add("accountNames");
		list.add("horizontalList");list.add("ownershipList");list.add("engagementModelList");
		String key = "" ;String value = "" ;
		Map<String,String> newMap = new HashMap<>();
		for(Map.Entry<String,String> entry : map.entrySet()) {
			if(list.contains(entry.getKey())) {				
				key = entry.getKey();
				value = entry.getValue();
				newMap.put(key, value);
			}else {
				value = value+" & "+entry.getKey();
				newMap.replace(key, value);
			}
		}
		System.out.println("newMap ----> ");
		newMap.forEach((k, v) -> {
			System.out.println("k -----> " + k + "    v ------> " + v );
		});

	}

}
