import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) {
		int x;
		try{
			int a = Integer.parseInt(args[0]);
			x= 5/a;
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("Billus paije");
		
	}
}