
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
	
	public boolean letraPermitida(){
			
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
}
