import java.util.Scanner;

public class MoreInputFahrenheitToCelsius {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit value and the day of week: ");
		int fahrenheit = input.nextInt();
		
		String day = input.next();

		double celsius = (5/9.0) * (fahrenheit - 32);
		
		System.out.println(day + " Fahrenheit temparature " + fahrenheit);
		System.out.println(day + " Celsius temparature " + celsius);
	}
}
