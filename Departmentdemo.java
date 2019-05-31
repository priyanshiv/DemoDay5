package in.ac.sharda;

public class Departmentdemo {

	public static void main(String[] args) {
		
		Department d=new Department(1);
		for(int i=1;i<19;i++){
		    d.addStudent(new Student(i,"Priyanshi"+i,null));
	    }
		d.printStudents();
	}	

}
