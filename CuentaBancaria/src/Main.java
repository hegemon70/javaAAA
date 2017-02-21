import assertions.CuentaBancaria;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float dinero =575.50f;
			CuentaBancaria c =new CuentaBancaria();
			System.out.println("saldo actual es "+ c.extraer(dinero));
			c.extraer(dinero);
			c.saldo();
	}

}
