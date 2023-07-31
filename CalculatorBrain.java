import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1;
		int num2;
		int resultado;
		Scanner console = new Scanner(System.in);
		System.out.print("Escribe el primer número entero: ");
        num1 = console.nextInt();
        System.out.print("Escribe el segundo número entero: ");
        num2 = console.nextInt();
        resultado=suma(num1,num2);
        System.out.println("Suma: "+resultado);
        resultado=resta(num1, num2);
        System.out.println("Resta: "+resultado);
        System.out.println("Multiplicacion: "+multiplicacion(num1, num2));
        System.out.println("División: "+division(num1, num2));
        
        
        
	}

	public static int suma (int a, int b) {
		return(a+b);
	}
	public static int resta (int a, int b) {
		return(a-b);
	}
	public static int multiplicacion (int a, int b) {
		return(a*b);
	}
	public static int division (int a, int b) {
		return(a/b);
	}
}
