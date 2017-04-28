import java.util.ArrayList;

public class Navio1Cano extends Navio implements Posicao {

	public Navio1Cano() {

		this.tamanho = 1;	
	}

	
	@Override
	public Navio1Cano gerarPosicao(ArrayList<Navio> navios) {

		boolean posicaoValida = false;
		
		while(!posicaoValida){
			
			Coordenada coordenada = new Coordenada();

			coordenada.letra = Coordenada.gerarLetraAleatoria();
			coordenada.numero = Coordenada.gerarNumeroAleatorio();
			
			posicaoValida = posicaoValida(navios, coordenada);
			
			this.posicoes.add(coordenada);
			
		}
		
		return this;
	}


	@Override
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada) {
		
		for (Navio navio : navios) {
			
			for (Coordenada coordenadaNavio : navio.posicoes) {
				
				if(coordenadaNavio.getLetra() == coordenada.getLetra() && coordenadaNavio.getNumero() == coordenada.getNumero()){
					return false;
				}	
			}		
		}
		
		return true;
	}
}
