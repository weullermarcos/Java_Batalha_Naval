import java.util.ArrayList;
import java.util.Random;

public class Coordenada {

	protected String letra;
	protected String numero;
	
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
	
	
	public static boolean coordenadaEstaLivre(ArrayList<Navio> navios, Coordenada coordenada) {
		
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
