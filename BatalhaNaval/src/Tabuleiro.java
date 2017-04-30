
public class Tabuleiro {
		
	public void DesenhaCabecalho(){
		
		System.out.println("******************************************");
		System.out.println("*\tBatalha Naval - Weuller \t *");
		System.out.println("******************************************");
		
	}
	
	public void DesenhaTabuleiro(){
		
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("A|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("B|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("C|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("D|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("E|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("F|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("G|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("H|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("I|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  _ _ _ _ _ _ _ _ _ _");
		System.out.println("J|_|_|_|_|_|_|_|_|_|_|");
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
		
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
