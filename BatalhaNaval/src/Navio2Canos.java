import java.util.ArrayList;

public class Navio2Canos extends Navio implements Posicao{

	public Navio2Canos() {

		super();
		this.tamanho = 2;	
	}

	@Override
	public Navio2Canos gerarPosicao(ArrayList<Navio> navios) {

		boolean coordenadaValida = false;
		
		while(!coordenadaValida){
			
			Coordenada coordenada = new Coordenada();

			coordenada.letra = Coordenada.gerarLetraAleatoria();
			coordenada.numero = Coordenada.gerarNumeroAleatorio();
			
			coordenadaValida =  Coordenada.coordenadaEstaLivre(navios, coordenada);
			
			if(coordenadaValida){
				
			}
				
			
			//this.posicoes.add(coordenada);
			
		}
		
		return this;
	}
	
	private void geraProximaCoordenada(){
		
		if(this.orientacao == Orientacao.HORIZONTAL){
			
		}
		else{
			
			
		}
		
	}
	
}
