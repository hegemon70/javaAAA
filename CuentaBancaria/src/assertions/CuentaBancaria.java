package assertions;

public class CuentaBancaria {
	private float dinero=100f;
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public float ingresar(float dinero)
	{
		return this.dinero+=dinero;	
	}
	public float extraer(float dinero)
	{
		this.checkNumerosRojos();
		return this.dinero-=dinero;
	}
	public void saldo(){
		
		System.out.println("tu saldo en cuanta es "+ this.dinero);
	}
	private void checkNumerosRojos(){
		
		assert this.dinero >0 : "no se puede realizar la operacion por falta de saldo";
	}
	
}
