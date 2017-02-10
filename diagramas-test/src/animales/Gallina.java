package animales;

import java.util.Random;

import granja.MainGranja;
import productos.Huevo;

enum Color {BLANCO,NEGRA,ROYA,MARRON}
public class Gallina extends Animal implements Oviparo {
	Color ColorGallina; 
	Integer numHuevos=0;
	public Gallina() {
		// TODO Auto-generated constructor stub
		
         this.ColorGallina=dameColorGallina();
	}

	@Override
	public Huevo[] recogerHuevos(Integer numeroHuevos) {
		Huevo[] Huevos;
		Huevos= new Huevo[MainGranja.MAXHUEVOSGALLINA];
		this.numHuevos=- numeroHuevos;
		return Huevos;
	}

	@Override
	public Huevo[] recogerHuevos() {
		Huevo[] Huevos;
		Huevos= new Huevo[MainGranja.MAXHUEVOSGALLINA];
		this.numHuevos=0;
		return Huevos;
		
	}

	@Override
	public void ponerHuevos() {
		this.numHuevos++;

	}
public void comer(){
		
		System.out.println("el gallina come");
	}
	public void dormir(){
		System.out.println("el gallina duerme");
	} 
	private Color dameColorGallina(){
		
		 Random rnd = new Random();
		 int col= rnd.nextInt()*3;
		 switch (col)
		 {
			 case 1: return Color.MARRON;
			 case 2: return Color.NEGRA;
			 case 3: return Color.ROYA;
			 default: return Color.BLANCO;
		 }
		
		
	}

}