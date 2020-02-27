package equalsHashcodeContract;

import java.util.HashMap;
import java.util.Map;

import code.experiment.UserInfo;

public class EqualsHashcodeContract {

	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo("1", "Pravin", "Singh");
		UserInfo userInfo_1 = new UserInfo("1", "Pravin", "Singh");
// if equals is not overridden then false else will get true because of the hashcode value.
		System.out.println(userInfo.equals(userInfo_1));

		Map<UserInfo, String> userInfoMap = new HashMap<>();
		userInfoMap.put(new UserInfo("1", "Pravin", "Singh"), "Pravin");
		userInfoMap.put(new UserInfo("2", "Usha", "Sharma"), "Usha");
		userInfoMap.put(new UserInfo("3", "Milan", "Rao"), "Milan");
// if not overridden equals and hashcode then duplicate objects can store else will override the data with new one
		System.out.println("before size : " + userInfoMap.size());
		userInfoMap.put(new UserInfo("2", "Usha", "Sharma"), "Usha");
		System.out.println("after size : " + userInfoMap.size());

		UserInfo userData = new UserInfo("2", "Usha", "Sharma");
// if hashcode and equals not overridden then will get null because both the object hashcode will be different
// but if overridden then will get desired output
		String user = userInfoMap.get(userData); // always first call goes to hashcode method then equals

		System.out.println("user : " + user);
	}

}
