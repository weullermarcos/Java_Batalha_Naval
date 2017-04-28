import java.util.ArrayList;

public class Navio1Cano extends Navio implements Posicao {

	public Navio1Cano() {

		super();
		this.tamanho = 1;	
	}

	
	@Override
	public Navio1Cano gerarPosicao(ArrayList<Navio> navios) {

		boolean coordenadaValida = false;
		
		while(!coordenadaValida){
			
			Coordenada coordenada = new Coordenada();

			coordenada.letra = Coordenada.gerarLetraAleatoria();
			coordenada.numero = Coordenada.gerarNumeroAleatorio();
			
			coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada);
			
			if(coordenadaValida)
				this.posicoes.add(coordenada);
			
		}
		
		return this;
	}
}
