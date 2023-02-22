package mypack;
import java.util.*;
import pack.Abc;	
class Person{
	private int id;
	private String name;

	Person(int id, String name){
		this.id=id;
		this.name=name;
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
class CollegeGraduate extends Person{
	private int cgpa;
	private int yearOfGrad;

	CollegeGraduate(int id, String name, int cgpa, int yearOfGrad){
		super(id,name);
		this.cgpa=cgpa;
		this.yearOfGrad=yearOfGrad;
	}

	public void setCGPA(int cgpa){
		this.cgpa=cgpa;
	}
	public int getCGPA(){
		return this.cgpa;
	}

	public void setYearOfGrad(int yearOfGrad){
		this.yearOfGrad=yearOfGrad;
	}
	public int getYearOfGrad(){
		return this.yearOfGrad;
	}
}

public class Main{
	public static void main(String[] args) {
		CollegeGraduate p1= new CollegeGraduate(1,"Ajeya",4,2020);

		System.out.println(p1.getName());
		p1.setName("Adwait");
		System.out.println(p1.getName());

		System.out.println(p1.getYearOfGrad());
		p1.setYearOfGrad(2021);
		System.out.println(p1.getYearOfGrad());

		Abc weird= new Abc();

	}
}