import java.util.ArrayList;

public class Navio3Canos extends Navio implements Posicao{

	public Navio3Canos() {

		this.tamanho = 3;
		
	}
	
	@Override
	public Navio3Canos gerarPosicao(ArrayList<Navio> navios) {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
