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
			
			Coordenada coordenada1 = new Coordenada();
			Coordenada coordenada2 = new Coordenada();

			coordenada1.letra = Coordenada.gerarLetraAleatoria();
			coordenada1.numero = Coordenada.gerarNumeroAleatorio();
			
			if(!Coordenada.coordenadaEstaLivre(navios, coordenada1)){
				
				coordenadaValida = false;
			}
			else{
				
				if(coordenada1.numero.equals("9")  && this.getOrientacao() == Orientacao.HORIZONTAL){
					
					coordenadaValida = false;
				}
				else if( coordenada1.letra.equals("J")  && this.getOrientacao() == Orientacao.VERTICAL){
					
					coordenadaValida = false;
				}
				else{
					
					int numero = Integer.parseInt(coordenada1.getNumero());
					String letra = coordenada1.getLetra();
					
					//se horizontal, incrementa o numero da coluna
					if(this.getOrientacao() == Orientacao.HORIZONTAL){
						
						numero ++;
						coordenada2.setLetra(letra);	
						coordenada2.setNumero(String.valueOf(numero));
					}
					else{
						
						coordenada2.setLetra(Coordenada.pegaProximaLetra(letra));
						coordenada2.setNumero(coordenada1.getNumero());
					}
					
					coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada2);
					
				}
			}
			
			if(coordenadaValida){
				
				this.posicoes.add(coordenada1);
				this.posicoes.add(coordenada2);
			}
		}
		
		return this;
	}
	
}
