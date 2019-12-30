package code.experiment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.springframework.cglib.core.CollectionUtils;

public class StringManipulation {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		List<String> list = new ArrayList<>();
		list.add("Pravin");
		list.add("Singh");
		String commaSeparatedRGB = list.stream()
			      .map(color -> color.toString())
			      .collect(Collectors.joining(","));
		
		list.forEach(action -> {
			joiner.add(action);
		});
		System.out.println(joiner.toString());
		System.out.println(commaSeparatedRGB);
		
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add(1);set1.add(2);set1.add(3);
		set2.add(3);set2.add(2);set2.add(5);
		
		Set<Integer> common = new HashSet<Integer>(set1);
		Set<Integer> unCommon = new HashSet<Integer>(set1);
		unCommon.addAll(set2);
		System.out.println("before "+common.size());
		common.retainAll(set2);
		System.out.println("after "+common.size());
		System.out.println("common "+common);
		
		
		System.out.println("before "+unCommon.size());
		unCommon.removeAll(common);
		System.out.println("after "+unCommon.size());
		System.out.println("unCommon "+unCommon);
		
	}

}
