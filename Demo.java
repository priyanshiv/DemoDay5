package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1,"Priyanshi","Priyanshiverma194");
		Student s2=new Student(2,"Ananya","Ananyashree6");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
   }

}
