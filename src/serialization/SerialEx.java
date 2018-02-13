package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
    empl1 e1 = new empl1(1);
    System.out.println("Serialization");
	FileOutputStream fos = new FileOutputStream("abc.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e1);
	System.out.println(e1);
	
	System.out.println("Deserialization");
	FileInputStream fis =new FileInputStream("abc.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	empl1 e2 = (empl1) ois.readObject();
	System.out.println(e2.id+ " "+e2.id1 +" "+e2.id2 +" "+e2.id3 + " "+e2.id4);
}


	}



class empl1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id ;
transient  int id1;
	transient static int id2=2;
	transient final int id3=3;
	transient static final int id4 =7;
	public empl1(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "empl1 [id=" + id + "]";
	}

		
		
	
}

	
	
	
	