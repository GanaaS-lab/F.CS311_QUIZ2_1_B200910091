
public class main {

	public static void main(String[] args) {
		b200910091 course = new b200910091("Software Construction");
		course.setCourseName("Software Construction");
		
		System.out.println(course.courseName);
		System.out.println(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээлт");
		System.out.println(course.getCourseName());
		
		

	}

}
