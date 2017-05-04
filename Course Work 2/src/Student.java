
public class Student implements java.io.Serializable {
	 private String Student;
	 private int id;

		
		public Student(String Student, int id){
			this.Student=Student;
			this.id=id;
		}


		public String getStudent() {
			return Student;
		}


		public void setStudent(String student) {
			Student = student;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		@Override
		public String toString() {
			return "Student Name :-" + Student + "      Student Id :-" + id ;
		}
}



		