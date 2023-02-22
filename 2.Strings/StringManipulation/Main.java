import java.util.*;
import java.lang.*;
class Main{
	static Scanner sc = new Scanner(System.in);

	public static void addCommasInNumber(String input){
		StringBuilder newString= new StringBuilder();
		int length= input.length();
		int counter=0;
		while(length>0){
			newString.append(input.charAt(length-1));
			counter++;
			length--;
			if(counter%3==0&&length!=0){
				newString.append(",");
				counter=0;
			}
			
		}
		newString.reverse();
		System.out.println(newString);
	}
	public static void occurencesOfSubStringSplit(String mainString){
		System.out.println("Enter substring : ");
		String sub= sc.nextLine();
		//through split ?
		String arr[]=mainString.split(sub);
		System.out.println("No. of occurrences : "+(arr.length-1));
	}
	public static void occurencesOfStringBruteForce(String mainString){
		System.out.println("Enter substring : ");
		String sub= sc.nextLine();
		boolean flag;
		int count=0;
		int lengthToTraverse=mainString.length()-sub.length();
		for(int i=0;i<=lengthToTraverse;i++){
			flag=true;
			for(int j=0;j<sub.length();j++){
				if(sub.charAt(j)!=mainString.charAt(i+j)){
					flag=false;
					break;
				}	
			}
			if(flag){
				count++;
				for(int j=i;j<i+sub.length();j++){
					System.out.print(mainString.charAt(j));
				}
				System.out.println();
			}
		}
		System.out.println("No. of occurrences : "+count);
	}

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String input = sc.nextLine();
		System.out.println(input);

		//addCommasInNumber(input);  //add commas on string, US types 10,000,000, every third
		//occurencesOfSubStringSplit(input); //using split, length of array - 1 would be number of occurences
		occurencesOfStringBruteForce(input); //naiive approach, also pulls occurences, can do with indexOf also

	}
}