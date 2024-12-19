import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GetCurrencyInstance {

	public static String formatCurrency(double payment, Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(payment);
	}
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		System.out.println("US: " + formatCurrency(payment, Locale.US));
		System.out.println("India: " + formatCurrency(payment, new Locale("en", "IN")));
		System.out.println("China: " + formatCurrency(payment, Locale.CHINA));
		System.out.println("France: " + formatCurrency(payment, Locale.FRANCE));
	}

}
