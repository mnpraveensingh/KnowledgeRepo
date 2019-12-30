package code.experiment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListExperiment {

	public static void main(String[] args) throws ParseException {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		System.out.println(list);
		String s = new String("Pravin");
		String s1 = new String("Pravin");
		if (s.equals(s1)) {
			System.out.println("true  " + s.hashCode() + "   " + s1.hashCode());
		} else {
			System.out.println("false  " + s.hashCode() + "   " + s1.hashCode());
		}

		UserInfo user = new UserInfo();
		if (user.getFirstName() == null) {
			System.out.println("true");
		}

		List<UserInfo> list_user = new ArrayList<>();
		list_user.add(new UserInfo("1", "liquidweb.com", "80000"));
		list_user.add(new UserInfo("2", "linode.com", "90000"));
		list_user.add(new UserInfo("3", "digitalocean.com", "120000"));
		list_user.add(new UserInfo("4", "aws.amazon.com", "200000"));
		list_user.add(new UserInfo("5", "mkyong.com", "1"));

//		Creating map from the object
		Map<String, String> result1 = list_user.stream()
				.collect(Collectors.toMap(UserInfo::getUserId, UserInfo::getFirstName));

		System.out.println("Result 1 : " + result1);

//		Same with result1, just different syntax // key = id, value = name Creating map from the object
		Map<String, String> result3 = list_user.stream()
				.collect(Collectors.toMap(x -> x.getUserId(), x -> x.getFirstName()));

		System.out.println("Result 3 : " + result3);

//		To remove Duplicate Object based on specific value
		list_user.add(new UserInfo("1", "liquidweb.com", "80000"));
		Set<UserInfo> userInfoSet = list_user.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(UserInfo::getUserId))));
		System.out.println("userInfoSet  " + userInfoSet);
	}

}
