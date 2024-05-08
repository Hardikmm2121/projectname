import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("17/02/2024");
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss a");
		System.out.println(LocalDateTime.now().format(dateFormat));

	}

}
