import java.util.ArrayList;

public class Navio4Canos extends Navio implements Posicao{

	public Navio4Canos() {

		super();
		this.tamanho = 4;
	}
	
	@Override
	public Navio4Canos gerarPosicao(ArrayList<Navio> navios) {

		boolean coordenadaValida = false;
		
		while(!coordenadaValida){
			
			Coordenada coordenada1 = new Coordenada();
			Coordenada coordenada2 = new Coordenada();
			Coordenada coordenada3 = new Coordenada();
			Coordenada coordenada4 = new Coordenada();

			coordenada1.letra = Coordenada.gerarLetraAleatoria();
			coordenada1.numero = Coordenada.gerarNumeroAleatorio();
			
			if(!Coordenada.coordenadaEstaLivre(navios, coordenada1)){
				
				coordenadaValida = false;
			}
			else{
				
				if((coordenada1.numero.equals("9")  || coordenada1.numero.equals("8") || coordenada1.numero.equals("7")) && this.getOrientacao() == Orientacao.HORIZONTAL){
					
					coordenadaValida = false;
				}
				else if((coordenada1.letra.equals("J") || coordenada1.letra.equals("I") || coordenada1.letra.equals("H")) && this.getOrientacao() == Orientacao.VERTICAL){
					
					coordenadaValida = false;
				}
				else{
					
					int numero = Integer.parseInt(coordenada1.getNumero());
					String letra = coordenada1.getLetra();
					
					//se horizontal, incrementa o numero da coluna
					if(this.getOrientacao() == Orientacao.HORIZONTAL){
						
						//gera e verifica se a coordenada 2 é válida
						numero ++;
						coordenada2.setLetra(letra);	
						coordenada2.setNumero(String.valueOf(numero));
						coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada2);
						
						//se a coordenada 2 for valida gera e verifica a coordenada 3
						if(coordenadaValida){
							
							numero ++;
							coordenada3.setLetra(letra);	
							coordenada3.setNumero(String.valueOf(numero));
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada3);
							
							//se a coordenada 3 for valida gera e verifica a coordenada 4
							if(coordenadaValida){
								
								numero ++;
								coordenada4.setLetra(letra);	
								coordenada4.setNumero(String.valueOf(numero));
								coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada4);
							}
							
						}
					}
					else{
						
						//gera e verifica se a coordenada 2 é válida
						coordenada2.setLetra(Coordenada.pegaProximaLetra(letra));
						coordenada2.setNumero(coordenada1.getNumero());
						coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada2);
						
						//se a coordenada 2 for valida gera e verifica a coordenada 3
						if(coordenadaValida){
							
							String letra2Posicao = Coordenada.pegaProximaLetra(letra);
							coordenada3.setLetra(Coordenada.pegaProximaLetra(letra2Posicao));
							coordenada3.setNumero(coordenada1.getNumero());
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada3);
							
							//se a coordenada 3 for valida gera e verifica a coordenada 4
							if(coordenadaValida){
								
								String letra3Posicao = Coordenada.pegaProximaLetra(letra2Posicao);
								coordenada4.setLetra(Coordenada.pegaProximaLetra(letra3Posicao));
								coordenada4.setNumero(coordenada1.getNumero());
								coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada4);
							}
						}
					}					
				}
			}
			
			if(coordenadaValida){
				
				this.posicoes.add(coordenada1);
				this.posicoes.add(coordenada2);
				this.posicoes.add(coordenada3);
				this.posicoes.add(coordenada4);
			}
		}
		
		return this;
	}
	
}
