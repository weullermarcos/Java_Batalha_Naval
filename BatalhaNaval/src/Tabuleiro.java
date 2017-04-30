
public class Tabuleiro {
	
	String tracos = "   _ _ _ _ _ _ _ _ _ _";
	String linhaA = "A |_|_|_|_|_|_|_|_|_|_|";
	String linhaB = "B |_|_|_|_|_|_|_|_|_|_|";
	String linhaC = "C |_|_|_|_|_|_|_|_|_|_|";
	String linhaD = "D |_|_|_|_|_|_|_|_|_|_|";
	String linhaE = "E |_|_|_|_|_|_|_|_|_|_|";
	String linhaF = "F |_|_|_|_|_|_|_|_|_|_|";
	String linhaG = "G |_|_|_|_|_|_|_|_|_|_|";
	String linhaH = "H |_|_|_|_|_|_|_|_|_|_|";
	String linhaI = "I |_|_|_|_|_|_|_|_|_|_|";
	String linhaJ = "J |_|_|_|_|_|_|_|_|_|_|";
	String numeros = "   0 1 2 3 4 5 6 7 8 9";
	
	int diferencaInicial = 3;
	
	public void DesenhaCabecalho(){
		
		System.out.println("******************************************");
		System.out.println("*\tBatalha Naval - Weuller \t *");
		System.out.println("******************************************");
		
	}
	
	public void DesenhaTabuleiro(){
	
		System.out.println(this.tracos);
		System.out.println(this.linhaA);
		System.out.println(this.tracos);
		System.out.println(this.linhaB);
		System.out.println(this.tracos);
		System.out.println(this.linhaC);
		System.out.println(this.tracos);
		System.out.println(this.linhaD);
		System.out.println(this.tracos);
		System.out.println(this.linhaE);
		System.out.println(this.tracos);
		System.out.println(this.linhaF);
		System.out.println(this.tracos);
		System.out.println(this.linhaG);
		System.out.println(this.tracos);
		System.out.println(this.linhaH);
		System.out.println(this.tracos);
		System.out.println(this.linhaI);
		System.out.println(this.tracos);
		System.out.println(this.linhaJ);
		System.out.println(this.numeros);
		
	}
	
	public void atualizaTabuleiro(int resultado, Coordenada coordenada){
		
		String letraNavio = retornaLetraNavio(resultado);
		
		String linha = coordenada.getLetra();
		int numeroColuna = Integer.parseInt(coordenada.getNumero());
		
		numeroColuna = numeroColuna * 2 + diferencaInicial;
		
		if(numeroColuna == 0)
			numeroColuna += diferencaInicial; 
		
		StringBuilder novaLinha;
		
		switch (linha) {
		
		case "A":
			novaLinha = new StringBuilder(linhaA);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaA = novaLinha.toString();
			break;
			
		case "B":
			novaLinha = new StringBuilder(linhaB);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaB = novaLinha.toString();
			break;
			
		case "C":
			novaLinha = new StringBuilder(linhaC);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaC = novaLinha.toString();
			break;
			
		case "D":
			novaLinha = new StringBuilder(linhaD);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaD = novaLinha.toString();
			break;
			
		case "E":
			novaLinha = new StringBuilder(linhaE);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaE = novaLinha.toString();
			break;
			
		case "F":
			novaLinha = new StringBuilder(linhaF);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaF = novaLinha.toString();
			break;
			
		case "G":
			novaLinha = new StringBuilder(linhaG);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaG = novaLinha.toString();
			break;
			
		case "H":
			novaLinha = new StringBuilder(linhaH);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaH = novaLinha.toString();
			break;
			
		case "I":
			novaLinha = new StringBuilder(linhaI);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaI = novaLinha.toString();
			break;
			
		case "J":
			novaLinha = new StringBuilder(linhaJ);
			novaLinha.replace(numeroColuna, numeroColuna+1, letraNavio);			
			linhaJ = novaLinha.toString();
			break;

		default:
			break;
		}
		
	}
	
	public String retornaLetraNavio(int resultado){
		
		switch (resultado) {
		case 1:
		case 2:
		case 3:
		case 4:
			return "N";
		case 5:
			return "P";
		default:
			return "A";
		}
	}
	
	public static String vrificaDisparo(int resultado){
		
		switch (resultado) {
		case 1:
			return "\n\n**Vc acertou um navio de 1 cano**\n\n";
		case 2:
			return "\n\n**Vc acertou um navio de 2 canos**\n\n";
		case 3:
			return "\n\n**Vc acertou um navio de 3 canos**\n\n";
		case 4:
			return "\n\n**Vc acertou um navio de 4 canos**\n\n";
		case 5:
			return "\n\n**Vc acertou um porta avioes**\n\n";
		default:
			return "\n\n**Vc acertou a agua**\n\n";
		}	
	}
}
