package code.experiment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GettingDuplicatesFromListOfObj {

	public static void main(String[] args) {
		duplicateUsingJava8();
		duplicateUsingSet();
	}

	public static void duplicateUsingJava8() {
//		List<UserInfo> users = userManager.fetchAllUserIds(AuthorizationUtil.getTenantIdForLoggedInUser());
		List<UserInfo> users = new ArrayList<UserInfo>(); // fetching from DB and then filtering
		List<String> original = users.stream().map(UserInfo::getUserId).collect(Collectors.toList());
		List<String> duplicates = new ArrayList<>();
		duplicates = original.stream().filter(e -> Collections.frequency(original, e) > 1).distinct()
				.collect(Collectors.toList());
		if (duplicates != null && duplicates.size() > 0) {
			System.out.println("result ----> " + duplicates);
		}
	}

	public static void duplicateUsingSet() {
//		List<UserInfo> users = userManager.fetchAllUserIds(AuthorizationUtil.getTenantIdForLoggedInUser());
		List<UserInfo> users = new ArrayList<UserInfo>(); // fetching from DB and then filtering
		List<String> listContainingDuplicates = new ArrayList<>();
		for (UserInfo u_info : users) {
			listContainingDuplicates.add(u_info.getUserId());
		}
		final Set<String> setToReturn = new HashSet<>();
		final Set<String> set1 = new HashSet<>();

		for (String yourString : listContainingDuplicates) {
			if (!set1.add(yourString)) {
				setToReturn.add(yourString);
			}
		}
		if (set1 != null && set1.size() > 0)
			System.out.println(setToReturn);
		if (setToReturn != null && setToReturn.size() > 0)
			System.out.println(setToReturn);
	}

}
