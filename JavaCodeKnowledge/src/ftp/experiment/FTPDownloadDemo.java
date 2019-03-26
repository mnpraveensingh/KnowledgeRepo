package ftp.experiment;

import org.apache.commons.net.ftp.FTPClient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author M1047624
 *
 */
public class FTPDownloadDemo {
	public static void main(String[] args) {
		// The local filename and remote filename to be downloaded.
		String filename = "data.txt";

		FTPClient client = new FTPClient();
		try (OutputStream os = new FileOutputStream(filename)) {
			client.connect("ftp.example.org");  // url
			client.login("admin", "admin123**");

			// Download file from FTP server.
			boolean status = client.retrieveFile(filename, os);
			System.out.println("status = " + status);
			System.out.println("reply  = " + client.getReplyString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				client.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
