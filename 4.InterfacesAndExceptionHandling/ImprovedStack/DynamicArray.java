public class DynamicArray implements stackInterface{
	int tos;
	int stack[];
	DynamicArray(int size){
		stack= new int[size];
		tos=-1;
	}
	public void push(int ele){
		if(tos==stack.length-1){
			int newArray[]= new int[stack.length*2];
			for(int i=0;i<stack.length;i++){
				newArray[i]=stack[i];
			}
			stack=newArray;
			System.out.println("Array has been doubled !");
		}
		stack[++tos]=ele;
		System.out.println(ele+" has been added");
	}
	public int pop(){
		if(tos==-1){
			System.out.println("\nStack underflow, exiting program");
			System.exit(-1);
		}
		return stack[tos--];
	}
	public void display(){
		System.out.println("The stack is as follows :");
		for(int i=0;i<=tos;i++){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
}