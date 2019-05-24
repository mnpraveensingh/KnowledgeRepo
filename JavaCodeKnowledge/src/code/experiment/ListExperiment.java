package code.experiment;

import java.util.ArrayList;
import java.util.List;

import constant.Constant;

public class ListExperiment {

	public static void main(String[] args) {
		 List<String> l = new ArrayList<>(); 
	        l.add("Business Relationship Management (BRM)"); 
	        l.add("Generic Process Governance");
	        l.add("Capacity Management");
//	        l.add("Capacity");
	         
	        System.out.println(Constant.GREEN_BOLD+l); 
	        
	        List<String> l2 = new ArrayList<>(); 
	        l2.add("Business Relationship Management (BRM)"); 
	        l2.add("Capacity Management"); 
//	        l2.add("Critical Artifacts"); 
	        l2.add("Generic Process Governance"); 
	        System.out.println(Constant.GREEN_BOLD+l2); 
	        if(l.size() != l2.size()) {
	        	System.out.println(Constant.RED_BOLD+"Not equal");	 
	        }else if(l.size() == l2.size()){
	        	int cnt = 0 ;
	        	for(int i=0 ; i<l.size() ; i++) {
	        		if(!l2.contains(l.get(i))) {
	        			++cnt;
	        			System.out.println(Constant.RED_BOLD+"Not equal");	
	        		}
	        	}
	        	if(cnt==0)System.out.println(Constant.GREEN_BOLD+"Equal");
	        } 
	       
	}

}
