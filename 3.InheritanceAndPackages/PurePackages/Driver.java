import java.util.*;
import p1.Max;
public class Driver{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Max m1= new Max();

		int n1,n2,n3;
		System.out.println("Enter 3 ints bitch");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int res= m1.max(n1,n2,n3);
		System.out.println(res);

		float f1,f2,f3;
		System.out.println("Enter 3 floats bitch");
		f1=sc.nextInt();
		f2=sc.nextInt();
		f3=sc.nextInt();
		float fres= m1.max(f1,f2,f3);
		System.out.println(fres);


		int[] arr1= {3,45,221,91};
		System.out.println(m1.max(arr1));
	}

}