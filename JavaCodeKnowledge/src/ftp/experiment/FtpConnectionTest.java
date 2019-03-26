package ftp.experiment;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;

public class FtpConnectionTest {

	public static void main(String[] args) {
		FTPClient client = new FTPClient();
		try {
			client.connect("172.22.192.139");

			// Try to login and return the respective boolean value
			boolean login = client.login("M1047624@mindtree.com", "March@1993");

			// If login is true notify user
			if (login) {
				System.out.println("Connection established...");

				// Try to logout and return the respective boolean value
				boolean logout = client.logout();

				// If logout is true notify user
				if (logout) {
					System.out.println("Connection close...");
				}
			} else { // Notify user for failure
				System.out.println("Connection fail...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// close connection
				client.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
