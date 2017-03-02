package Concurrency;
public class Productor implements Runnable{
private Almacen almacen;
private String nombre;
public Productor (Almacen almacen, String nombre){
this.almacen = almacen;
this.nombre= nombre;
 }

 public void putUnidad(){
 this.almacen.addUnidad();
 }

 public void run(){
 System.out.println("Productor: " + this.nombre + " llevando mercancia");

 this.putUnidad();

 System.out.println("Productor: " + this.nombre + " notificando entrega");
 }
}
