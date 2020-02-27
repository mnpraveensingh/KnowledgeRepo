package code.experiment;

public class ConvertTimeInMinutes {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(60);
		}
		// finding the time after the operation is executed
		long end = System.currentTimeMillis();
		// finding the time difference
		float msec = end - start;
		// converting it into seconds
		float sec = msec / 1000F;
		// converting it into minutes
		float minutes = sec / 60F;
		System.out.println(minutes + " minutes");

	}

}
