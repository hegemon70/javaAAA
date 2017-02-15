package granja;

public class Granjero {
	private String nombre;
	private  Granja miGranja;
	


	public Granja getMiGranja() {
		return miGranja;
	}
	public void setMiGranja(Granja miGranja) {
		this.miGranja = miGranja;
	}
	public Granjero(String nom) {
		// TODO Auto-generated constructor stub
			setNombre(nom);
	}
	public Granjero(String nom,Granja granja) {
		// TODO Auto-generated constructor stub
			setNombre(nom);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void creaGranja(){
		
		miGranja = new Granja();
	}
	public void nuevoDia(){}
	public void alimentarAnimales(){}
	public void recogerHuevos(){}
	public void descansar(){}
	public void contarHuevos(){}

}
