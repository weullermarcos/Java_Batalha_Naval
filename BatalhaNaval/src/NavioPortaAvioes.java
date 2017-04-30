import java.util.ArrayList;

public class NavioPortaAvioes extends Navio implements Posicao{

	public NavioPortaAvioes() {

		super();
		this.tamanho = 5;
	}
	
	@Override
	public NavioPortaAvioes gerarPosicao(ArrayList<Navio> navios) {

		boolean coordenadaValida = false;
		
		while(!coordenadaValida){
			
			Coordenada coordenada1 = new Coordenada();
			Coordenada coordenada2 = new Coordenada();
			Coordenada coordenada3 = new Coordenada();
			Coordenada coordenada4 = new Coordenada();
			Coordenada coordenada5 = new Coordenada();
			
			coordenada1.letra = Coordenada.gerarLetraAleatoria();
			coordenada1.numero = Coordenada.gerarNumeroAleatorio();
			
			if(!Coordenada.coordenadaEstaLivre(navios, coordenada1)){
				
				coordenadaValida = false;
			}
			else{
				
				if(coordenada1.letra.equals("J") || coordenada1.letra.equals("I") || coordenada1.numero.equals("9")  || coordenada1.numero.equals("8")){
					
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
						}
						
						//se a coordenada 3 for valida gera e verifica a coordenada 4
						if(coordenadaValida){
							
							coordenada4.setLetra(Coordenada.pegaProximaLetra(letra));
							coordenada4.setNumero(coordenada2.getNumero());
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada4);
						}
						
						//se a coordenada 4 for valida gera e verifica a coordenada 5
						if(coordenadaValida){
							
							coordenada5.setLetra(Coordenada.pegaProximaLetra(coordenada4.getLetra()));
							coordenada5.setNumero(coordenada4.getNumero());
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada5);
						}
						
					}
					else{
						
						//gera e verifica se a coordenada 2 é válida
						coordenada2.setLetra(Coordenada.pegaProximaLetra(letra));
						coordenada2.setNumero(coordenada1.getNumero());
						coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada2);
						
						//se a coordenada 2 for valida gera e verifica a coordenada 3
						if(coordenadaValida){
							
							coordenada3.setLetra(Coordenada.pegaProximaLetra(coordenada2.getLetra()));
							coordenada3.setNumero(coordenada2.getNumero());
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada3);
						}
						
						//se a coordenada 3 for valida gera e verifica a coordenada 4
						if(coordenadaValida){
							
							numero ++;
							coordenada4.setLetra(coordenada2.getLetra());	
							coordenada4.setNumero(String.valueOf(numero));
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada4);
						}		
						
						//se a coordenada 4 for valida gera e verifica a coordenada 5
						if(coordenadaValida){
							
							numero ++;
							coordenada5.setLetra(coordenada4.getLetra());	
							coordenada5.setNumero(String.valueOf(numero));
							coordenadaValida = Coordenada.coordenadaEstaLivre(navios, coordenada5);
						}
					}					
				}
			}
			
			if(coordenadaValida){
				
				this.posicoes.add(coordenada1);
				this.posicoes.add(coordenada2);
				this.posicoes.add(coordenada3);
				this.posicoes.add(coordenada4);
				this.posicoes.add(coordenada5);
				
			}
		}
		
		return this;
	}
}
