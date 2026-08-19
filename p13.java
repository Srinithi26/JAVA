package day3;
import java.util.*;
public class p13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1="SrInIthI".toLowerCase();
		//small to big===-32
		//big to small ==32
		int sum=0;
		for(int i=0;i<name1.length();i++) 
		{
			sum=sum+(name1.charAt(i)-96);	
		}
	System.out.println(sum);
	}

}
