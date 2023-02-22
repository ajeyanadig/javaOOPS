import java.util.*;
import java.lang.*;

public class Main{		
	public static void main(String[] args) {
		//DynamicArray obj= new DynamicArray(3);
		stackInterface obj= new DynamicArray(3);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		//obj.display();
		obj.push(5);
		//obj.display();
		System.out.println("popped element : "+obj.pop());
		System.out.println("popped element : "+obj.pop());
		System.out.println("popped element : "+obj.pop());
		System.out.println("popped element : "+obj.pop());
		//obj.display();

	}
}