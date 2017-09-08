package logica;

public abstract class ObjetoConVida extends ObjetoNoAtravesable{
	//atributos
	protected int vida;
	protected static int maxVida;
	protected int ancho;
	
	//metodos
	public void restarVida(int v){
		vida-=v;
	}
	public boolean vivo(){
		return vida>0;
	}
	public boolean fullVida(){
		return vida==maxVida;
	}
	public int getAncho(){
		return ancho;
	}
}
