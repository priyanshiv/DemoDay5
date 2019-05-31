package in.ac.sharda;

public class Demo2 {

	public static void main(String[] args) {
		
		IResultArrivedListener ira1
		         =new Student(1,"Priyanshi",null);
		ira1.resultArrived();
		
		ira1=new Department(1);
		
		ira1.resultArrived();		
		
	}

}
