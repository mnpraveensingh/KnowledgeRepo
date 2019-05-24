package code.experiment;

public class UserInfo {
	

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	private String userId;
	private String firstName;
	private String lastName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
