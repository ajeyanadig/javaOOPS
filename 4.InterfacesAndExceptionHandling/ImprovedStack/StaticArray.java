 class StaticArray implements stackInterface{
	int tos;
	int stack[];
	StaticArray(int size){
		stack= new int[size];
		tos=-1;
	}
	public void push(int ele){
		if(tos==stack.length-1){
			System.out.println("\nStack Overflow");
			return;
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
		for(int ele : stack){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
}