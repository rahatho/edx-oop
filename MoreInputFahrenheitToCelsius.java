import java.util.Scanner;

public class MoreInputFahrenheitToCelsius {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Fahrenheit Temparature: ");
		int fahrenheit = input.nextInt();
		double celsius = (5/9.0) * (fahrenheit - 32);
		
		System.out.print("Enter day of week: ");
		String day = input.next();
		
		System.out.println(day + " Fahrenheit temparature " + fahrenheit);
		System.out.println(day + " Celsius temparature " + celsius);
	}
}
