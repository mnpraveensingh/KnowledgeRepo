package code.experiment;

import java.io.File;

/**
 * @author M1047624
 *
 */
public class ReadFileFromDir {

	public static void main(String[] args) {
		File source = new File("H:\\FTP_Tools");
		if (!source.exists()) {
			boolean result = false;
			result = true;
			if (result) {
				System.out.println("DIR created");
				System.out.println("inside "+new Throwable().getStackTrace()[0].getMethodName()+" method in class "+new Object() { }.getClass().getEnclosingClass().getSimpleName());
			}
		} else {
			System.out.println("DIR already exist");
			System.out.println("inside ----> "+new Throwable().getStackTrace()[0].getMethodName()+"() method in class ----> "+new Object() { }.getClass().getEnclosingClass().getSimpleName()+".class at line number ---> "+new Throwable().getStackTrace()[0].getLineNumber());
		}
	}

}
