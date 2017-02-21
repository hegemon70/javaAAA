package archivos;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class WriteRead {

	public WriteRead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] in =new char[50];
		int size=0;
		try
		{
			File file=new File("MyStory.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("En un lugar de la mancha..\nDecuyo noombre no quiero acordarme");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			
			size=fr.read(in);
			System.out.println("Numero de Caracterres leidos:"+size);
			
			for(char c : in)
				System.out.println(c);
			fr.close();
		}
		catch(IOException e){
		e.printStackTrace();	
		}
	}
}
