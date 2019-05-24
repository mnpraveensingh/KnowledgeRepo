package code.experiment;

import constant.Constant;

public class ReadingFromConstantEnum {

	public static void main(String[] args) {
		System.out.println(Constant.LwbCodeCategory.Process.getLwbCodeCategory().toString());
		System.out.println(Constant.LwbCodeCategory.LOGIN_SUCCESS.getId());
		System.out.println(Constant.LwbCodeCategory.LOGIN_FAILURE_INVALID_USERID.getLwbCodeCategory().toString());
		System.out.println(Constant.LwbCodeCategory.LOGIN_FAILURE_INVALID_USERID.getId());
		System.out.println(Constant.LwbCodeCategory.Process.getId());
	}
}
