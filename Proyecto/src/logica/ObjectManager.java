package logica;

import objeto.atravesable.*;
import objeto.noAtravesable.*;

public class ObjectManager {
	//metodos
	public void visit(Aliado a){
		boolean encontre=false;
		Tile actual=a.getTile().getLeft();
		for(int i=0; i<a.getAlcance() && !encontre; i++){
			if(actual.getComponente()!=null){
				encontre=true;
				a.atacar(actual.getComponente());
			}
			actual=actual.getLeft();
		}
	}
	public void visit(Enemigo e){
		boolean encontre=false;
		Tile actual=e.getTile().getRight();
		for(int i=0; i<e.getAlcance() && !encontre; i++){
			if(actual.getComponente()!=null){
				encontre=true;
				e.atacar(actual.getComponente());
			}
			actual=actual.getRight();
		}
		if(!encontre){
			e.avanzar();
		}
	}
	public void visit(ObjetoAtravesable oa){
		oa.modificar(oa.getTile().getComponente());
	}
}