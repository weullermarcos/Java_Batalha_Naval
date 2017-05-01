import java.util.ArrayList;
import java.util.Random;

public class Navio {

	protected int tamanho;
	protected Orientacao orientacao;
	protected boolean afundou;
	protected ArrayList<Coordenada> posicoes = new ArrayList<>();
	
	public Navio() {
		
		super();
		this.afundou = false;
		this.orientacao = this.gerarOrientacaoAleatoria();
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Orientacao getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}
	
	public boolean isAfundou() {
		return afundou;
	}

	public void setAfundou(boolean afundou) {
		this.afundou = afundou;
	}

	public Orientacao gerarOrientacaoAleatoria(){
	
		//gera de forma aleatoria a orientacao do navio
		Random ran = new Random();
		int numero = ran.nextInt(100);
		
		if(numero %2 == 0)
			return orientacao.HORIZONTAL;
		else
			return orientacao.VERTICAL;
		
	}	
}
