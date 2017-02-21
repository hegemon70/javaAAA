package agenda;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import contacto.Contact;

public class Agenda {

	public Agenda() {
		private static final String AGENDA_NAME ="agenda.dat";
		
		private static final File agendaFile =new File(Agenda.AGENDA_NAME);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 public void addContact(Contact contact, File dest)throws IOException{
	 FileOutputStream fos =new FileOutputStream(dest,true);
	 BufferedOutputStream bos= new BufferedOutputStream(fos);
	 DataOutputStream out = new 	 DataOutputStream(bos);
	 out.write(contact.getName());	 
	 out.write(contact.getAge());
	 out.write(contact.getCellPhone());
	 out.close();
	 bos.close();
	 fos.close();
	 
 }
 
 public void retrieveContactByName(String name)throws IOException{}
 FileInputStream fis = new FileInputStream(Agenda.agendaFile);
 BufferedInputStream bis= new BufferedInputStream(fis);
 DataInputStream in = new 	 DataInputStream(bis);
 Contact contact;
 while(im.avaliable()>0)
 {
	 contat =new Contact(in.readUTF(),in.readInt(),in.readLong());
	 if(contact.getName().equalsIgnoreCase(name))
	 {
		 System.out.println(contact.toString());
		 
	 }
 }
 fis.close();
 bis.close();
 in.close();
}
