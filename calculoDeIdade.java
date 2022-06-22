package cursoDeJavaOrientadoAObjetosAlura;
import java.util.Scanner;
public class calculoDeIdade {

	public static void main(String[] args) {
		int idade;
		int anoNascimento;
		int anoAtual;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe qual ano voce nasceu:");
		anoNascimento = teclado.nextInt();
		System.out.println("Informe qual ano estamos:");
		anoAtual = teclado.nextInt();
		
		idade = anoAtual - anoNascimento;
		System.out.println("Voce tem " + idade + " Anos.");
		
		teclado.close();
		
	}

}
