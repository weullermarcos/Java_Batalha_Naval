import java.util.ArrayList;
import java.util.Random;

public class Navio1Cano extends Navio implements Posicao {

	public Navio1Cano() {

		this.tamanho = 1;	
	}

	
	@Override
	public Navio1Cano gerarPosicao(ArrayList<Navio> navios) {

		boolean posicaoValida = false;
		
		while(!posicaoValida){
			
			Coordenada coordenada = new Coordenada();

			Random ran = new Random();
			char letra = ((char) (ran.nextInt(10) + 65));
			coordenada.letra = "" + letra;
			
			//gera um numero aleatorio de 0 a 9
			ran = new Random();
			int numero = ran.nextInt(9);
			coordenada.numero = String.valueOf(numero);
			
			posicaoValida = posicaoValida(navios, coordenada);
			
			this.setPosicao(coordenada);
			
		}
		
		return this;
	}


	@Override
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada) {
		
		for (Navio navio : navios) {
			
			if(navio.getPosicao().getLetra() == coordenada.getLetra() && navio.getPosicao().getNumero() == coordenada.getNumero())
				return false;	
		}
		
		return true;
	}
	
}
