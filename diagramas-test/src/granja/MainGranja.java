package granja;

import animales.Animal;
import animales.Conejo;

public class MainGranja {

	public static final Integer MAXHUEVOSGALLINA=4;
	public static final Integer MAXHUEVOSPALOMO=3;
	public static final Integer MAXPALOMO=3;
	public static final Integer MAXGALLINA=4;
	public static final Integer MAXCONEJO=10;
	public MainGranja() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Granja granja;
		Granjero miGranjero = new Granjero("Dionisio");
		granja = new Granja();
		for (int i=0 ;i<MAXCONEJO;i++){
			Granja.Animales[i]=granja.creaAnimal(0);
		}
		for (int i=MAXCONEJO ;i<MAXGALLINA;i++){
			granja.Animales[i]=granja.creaAnimal(1);
		}
		for (int i=MAXGALLINA ;i<MAXPALOMO;i++){
			granja.Animales[i]=granja.creaAnimal(2);
		}
		for(Animal bicho: granja.Animales){
			if (bicho instanceof Conejo)
			{break;}
			else{
				
			}
		}
		
		
		
		
	}

}
