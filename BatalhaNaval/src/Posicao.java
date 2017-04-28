import java.util.ArrayList;

public interface Posicao {

	public Navio gerarPosicao(ArrayList<Navio> navios);
	
	public boolean posicaoValida(ArrayList<Navio> navios, Coordenada coordenada);
	
}
