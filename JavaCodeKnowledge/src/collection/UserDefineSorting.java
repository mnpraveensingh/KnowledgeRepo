package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import code.experiment.UserInfo;

public class UserDefineSorting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>() ;
		list.add(1) ;list.add(10) ;list.add(10) ;
		list.add(12) ;list.add(13) ;list.add(22) ;
		list.add(25) ;list.add(27) ;list.add(2) ;
		list.add(27) ;list.add(1) ;list.add(30) ;
		
		Set<Integer> l = new HashSet<>() ;
		l = list.stream().filter(num -> num > 22).collect(Collectors.toSet());
		System.out.println(l);
		
		UserInfo user_1 = new UserInfo("Pravin" , "Singh" , "1") ;
		UserInfo user_2 = new UserInfo("Usha" , "Sharma" , "2") ;
		UserInfo user_3 = new UserInfo("Milan" , "Rao" , "3") ;
		UserInfo user_4 = new UserInfo("Keshava" , "Shivlinge" , "4") ;
		UserInfo user_5 = new UserInfo("Suraj" , "Methews" , "5") ;
		
		List<UserInfo> userInfoList = new ArrayList<>() ;
		userInfoList.add(user_1) ;userInfoList.add(user_2) ;
		userInfoList.add(user_3) ;userInfoList.add(user_4) ;
		userInfoList.add(user_5) ;
		System.out.println(userInfoList);
		Collections.sort(userInfoList, new SortByFname());
		System.out.println(userInfoList);
		
		Collections.sort(userInfoList, new Comparator<UserInfo>() {
			@Override
			public int compare(UserInfo u1, UserInfo u2) {
					return u1.getUserId()
							.compareTo(u2.getUserId());
			}
		});
		System.out.println(userInfoList);
	}

}
