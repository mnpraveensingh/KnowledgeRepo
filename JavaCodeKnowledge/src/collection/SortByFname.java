package collection;

import java.util.Comparator;

import code.experiment.UserInfo;

public class SortByFname implements Comparator<UserInfo> {

	public int compare(UserInfo a, UserInfo b) {
		return a.getUserId().compareTo(b.getUserId());
	}

}
