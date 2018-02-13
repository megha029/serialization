package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SerialDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		emp e1 = new emp(1,"megha");
		System.out.println("Serialization");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		System.out.println("Deserialization");
		FileInputStream fis =new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		emp e2 = (emp) ois.readObject();
		System.out.println(e2.id+ " "+e2.name);
	}

}


class emp implements Serializable {
	 int id;
	String name;
	
	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + "]";
	}
	
	
}