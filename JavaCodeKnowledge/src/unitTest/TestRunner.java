package unitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitTestCases.class , JunitTestCases2.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("failure == "+failure.toString());
		}
		System.out.println("getFailureCount  "+result.getFailureCount());
		System.out.println("getRunCount  "+result.getRunCount());
		System.out.println("Result=="+result.wasSuccessful());
	}
}
