import java.util.*;
import java.lang.Math;
public class ToBinary{
	public static void main(String args[]){
	Convert conv = new Convert(22);
	System.out.println(conv.result());
	}
}

class Convert{	
	int[] arr = new int [8];
	int top = 0;
	
	Convert(Integer x){
		for(int i = 7 ; i >= 0 ; i--){
			if(x >= (Math.pow(2, i))){
				push(1);	
				x = x - (int)Math.pow(2, i);	
			}else{
				push(0);
			}
		}
	}

	public void push(int x){
		System.out.println("Pushing " + x + " at index " + top);
		arr[7-top] = x;
		if(top < 7)
			top++;
	}

	public int pop(){
		int res = 0;
		if(arr[top]==1)
			res = (int)Math.pow(2, top);
		System.out.println("Pooping " + res + " from index " + top);
		if(top < 8)
			top--;
		return res; 
	}

	public int result(){
		int res = 0;
		for(int i = 7 ; i >= 0 ; i--){
			res = res + this.pop();
		}
		return res;
	}

	public void print(){
		System.out.println("value || idx ");
		for(int i = top ; i >= 0 ; i--){
			System.out.println(arr[i] + "||" + i);
		}
	}
}
