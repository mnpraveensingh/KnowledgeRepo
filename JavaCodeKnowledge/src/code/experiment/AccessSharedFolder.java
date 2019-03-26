package code.experiment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccessSharedFolder {

	public static void main(String[] args) throws IOException {
		
//		Finding duplicates
		List<String> numbers = Arrays.asList("1", "2", "1", "3", "4", "4");
		Set<String> allItems = new HashSet<>();
		Set<String> duplicates = numbers.stream().filter(n -> !allItems.add(n)).collect(Collectors.toSet());
		System.out.println(duplicates); // [1, 4]		
		
//		Getting file count present in shared folder
		try (Stream<Path> files = Files.list(Paths.get("\\\\A2ML23492\\ftp_share"))) {
		    long count = files.count();
		    System.out.println("count   "+count);
		}
	}
}
