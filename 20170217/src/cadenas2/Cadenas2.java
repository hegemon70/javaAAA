package cadenas2;



import java.util.Scanner;
import java.lang.StringBuilder;
public class Cadenas2 {

	public Cadenas2() {
		// TODO Auto-generated constructor stub
	}
private static boolean isSort(StringBuilder cadena)
{
	boolean esOrdenado=true;
	if(cadena.length()>2)
	{
		for(int i=1; i<cadena.length();i++)
		{
			if (cadena.charAt(i-1)>cadena.charAt(i-1))
				esOrdenado=false;
		}
	}
	else
		esOrdenado=false;
		
	return esOrdenado;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ordenador= new StringBuilder();
		//boolean esOrdenado=false;
		System.out.println("dame una frase");
		Scanner sc = new Scanner(System.in);
		StringBuilder  rec =new StringBuilder(sc.nextLine());
		
		//alReves=rec.reverse();
		ordenador.append(rec.charAt(0));
		while (!isSort(ordenador))
		{
			for(int i=1; i<rec.length();i++)
			{
				if(rec.charAt(i)>=rec.charAt(i-1))
					ordenador.append(rec.charAt(i));
				else 
					ordenador.insert(i-1,rec.charAt(i));
			}		
			
		
		}
		System.out.println(rec);
		System.out.println(ordenador);
		
	}

}
