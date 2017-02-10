package productos;

import java.util.Random;

public class Huevo {
    int yemas;
	public Huevo() {
		 Random rnd = new Random();
         yemas=rnd.nextInt()*2+1;
		
		
	}

}
