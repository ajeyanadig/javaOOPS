import java.util.*;
class Stack{
	static Scanner input= new Scanner(System.in);
	int[] array;
	int size;
	int tos;
	Stack(int size){
		System.out.println("Stack constructed");
		tos=-1;
		array= new int[size];
		this.size=size;
	}
	void push(){
		System.out.print("Enter integer to be pushed :");
		int ele = input.nextInt(); 
		if(this.tos==size-1){
			System.out.println("Stack overflow");
			return;
		}
		this.tos++;
		array[tos]=ele;
		System.out.println("\n"+ele+" has been pushed to top of stack");
	}
	int pop(){
		if(tos==-1){
			System.out.println("Stack underflow/Stack is empty");
			return -1;
		}
		tos--;
		System.out.println(array[tos+1]+" is gonna be popped");
		return array[tos+1];
	}
	void showStack(){
		if(tos==-1){
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack : ");
		for(int i=0; i<=tos; i++){
			System.out.print(array[i]+" ");
		}
	}
}
public class Main{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of stack to get started");
		int size= sc.nextInt();
		Stack stack= new Stack(size);

		int choice=0;
		String driverLine="\n\n Enter 1 to check stack in array format L->R : bottom -> top"+
		"\n Enter 2 to push element into stack"+
		"\n Enter 3 to pop element from stack"+
		"\n Enter -1 to exit\n\n";
		while(choice!=-1){
			System.out.println(driverLine);
			choice=sc.nextInt();
			if(choice==2){
				stack.push();
			}
			else if(choice==3){
				stack.pop(); // memory leak pop returns int but i aint catching it cause gangsta life
			}
			else if(choice==1){
				stack.showStack();
			}
			else if(choice==-1){
				System.out.println("Ending program...");
				System.exit(0);
			}
			else{
				System.out.println("Please enter valid input");
			}
		}

	}
			//driver program
		// stack.push(10);
		// stack.push(120);
		// stack.push(10);
		// stack.push(20);
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.showStack();

}