package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>,IResultArrivedListener{

	private final int id;
	
	private List<Student> students=new ArrayList<>();
	
	public Department(int id){
		this.id=id;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void addStudent(Student student){
		this.students.add(student);
	}

	public void printStudents(){
		students.parallelStream()
		.forEach(
				s->System.out.println(
						s.getRollNumber()));
	}

   @Override
   public int compareTo(Department o){
	   return o.getId() -id;
   }

  @Override
  public void resultArrived(){
	  students.parallelStream().forEach(
			  s->s.resultArrived());
  }

@Override
public void resultDeclared() {
	// TODO Auto-generated method stub
	
}
}
