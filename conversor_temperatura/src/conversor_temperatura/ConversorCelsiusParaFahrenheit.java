package conversor_temperatura;

public class ConversorCelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		
		float celsius;
		float fahrenheit;
		
		celsius = 20;
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println(celsius + " graus celsius equivale a " + fahrenheit + " graus fahrenheit");
		System.out.println(celsius + " " + fahrenheit);
	}

}
