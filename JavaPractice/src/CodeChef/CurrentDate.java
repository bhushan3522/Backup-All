package CodeChef;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDate {

	public static void main(String[] args) {

		SimpleDateFormat formatDate = new SimpleDateFormat();
		formatDate.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println(formatDate.format(new Date()));
	}

}
