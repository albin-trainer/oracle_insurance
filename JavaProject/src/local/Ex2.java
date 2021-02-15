package local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ex2 {
public static void main(String[] args) {

	ResourceBundle messages=ResourceBundle.getBundle("message", new Locale("hi","IN"));
	System.out.println(messages.getString("wish"));
	
	LocalDateTime time =LocalDateTime.now();
	System.out.println(time);
	DateTimeFormatter df=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(new Locale("hi","IN"))
;
	System.out.println(time.format(df));
}
}
