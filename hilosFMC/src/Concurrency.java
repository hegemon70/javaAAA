package Concurrency;
public class Almacen {
private int unidades;
public Almacen(int unidades) {
this.unidades = unidades;
}
public synchronized void addUnidad(){
 this.unidades++;
 }

 public synchronized void getUnidad() throws NoUnidadesException{
 if (this.unidades > 0)
 {
 this.unidades--;
 }
 else
 {
 throw new NoUnidadesException();
 }
 }

 public Integer getExistencias(){
 return this.unidades;
 }
 }
