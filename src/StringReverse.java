
import java.util.Scanner;

public class StringReverse {

	private static final String MENSAGEM_DO_SCANNER = "Digite o a palavra que deseja reverter: ";

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print(MENSAGEM_DO_SCANNER);
		
		String palavraReverter = teclado.next();
		String palavraRevertida = "";
		
		for (int i = palavraReverter.length() - 1 ; i >= 0; i--) {
			palavraRevertida += palavraReverter.charAt(i);
		}
		
		System.out.println( palavraRevertida);
		
	}

}
