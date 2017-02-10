package animales;

import productos.Huevo;

public interface Oviparo {

	public Huevo[] recogerHuevos(Integer numeroHuevos);
	public Huevo[] recogerHuevos();
	public void ponerHuevos();
	
}
