package objeto.noAtravesable.objetoConVida.personaje;

import game.gfx.Animation;
import game.gfx.ImageLoader;
import logica.Tile;
import logica.visitor.VisitorAliado;
import objeto.noAtravesable.ObjetoNoAtravesable;

public class Treant extends Aliado{
	public Treant(Tile t){
		super();
		miTile=t;
		t.setComponente(this);
		velocidadAt=1.8f;
		velAtMaxima=1.8f;
		image=ImageLoader.treant;
		vida=100;
		maxVida=100;
		ancho=1;
		alto=1;
		impacto=15;
		alcance=1;
		valor=0;
		v=new VisitorAliado(this);
		animation = new Animation(t.getFila() * 64,t.getColumna()*64, velocidadAt, ImageLoader.mageAtk);
	}
	public ObjetoNoAtravesable clone(){
		return new EnanoCampeon(new Tile(null, 0, 0));
	}
}
