package formato;

import java.io.PrintWriter;

public class PrintWriterFormat {

	public PrintWriterFormat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PrintWriter pw= new PrintWriter(System.out);
		pw.format("%1.1f is between %d and %d %n",1.5f,1,2);
		pw.printf("%2$d %3$s %1$d%n",1,2,"is bigger than");
		pw.flush();
	}

}
