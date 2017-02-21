package Writers;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.io.IOException;

public class PrintWriterTest {

	public PrintWriterTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		String inicio="Cadena Inicio";
		Integer numeral = new Random().nextInt(100);
		String fin="Cadena fin";
		
		FileWriter fw = new FileWriter("PrintWriter Test");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(inicio);
		pw.println(numeral);
		pw.println(fin);
		pw.close();
		fw.close();

	}

}
