package day3;
import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//places in string constant pool
		String name="guru";
		char[] arr= {'g','u','r','u'};
		//places in heap memory
		String s1=new String(arr);
		String s2=new String("guru manoj");
		System.out.println(name);
		System.out.println(s1); 
		System.out.println(s2);//String concatenation 
		
		}
	}
