import java.util.*;
import java.lang.*;

class Student{
	static int count=0;
	int regNo;
	String fullName;
	GregorianCalendar obj;
	short semester;
	float gpa;
	float cgpa;
	Student(String fullName, GregorianCalendar obj, short semester, float gpa, float cgpa){
		this.fullName = fullName;
		this.obj = obj;
		this.semester = semester;
		this.gpa = gpa;
		this.cgpa = cgpa;
		Student.count++;
		int yearOfJoining= obj.get(Calendar.YEAR);
		yearOfJoining=yearOfJoining%100;
		String regString= String.valueOf(yearOfJoining)+ Student.count;//implicit conversion
		this.regNo= Integer.parseInt(regString);
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

	public static void swapStudentReferences(Student[] students,int a, int b){
		Student temp =students[b];
		students[b]=students[a];
		students[a]=temp;
		System.out.println("I'm called");
	}
	public static void sortStudentsBySemAndCGPA(Student[] students){
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length-1-i;j++){
				if(students[j].semester>students[j+1].semester){
					// Student temp =students[j+1];
					// students[j+1]=students[j];
					// students[j]=temp;
					// System.out.println("I am called");
					swapStudentReferences(students,j,(j+1));
				}
			}
		}
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length-1-i;j++){
				if((students[j].cgpa>students[j+1].cgpa)&&(students[j].semester==students[j+1].semester)){
					swapStudentReferences(students,j,(j+1));
				}
			}
		}
	}
	public static void sortStudentsByName(Student[] students){
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length-1-i;j++){
				if(students[j].fullName.compareTo(students[j+1].fullName)>0){
					// Student temp =students[j+1];
					// students[j+1]=students[j];
					// students[j]=temp;
					// System.out.println("I am called");
					swapStudentReferences(students,j,(j+1));
				}
			}
		}
	
	}
	public static void listByInitialChar(Student[] students, char checker){
		System.out.println("Students with name starting with '"+checker+"' -");
		for(Student student:students){
			if(student.fullName.charAt(0)==checker){
				System.out.println(" Student name : "+student.fullName+
					"\n Student sem :"+student.semester);

			}
		}
	}
	public static void listBySubstring(Student[] students, String substring){
		System.out.println("Students with substring : "+substring+" -");
		for(Student student:students){
			if(student.fullName.contains(substring)){
				System.out.println(" Student name : "+student.fullName+
					"\n Student sem :"+student.semester);

			}
		}
	}
	public static void modifyNameByInitials(Student[] students){
		for(Student student: students){
			String[] nameTokens= student.fullName.split(" ");
			char sign1=nameTokens[0].charAt(0);
			
			String lastName=nameTokens[nameTokens.length-1];
			student.fullName=""+sign1+"."+" "+lastName;
		}
	}

	public static void main(String[] args) {
		int arrSize=5;

		Student[] students= new Student[arrSize];
		students[0]=new Student("Ajeya Nadig1", new GregorianCalendar(2017,07,20),(short)4,8.2f,8.0f);
		students[1]=new Student("Djeya Nadig2", new GregorianCalendar(2017,07,20),(short)3,9.2f,4.0f);
		students[2]=new Student("Njeya Nadig3", new GregorianCalendar(2017,07,20),(short)4,3.2f,2.0f);
		students[3]=new Student("Zjeya Nadig4", new GregorianCalendar(2017,07,20),(short)3,5.2f,1.0f);
		students[4]=new Student("Ajeya Nadig5", new GregorianCalendar(2017,07,20),(short)4,10.2f,9.0f);
		//printStudentArray(students);

		// sortStudentsBySemAndCGPA(students);
		// System.out.println("\n\n\nsorted by sem THEN cgpa\n");
		// printStudentArray(students);

		 sortStudentsByName(students);
		// System.out.println("\n\n\nsorted by name\n");
		// printStudentArray(students);
		

		//listByInitialChar(students,'B');
		//listBySubstring(students, "jey");
		modifyNameByInitials(students); 
		printStudentArray(students);


	}
}