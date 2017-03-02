package Concurrency;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class StartProductoresConsumidores {
private static final int UNIDADES_ALMACEN = 10;
public static void main(String[] args) {

 Almacen almacen = new Almacen(StartProductoresConsumidores.UNIDADES_ALMACEN);

 Random generador = new Random();

 Integer numeroProductores = generador.nextInt(5);
 System.out.println("Generados -> " + numeroProductores + " productores");
 Integer numeroConsumidores = generador.nextInt(10);
 System.out.println("Generados -> " + numeroConsumidores + " consumidores");

 List <Runnable> hilos = new ArrayList<Runnable>();

 for (int i=0; i < numeroProductores; i++){
 hilos.add(new Productor(almacen,"#" + Integer.valueOf(i+1).toString()));
 System.out.println("Agregado Productor");
 }

 for (int i=0; i < numeroConsumidores; i++){
 hilos.add(new Consumidor(almacen,"#" + Integer.valueOf(i+1).toString()));
 System.out.println("Agregado Consumidor");
 }

 while (hilos.size() > 0){
 int numeroHilo = generador.nextInt(hilos.size());

 System.out.println("Extrayendo hilo del pool (" + numeroHilo + " de " + hilos.size() + ")");
 Thread hilo = new Thread(hilos.get(numeroHilo));

 System.out.println("Lanzando hilo");
 hilo.start();

 System.out.println("Quitando hilo del pool");
 hilos.remove(numeroHilo);
 }

 System.out.println("Estado Final del Almacen: " + almacen.getExistencias() + " existencias");
 }
 }
