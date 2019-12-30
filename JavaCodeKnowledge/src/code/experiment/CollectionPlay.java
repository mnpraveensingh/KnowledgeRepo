package code.experiment;

import java.util.ArrayList;
import java.util.List;

public class CollectionPlay {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(String s : list) { // normal execution
			System.out.println(s);
		}
		CollectionPlay CollectionPlay = new CollectionPlay();
		CollectionPlay.main1(list);
		CollectionPlay.main2(list);
		System.out.println("list " + list);
		
		List<String> list_1 = null ;
		for(String s : list_1) { // throw null pointer exception
			System.out.println(s);
		}
	}

	public void main1(List<String> list) {
		list.add("Pravin");
	}

	public void main2(List<String> list) {
		list.add("Singh");
	}

}
