package threads;
public class MyThreadSubClass extends Thread{

	public MyThreadSubClass() {
		System.out.println("Building MyThreadSubClass");
	}
@Override
	public void run()
	{
		System.out.println("corriendo metodo @Override");
	
	}
	public static void main(String[] args) {
		
		new  MyThreadSubClass().start();
	}
}
