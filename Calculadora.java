import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		int opcion, num1, num2, resultado;
		
		Operaciones calc = new Operaciones();
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Qué operación desea realizar: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			opcion=entrada.nextInt();
		switch(opcion) {	
		case 1:
			System.out.println("Ingrese el primer número: ");
			num1=entrada.nextInt();
			System.out.println("Ingrese el segundo número: ");
			num2=entrada.nextInt();
			System.out.println("La suma es: " + calc.sumar(num1, num2));
		break;
		case 2:
			System.out.println("Ingrese el primer número: ");
			num1=entrada.nextInt();
			System.out.println("Ingrese el segundo número: ");
			num2=entrada.nextInt();
			System.out.println("La resta es: " + calc.restar(num1, num2));
		break;
		case 3:
			System.out.println("Ingrese el primer número: ");
			num1=entrada.nextInt();
			System.out.println("Ingrese el segundo número: ");
			num2=entrada.nextInt();
			System.out.println("La multiplicación es: " + calc.multiplicar(num1, num2));
		break;
		case 4:
			System.out.println("Ingrese el primer número: ");
			num1=entrada.nextInt();
			System.out.println("Ingrese el segundo número: ");
			num2=entrada.nextInt();
			System.out.println("La división es: " + calc.dividir(num1, num2));
		break;
		default:
			System.out.println("La opción es incorrecta.");
		}
		
		}while(opcion!=5);
		
	}

}
