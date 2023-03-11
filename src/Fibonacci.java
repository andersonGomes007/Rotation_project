import java.util.Scanner;

public class Fibonacci {
	public static void main(String...args) {
		int numeroAntigo = 0;
		int numeroAtual = 1; 
		int numeroNovo = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja verificar se e um fibonacci!");
		
		int numeroVerificar = teclado.nextInt();
		
		while (numeroVerificar > numeroNovo) {
			numeroNovo = numeroAntigo + numeroAtual;
			numeroAntigo = numeroAtual;
			numeroAtual = numeroNovo;
			
			
		}
		
		if(numeroVerificar == 0 || numeroVerificar == numeroNovo ) {
			System.out.println("O numero " + numeroVerificar + " e um numero fibonacci!!");
		}else {
			System.out.println("O numero " + numeroVerificar + " nao e um numero fibonacci!!");

		}
	
	} 
	

}
