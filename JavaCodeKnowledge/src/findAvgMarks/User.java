package findAvgMarks;

public class User {

	private int marks;
	private int count;
	private int avg;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public User(int marks, int count, int avg) {
		super();
		this.marks = marks;
		this.count = count;
		this.avg = avg;
	}
}
