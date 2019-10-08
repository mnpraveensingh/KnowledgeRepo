package enumTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import enumTest.EnumTest.AuditApplicabilities;

public class EnumValueAsList {

	public static void main(String[] args) {
		List<String> enumNames = Stream.of(AuditApplicabilities.values())
                .map(Enum::name)
                .collect(Collectors.toList());
		System.out.println("enumNames "+enumNames);
		enumNames.forEach(action->{
			System.out.println(AuditApplicabilities.valueOf(action).getSubscriptionid());
		});

	}

}
