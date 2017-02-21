package archivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopiarArchivo {

	public CopiarArchivo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File src=new File(args[0]);
		File dest=new File(args[1]);
		try{new CopiarArchivo().copiar(src,dest);}catch(IOException ioex){ioex.printStackTrace();}
		
	}
	public void copiar(File src,File dest)throws IOException
	{
		FileInputStream in =new FileInputStream(src);
		FileOutputStream out =new FileOutputStream(dest);
		int bytesLeidos;
		try
		{
			while((bytesLeidos=in.read())!=-1)
			{
				 out.write(bytesLeidos);
			}
		}finally{in.close();out.close();}
	}
}
