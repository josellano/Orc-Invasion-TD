package objeto.noAtravesable.objetoConVida.personaje;

import logica.visitor.*;
import objeto.noAtravesable.ObjetoNoAtravesable;

public abstract class Aliado extends Personaje {
	//atributos
	protected int valor;
	protected VisitorAliado v;
	
	//metodos
	public void atacar(ObjetoNoAtravesable e){
		if(reloj==0){
			e.accept(v);
			//v.afectar(e);
		}
		reloj=(reloj+1)%(int)(velocidadAt*60);
	}
	
	public int getValor(){
		return valor;
	}
	public void restarVida(int v){
		vida-=v;
		if(vida<=0){
			miTile.destruirAliado(this);
			miTile = null;
		}
	}
	
	public void accept(Visitor o){
		o.afectar(this);
	}
}
