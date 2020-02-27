package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import code.experiment.UserInfo;

public class CollectionStreamExp {

	public static void main(String[] args) {

		List<UserInfo> userInfoList = getTheList();

// if the oldValue , newValue thing will not applied then will get below exception
// Exception in thread "main" java.lang.IllegalStateException: Duplicate key UserInfo

		long start = System.currentTimeMillis();

		Map<String, UserInfo> map = userInfoList.stream()
				.collect(Collectors.toMap(UserInfo::getUserId, userInfo -> userInfo, (oldValue, newValue) -> newValue));
		map.forEach((k, v) -> {
			System.out.println(k + " : " + " " + v);
		});

		long end = System.currentTimeMillis();
		
		printExecutionTime(start, end);
		
		System.out.println("---------------------------------------------------------------------------------------");

		start = System.currentTimeMillis();
		
		List<UserInfo> userInfoList_1 = userInfoList.parallelStream().filter(u -> Integer.valueOf(u.getLastName()) > 2)
				.collect(Collectors.toList());
		if (userInfoList_1 != null && userInfoList_1.size() > 0) {
			userInfoList_1.forEach(action -> {
				System.out.println(action);
			});
		}
		
		end = System.currentTimeMillis();
		
		printExecutionTime(start, end);
	}

	private static List<UserInfo> getTheList() {
		UserInfo user_1 = new UserInfo("Pravin", "Singh", "1");
		UserInfo user_2 = new UserInfo("Usha", "Sharma", "2");
		UserInfo user_3 = new UserInfo("Milan", "Rao", "3");
		UserInfo user_4 = new UserInfo("Keshava", "Shivlinge", "4");
		UserInfo user_5 = new UserInfo("Suraj", "Methews", "5");
		UserInfo user_6 = new UserInfo("Suraj", "Methews", "6");

		List<UserInfo> userInfoList = new ArrayList<>();
		userInfoList.add(user_1);
		userInfoList.add(user_2);
		userInfoList.add(user_3);
		userInfoList.add(user_4);
		userInfoList.add(user_5);
		userInfoList.add(user_6);
		return userInfoList;
	}

	private static void printExecutionTime(long start, long end) {
		float msec = end - start;
		float sec = msec / 1000F;
		float minutes = sec / 60F;
		System.out.println("msec :" + msec + " sec : " + sec + " minutes : " + minutes);
	}
}
