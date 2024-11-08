import java.util.Scanner;

public class InputFahrenheitToCelsius {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Fahrenheit Temparature: ");
		int fahrenheit = scanner.nextInt();

		double celsius = (5/9.0) * (fahrenheit - 32);

		System.out.println("Celsius conversion is " + celsius);
	}
}
