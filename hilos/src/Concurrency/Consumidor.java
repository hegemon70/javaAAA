package Concurrency;
public class Consumidor implements Runnable{
private Almacen almacen;
private String nombre;
public Consumidor (Almacen almacen, String nombre)
{
	this.almacen = almacen;
	this.nombre= nombre;
 }

 public void consumir() throws NoUnidadesException
 {
	 this.almacen.getUnidad();
 }

	 public void run() 
	 {
		 System.out.println("Consumidor: " + this.nombre + " dirigiendose al almacen");
	
		 try
		 {
			 this.consumir();
	 	}
	 	catch(NoUnidadesException nuex)
	 	{
	 		System.out.println(nuex.getMessage());
	 	}
	
	 	System.out.println("Consumidor: " + this.nombre + " unidad obtenida");
	 }
 }