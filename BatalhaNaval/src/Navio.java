import java.util.ArrayList;
import java.util.Random;

public class Navio {

	protected int tamanho;
	protected Orientacao orientacao;
	protected ArrayList<Coordenada> posicoes = new ArrayList<>();
	
	public Navio() {
		
		super();
		this.orientacao = this.getOrientacao();
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Orientacao getOrientacao() {
		
		//gera de forma aleatoria a orientacao do navio
		Random ran = new Random();
		int numero = ran.nextInt(100);
		
		if(numero %2 == 0)
			return orientacao.HORIZONTAL;
		else
			return orientacao.VERTICAL;
	}

	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}
	
	
}
