import java.util.ArrayList;
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
		
		//Criar lista de Navios
		ArrayList<Navio> navios = new ArrayList<>();
		
		//Navios de 1 cano
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));
		//Navios de 2 canos
		navios.add(new Navio2Canos().gerarPosicao(navios));
		navios.add(new Navio2Canos().gerarPosicao(navios));
		navios.add(new Navio2Canos().gerarPosicao(navios));
		//Navios de 3 canos
		navios.add(new Navio3Canos().gerarPosicao(navios));
		navios.add(new Navio3Canos().gerarPosicao(navios));
		//Navio de 4 canos 
		navios.add(new Navio4Canos().gerarPosicao(navios));
		//Porta avioes
		navios.add(new NavioPortaAvioes().gerarPosicao(navios));
		
		
		//posicionar navios no tabuleiro

		
		
		
		//enquanto nao for digitado uma letra valida
		while(!letraValida){
			
			System.out.println("\nDigite uma letra: ");
			coordenada.letra = scanner.nextLine();
			
			letraValida = coordenada.letraValida();
			
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
