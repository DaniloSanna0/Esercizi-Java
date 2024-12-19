import java.util.Calendar;

public class FindDay {

	public static void main(String[] args) {
		String dayOfWeek = findDay(12, 19, 2024);
        System.out.println(dayOfWeek);
	}

	public static String findDay(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        return days[dayOfWeek - 1]; 
	}
}
