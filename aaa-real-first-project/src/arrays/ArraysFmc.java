package arrays;

public class ArraysFmc {

	public ArraysFmc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] vector =new int[10];
			
			for (int i=0 ;i<10;i++){
				vector[i]=vector[i]+20+i;
			}
			int c=0;
			for (int entero: vector){
				System.out.println("la posicion "+c+" tiene "+entero);
				c++;
			}
			for (int x=10,y=3;y>3;y++){
				System.out.println("la posicion "+x+" tiene "+y);
			}
			for(;;){
			System.out.println("bucle infinito");
			}
	}
			
}
