package granja;

public class Granjero {
	private String nombre;
	public  Granja miGranja;
	


	public Granjero(String nom) {
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
