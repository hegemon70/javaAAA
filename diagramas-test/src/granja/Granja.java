package granja;

import animales.Animal;
import animales.Conejo;
import animales.Gallina;
import animales.Palomo;

public class Granja {
	String color;
	public static Animal[] Animales;
	
	public Granja() {
		// TODO Auto-generated constructor stub
		int tam= MainGranja.MAXGALLINA+MainGranja.MAXPALOMO + MainGranja.MAXCONEJO;
		Animales= new Animal[tam];
	}
	/*public Granja(String col) {
		this.color=col;
		
	}*/
	public Animal creaAnimal(int tipo){
		Animal animal;
		switch	(tipo){
		case 0: animal = new Conejo();
		case 1: animal = new Gallina();
		default: animal = new Palomo();
		}
		return animal;
	}
}
