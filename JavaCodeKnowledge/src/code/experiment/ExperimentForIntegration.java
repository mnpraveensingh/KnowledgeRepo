package code.experiment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExperimentForIntegration {

	public static void main(String[] args) throws ParseException {

		List<UserInfo> existingProject = getUserInfo();
		UserInfo UserInfo = new UserInfo();
		UserInfo.setFirstName("Usha");
		UserInfo.setLastName("Sharma");
		UserInfo.setUserId("M1047749");
		Map<String, List<UserInfo>> l = new HashMap<>();
		l.put("red", existingProject);
		if (l != null && l.size() > 0) {
			l.forEach((k, v) -> {
				List<UserInfo> newExistingProject = l.get(k);
				for (int i = 0; i < newExistingProject.size(); i++) {
					System.out.println("newExistingProject.get(i)   " + newExistingProject.get(i));
					newExistingProject.get(i).setFirstName(UserInfo.getFirstName());
					newExistingProject.get(i).setLastName(UserInfo.getLastName());
					newExistingProject.get(i).setUserId(UserInfo.getUserId());
					System.out.println("modified newExistingProject.get(i)   " + newExistingProject.get(i));
				}
			});
		}

	}

	public static List<UserInfo> getUserInfo() {
		List<UserInfo> existingProject = new ArrayList<>();
		UserInfo UserInfo_1 = new UserInfo();
		UserInfo_1.setFirstName("Pravin");
		UserInfo_1.setLastName("Singh");
		UserInfo_1.setUserId("M1047624");
		UserInfo UserInfo_2 = new UserInfo();
		UserInfo_2.setFirstName("Pravin");
		UserInfo_2.setLastName("Singh");
		UserInfo_2.setUserId("M1047624");
		UserInfo UserInfo_3 = new UserInfo();
		UserInfo_3.setFirstName("Pravin");
		UserInfo_3.setLastName("Singh");
		UserInfo_3.setUserId("M1047624");
		UserInfo UserInfo_4 = new UserInfo();
		UserInfo_4.setFirstName("Pravin");
		UserInfo_4.setLastName("Singh");
		UserInfo_4.setUserId("M1047624");
		existingProject.add(UserInfo_1);
		existingProject.add(UserInfo_2);
		existingProject.add(UserInfo_3);
		existingProject.add(UserInfo_4);
		return existingProject;
	}

}
