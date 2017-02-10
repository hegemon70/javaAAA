package animales;

import productos.Huevo;

public class Palomo extends Animal implements Oviparo {

	public Palomo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Huevo[] recogerHuevos(Integer numeroHuevos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Huevo[] recogerHuevos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ponerHuevos() {
		// TODO Auto-generated method stub

	}
public void comer(){
		
		System.out.println("el palomo come");
	}
	public void dormir(){
		System.out.println("el palomo duerme");
	} 

}
