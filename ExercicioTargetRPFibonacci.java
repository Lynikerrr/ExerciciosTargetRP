import java.util.Scanner;

public class ExercicioTargetRPFibonacci {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a seguir o numero desejado: ");
		int numero = teclado.nextInt();

		int num1 = 0;
		int num2 = 1;
		int fibonacci = 0;
		boolean pertence = false;

		while (fibonacci <= numero) {
			if (fibonacci == numero) {
				pertence = true;
				break;
			}

			num1 = num2;
			num2 = fibonacci;
			fibonacci = num1 + num2;
		}

		if (pertence) {
			System.out.println(numero + " Faz parte da sequencia de Fibonacci.");
		} else {
			System.out.println(numero + " Não faz parte da sequencia de Fibonacci.");
		}

		teclado.close();
	}

}
