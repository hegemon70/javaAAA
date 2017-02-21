
package cadenas;
import java.util.Scanner;
import java.lang.String;

public class Cadenas {
public static final char tach ='x';
	public Cadenas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String rec,tachado;
		System.out.println("dame una frase");
		Scanner sc = new Scanner(System.in);
		rec=sc.nextLine();
		System.out.println("la frase que me has pasado es "+rec);
		tachado=rec.toLowerCase();
		 tachado=tachado.replace('a',tach)
						.replace('e',tach)
						.replace('i',tach)
						.replace('o',tach)
						.replace('u',tach)
						.replace('a',tach);
		sc.close();
		
		String[] trozos=tachado.split(" ");
		for(String cur : trozos)
		{
			System.out.println(cur);
		}
		
		
	}
}


