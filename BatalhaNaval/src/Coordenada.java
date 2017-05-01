import java.util.ArrayList;
import java.util.Random;

public class Coordenada {

	protected String letra;
	protected String numero;
	protected boolean foiAtingida;
	
	public Coordenada() {
		
		super();
		this.foiAtingida = false;
	}
	
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public boolean isFoiAtingida() {
		return foiAtingida;
	}
	public void setFoiAtingida(boolean foiAtingida) {
		this.foiAtingida = foiAtingida;
	}
	
	public boolean letraValida(){
			
		String letra = this.letra.toUpperCase();
		
		if(letra.equals("A") || letra.equals("B") ||
		   letra.equals("C") || letra.equals("D") ||
		   letra.equals("E") || letra.equals("F") ||
		   letra.equals("G") || letra.equals("H") ||
		   letra.equals("I") || letra.equals("J")){
			
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean numeroValido(){
		
		String numero = this.numero.toUpperCase();
		
		if(numero.equals("1") || numero.equals("2") ||
		   numero.equals("3") || numero.equals("4") ||
		   numero.equals("5") || numero.equals("6") ||
		   numero.equals("7") || numero.equals("8") ||
		   numero.equals("9") || numero.equals("0")){
			
			return true;
		}
		else{
			return false;
		}
	}
	
	public static String gerarLetraAleatoria(){
		
		//gera letras de A a J
		Random ran = new Random();
		char letra = ((char) (ran.nextInt(10) + 65));
		return "" + letra;
		
	}
	
	public static String gerarNumeroAleatorio(){
		
		//gera um numero aleatorio de 0 a 9
		Random ran = new Random();
		int numero = ran.nextInt(9);
		return String.valueOf(numero);

	}
	
	public static int contaNaviosEmJogo(ArrayList<Navio> navios){
		
		int naviosEmJogo = 0;
		
		for (Navio navio : navios) {
			
			if(navio.afundou == false){
				naviosEmJogo ++;
			}		
		}
		
		return naviosEmJogo;
	}
	
	public static boolean coordenadaEstaLivre(ArrayList<Navio> navios, Coordenada coordenada) {
		
		String letra1 = coordenada.getLetra();
		String numero1 = coordenada.getNumero();
		
		for (Navio navio : navios) {
			
			for (Coordenada coordenadaNavio : navio.posicoes) {
				
				String letra2 = coordenadaNavio.getLetra();
				String numero2 = coordenadaNavio.getNumero();
				
				if(letra1.equals(letra2) && numero1.equals(numero2)){
					return false;
				}	
			}		
		}
		
		return true;
	}
	
	public static int fazerDisparoEmCoordenada(ArrayList<Navio> navios, Coordenada coordenada){
				
		String letra1 = coordenada.getLetra();
		String numero1 = coordenada.getNumero();
		
		for (Navio navio : navios) {
			
			for (Coordenada coordenadaNavio : navio.posicoes) {
				
				String letra2 = coordenadaNavio.getLetra();
				String numero2 = coordenadaNavio.getNumero();
				
				if(letra1.equals(letra2) && numero1.equals(numero2)){
					
					//marca a coordenada como atingida
					coordenadaNavio.foiAtingida = true;
					
					//retorna o tamanho do navio
					return navio.tamanho;
				}	
			}		
		}
		
		return 0;
	}
	
	//Verifica se um tiro já foi efetuado na coordenada fornecida
	public static boolean tiroJaEfetudo(ArrayList<Navio> navios, Coordenada coordenada){
		
		String letra1 = coordenada.getLetra();
		String numero1 = coordenada.getNumero();
		
		for (Navio navio : navios) {
			
			for (Coordenada coordenadaNavio : navio.posicoes) {
				
				String letra2 = coordenadaNavio.getLetra();
				String numero2 = coordenadaNavio.getNumero();
				
				if(letra1.equals(letra2) && numero1.equals(numero2)){
					
					if(coordenadaNavio.foiAtingida)
						return true;
				}	
			}		
		}
		
		return false;
	}
	
	public static int navioAfundou(ArrayList<Navio> navios, Coordenada coordenada){
		
		String letra1 = coordenada.getLetra();
		String numero1 = coordenada.getNumero();
		Navio navioAcertado =  new Navio();
		
		for (Navio navio : navios) {
			
			for (Coordenada coordenadaNavio : navio.posicoes) {
				
				String letra2 = coordenadaNavio.getLetra();
				String numero2 = coordenadaNavio.getNumero();
				
				if(letra1.equals(letra2) && numero1.equals(numero2)){
					
					navioAcertado = navio;
					break;
				}	
			}		
		}
		
		int tamanhoNavio = navioAcertado.tamanho;
		int disparosNoNavio = 0;
		
		for (Coordenada cord : navioAcertado.posicoes) {
			
			if(cord.foiAtingida){
				
				disparosNoNavio ++;
			}	
		}
		
		//se o tamanho do navio for igual ao numero de disparos acertados
		if(tamanhoNavio == disparosNoNavio){
			
			navioAcertado.afundou = true;
			return tamanhoNavio;
		}
		
		return 0;
	}
	
	public static String pegaProximaLetra(String letra){
		
		switch (letra) {
		
		case "A":
			return "B";
			
		case "B":
			return "C";
			
		case "C":
			return "D";
			
		case "D":
			return "E";
			
		case "E":
			return "F";
			
		case "F":
			return "G";
			
		case "G":
			return "H";
			
		case "H":
			return "I";
			
		case "I":
			return "J";
			
		case "J":
			return "J";

		default:
			return "A";
		}
	}
	
}
