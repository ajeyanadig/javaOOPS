import java.util.*;
public class BankAccount{
	//static attributes
	static Scanner sc= new Scanner(System.in);
	static double roi=0.02;
	static int counter;

	static{
		counter=0;
	}
	//attributes
	String name;
	int accountNumber=2;
	String accountType;
	double balance;
	

	BankAccount(String name, int accountNumber, String accountType, double balance){
		this.name=name;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
		this.balance= balance;
		BankAccount.counter++;

	}

	void withdrawAmount(double amount){
		if(amount>balance){
			System.out.println("\nInsufficient funds");
			return;
		}
		this.balance -= amount;
		System.out.println("New balance after deduction : "+this.balance);
	}
	void depositAmount(double amount){
		this.balance += amount;
		System.out.println("New balance after depositing : "+this.balance);
	}
	void showDetails(){
		System.out.println("\nname of acc holder: "+this.name);
		System.out.println("accountNumber of acc holder: "+this.accountNumber);
		System.out.println("accountType of acc holder: "+this.accountType);
		System.out.println("balance of acc holder: "+this.balance+"\n");
	}
	static void showNumberOfUsers(){
		System.out.println("no of users : "+counter);
	}

	static void displayROI(){
		System.out.println("Rate of Interest of Bank is : "+BankAccount.roi);
	}
	public static void main(String[] args) {
		BankAccount person1= new BankAccount("Ajeya",10010,"Savings",230000.234);
		BankAccount.roi=0.06;
		person1.showDetails();
		person1.displayROI();
		BankAccount person2= new BankAccount("Bakri",10011,"Current",530000.234);
		person2.showDetails();
		person2.displayROI();
		BankAccount.showNumberOfUsers();

	}
}