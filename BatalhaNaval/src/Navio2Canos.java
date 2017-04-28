import java.util.ArrayList;

public class Navio2Canos extends Navio implements Posicao{

	public Navio2Canos() {

		this.tamanho = 2;
		
	}

	@Override
	public Navio2Canos gerarPosicao(ArrayList<Navio> navios) {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
