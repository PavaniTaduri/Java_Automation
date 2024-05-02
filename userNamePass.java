package Files;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class userNamePass {
	
	public String fileNameForLogin(String u, String p) {
		// TODO Auto-generated method stub

		
		String filename;
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting:" +now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm");
		filename = "C:\\Users\\Administrator\\Desktop\\" + u + "_" + p + "_" + now.format(format) + ".jpg";
		
		return filename;
	}
}