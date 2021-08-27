package Java3.G�n�devleri;

public class Main {

	public static void main(String[] args) {
		Instructor �nstructor = new Instructor();
		�nstructor.setEmail("�nstructor@gmail.com");
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addInstructor();
		�nstructorManager.addTo(�nstructor);
		
		System.out.println("-------------------------------------");
		
		Student student = new Student();
		student.setEmail("studentDeneme@gmail.com");
		StudentManager studentManager =  new StudentManager();
		studentManager.addTo(student);
		
		Student student1 = new Student();
		student1.setF�rstName("Fevzi ");
		student1.setLastName("�akmak");
		
		Student student2 = new Student();
		student1.setF�rstName("Ahmet  ");
		student1.setLastName("As�m");
		
		Student student3 = new Student();
		student1.setF�rstName("Derya ");
		student1.setLastName("Ulusoy");
		
		Student student4 = new Student();
		student1.setF�rstName("Salih ");
		student1.setLastName("Kahraman");
		
		Student[] students = new Student[] {
				student1,student2,student3,student4
		};
		
		studentManager.list(students);
		
		
	}

}
