package archivos;
import java.io.File;

public class ListarFichero {

	public ListarFichero() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListarFichero().imprimirListado();
	}
	public void imprimirListado()
	{
		File f =new File(".");
		if (f.canExecute() && f.canRead())
		{
			String[] ficheros=f.list();
			for(String fichero :ficheros)
			{
				System.out.println(fichero);
			}
		}
	}

}
