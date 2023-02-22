package p1;
import java.util.*;
public class Max{
	public int max(int n1,int n2,int n3){
		int result=(n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
		return result;
	}

	public float max(float n1,float n2,float n3){
		float result=(n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
		return result;
	}

	public int max(int[] arr){
		int max= arr[0];
		for(int a:arr){
			if(a>max){
				max=a;
			}
		}
		return max;
	}
	
}