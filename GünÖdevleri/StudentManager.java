package Java3.G�n�devleri;

public class StudentManager extends UserManager{
	
	public void list(Student[] students) {
		for(Student student : students) {
				System.out.println(student.getF�rstName()+" "+student.getLastName()+" joined");
		}
	}
	
}
