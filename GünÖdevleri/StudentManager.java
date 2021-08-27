package Java3.GünÖdevleri;

public class StudentManager extends UserManager{
	
	public void list(Student[] students) {
		for(Student student : students) {
				System.out.println(student.getFırstName()+" "+student.getLastName()+" joined");
		}
	}
	
}
