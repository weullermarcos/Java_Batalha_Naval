import java.util.ArrayList;

public class NavioPortaAvioes extends Navio implements Posicao{

	public NavioPortaAvioes() {

		this.tamanho = 5;
	}
	
	@Override
	public NavioPortaAvioes gerarPosicao(ArrayList<Navio> navios) {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
