import java.util.Scanner;

public class ExercicioTargetRPInverter {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a palavra que deseja inverter: ");
		String palavra = teclado.nextLine();
		String palavraInvertida = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);

		}
		System.out.println("A palavra invertida fica: " + palavraInvertida);
		teclado.close();
	}

}
