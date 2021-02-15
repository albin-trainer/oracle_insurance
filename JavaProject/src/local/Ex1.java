package local;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ex1 {
public static void main(String[] args) {
	ResourceBundle messages=ResourceBundle.getBundle("message",new Locale("ta"));
	System.out.println(messages.getString("wish"));
	String s="காலை வணக்கம்";
	;
	System.out.println(s);
}
}
