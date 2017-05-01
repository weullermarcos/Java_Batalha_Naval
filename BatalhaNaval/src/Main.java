import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Tabuleiro tabuleiro = new Tabuleiro();
				
		//Criar lista de Navios
		ArrayList<Navio> navios = new ArrayList<>();
		
		//gerando e adicionando navios ao tabuleiro
		//Porta avioes
		navios.add(new NavioPortaAvioes().gerarPosicao(navios));
		//Navio de 4 canos 
		navios.add(new Navio4Canos().gerarPosicao(navios));
		//Navios de 3 canos
		navios.add(new Navio3Canos().gerarPosicao(navios));
		navios.add(new Navio3Canos().gerarPosicao(navios));
		//Navios de 2 canos
		navios.add(new Navio2Canos().gerarPosicao(navios));
		navios.add(new Navio2Canos().gerarPosicao(navios));
		navios.add(new Navio2Canos().gerarPosicao(navios));
		//Navios de 1 cano
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));
		navios.add(new Navio1Cano().gerarPosicao(navios));

		//mantem o jogo em loop
		while(true){
			
			Coordenada coordenada = new Coordenada();
			boolean letraValida = false;
			boolean numeroValido = false;
			
			int naviosRestantes = Coordenada.contaNaviosEmJogo(navios);
			tabuleiro.DesenhaCabecalho(naviosRestantes);
			tabuleiro.DesenhaTabuleiro();
			
			Scanner scanner = new Scanner(System.in);
			
			//enquanto nao for digitado uma letra valida
			while(!letraValida){
				
				System.out.println("\nDigite uma letra: ");
				coordenada.letra = scanner.nextLine().toUpperCase();
				
				letraValida = coordenada.letraValida();
				
				if(!letraValida){
					System.out.println("\nLetra invalida, favor digitar uma letra valida ");
				}
			}
			
			//enquanto nao for digitado um numero valido
			while(!numeroValido){
				
				System.out.println("\nDigite um numero: ");
				coordenada.numero = scanner.nextLine();
				
				numeroValido = coordenada.numeroValido();
				
				if(!numeroValido){
					System.out.println("\nNumero invalido, favor digitar uma numero valido ");
				}
			}
						
			//verificar se já atirou na posicao informada
			if(Coordenada.tiroJaEfetudo(navios, coordenada)){
				System.out.println("\nVc ja atirou em (" + coordenada.getLetra() + "-" + coordenada.getNumero() + "), favor informar uma coordenada nova\n\n");
			}
			else{
				
				//faz o disparo
				int resultado = Coordenada.fazerDisparoEmCoordenada(navios, coordenada);
				
				//diz qual navio foi acertado
				System.out.println(Tabuleiro.vrificaDisparo(resultado));
				
				//verificar se o navio foi afundado
				
				
				
				//Atualizar tabuleiro
				tabuleiro.atualizaTabuleiro(resultado, coordenada);
								
			}			
		}
	}
}
