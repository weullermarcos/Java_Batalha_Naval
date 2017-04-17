import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		Coordenada coordenada = new Coordenada();
		
		tabuleiro.DesenhaCabecalho();
		tabuleiro.DesenhaTabuleiro();
		
		System.out.println("\nDigite uma letra: ");
		coordenada.letra = scanner.nextLine().toUpperCase();
		
		System.out.println("\nDigite um número: ");
		coordenada.numero = scanner.nextLine();
		
//		System.out.println(coordenada.letra);
//		System.out.println(coordenada.numero);
		
	}

}
