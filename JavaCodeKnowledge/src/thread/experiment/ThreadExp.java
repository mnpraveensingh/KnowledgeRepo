package thread.experiment;

public class ThreadExp {

	static void method() {
		System.out.println("method");
	}
	public static void main(String[] args) {

		try {
			Thread.sleep(100);
			System.out.println("Hello World");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
