import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		Coordenada coordenada = new Coordenada();
		boolean letraValida = false;
		boolean numeroValido = false;
		
		tabuleiro.DesenhaCabecalho();
		tabuleiro.DesenhaTabuleiro();
		
		//enquanto nao for digitado uma letra valida
		while(!letraValida){
			
			System.out.println("\nDigite uma letra: ");
			coordenada.letra = scanner.nextLine();
			
			letraValida = coordenada.letraPermitida();
			
			if(!letraValida){
				System.out.println("\nLetra invalida, favor digitar uma letra valida ");
			}
		}
		
		//enquanto nao for digitado uma letra valida
		while(!numeroValido){
			
			System.out.println("\nDigite um numero: ");
			coordenada.numero = scanner.nextLine();
			
			numeroValido = coordenada.numeroValido();
			
			if(!numeroValido){
				System.out.println("\nNumero invalido, favor digitar uma numero valido ");
			}
		}
		
		
		
	}
}
