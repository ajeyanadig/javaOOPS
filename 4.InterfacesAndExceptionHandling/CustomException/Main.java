import java.util.*;
import java.lang.*;

class SeatsFilledException extends Exception{
	private int id;
	public SeatsFilledException(int id){
		this.id=id;
	}
	@Override
	public String toString(){
		return ("Exception seats filled"+String.valueOf(id));
	}
}

class Student{
	static int count=8;
	int regNo;
	String fullName;
	GregorianCalendar obj;
	short semester;
	float gpa;
	float cgpa;
	Student(String fullName, GregorianCalendar obj, short semester, float gpa, float cgpa) throws SeatsFilledException {
		this.fullName = fullName;
		this.obj = obj;
		this.semester = semester;
		this.gpa = gpa;
		this.cgpa = cgpa;
		Student.count++;
		int yearOfJoining= obj.get(Calendar.YEAR);
		yearOfJoining%=100;
		yearOfJoining*=100;
		if(yearOfJoining+count>yearOfJoining+12){
			throw new SeatsFilledException(count);
		}
		this.regNo= yearOfJoining+count;
	}
	void display(){
		String joiningDate=this.obj.get(Calendar.DATE)+":"+this.obj.get(Calendar.MONTH)+":"+this.obj.get(Calendar.YEAR);
		System.out.println("Details are as follows: \nRegistration Number : "+
			this.regNo+"\nFull Name : "+this.fullName+
			"\njoining date : "+joiningDate+
			"\nSemester : "+this.semester+"\nGPA : "+this.gpa+"\nCGPA : "+this.cgpa);
	}
}
public class Main{
	public static void printStudentArray(Student[] students){
		for(Student student: students){
			student.display();
		}
	}

	public static void main(String[] args) {
		int arrSize=5;

		Student[] students= new Student[arrSize];
		try{
			students[0]=new Student("Ajeya Nadig1", new GregorianCalendar(2017,07,20),(short)4,8.2f,8.0f);
			students[1]=new Student("Djeya Nadig2", new GregorianCalendar(2017,07,20),(short)3,9.2f,4.0f);
			students[2]=new Student("Njeya Nadig3", new GregorianCalendar(2017,07,20),(short)4,3.2f,2.0f);
			students[3]=new Student("Zjeya Nadig4", new GregorianCalendar(2017,07,20),(short)3,5.2f,1.0f);
			students[4]=new Student("Ajeya Nadig5", new GregorianCalendar(2018,07,20),(short)4,10.2f,9.0f);
		}
		catch(Exception e){
			System.out.println(e);
		}
		printStudentArray(students);



	}
}