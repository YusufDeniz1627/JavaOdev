package Java3.GünÖdevleri;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor = new Instructor();
		ınstructor.setEmail("ınstructor@gmail.com");
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.addInstructor();
		ınstructorManager.addTo(ınstructor);
		
		System.out.println("-------------------------------------");
		
		Student student = new Student();
		student.setEmail("studentDeneme@gmail.com");
		StudentManager studentManager =  new StudentManager();
		studentManager.addTo(student);
		
		Student student1 = new Student();
		student1.setFırstName("Fevzi ");
		student1.setLastName("Çakmak");
		
		Student student2 = new Student();
		student1.setFırstName("Ahmet  ");
		student1.setLastName("Asım");
		
		Student student3 = new Student();
		student1.setFırstName("Derya ");
		student1.setLastName("Ulusoy");
		
		Student student4 = new Student();
		student1.setFırstName("Salih ");
		student1.setLastName("Kahraman");
		
		Student[] students = new Student[] {
				student1,student2,student3,student4
		};
		
		studentManager.list(students);
		
		
	}

}
