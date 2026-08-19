package day3;
import java.util.Scanner;
public class Shuffle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=n/2;
		int arr1[]=new int[x];
		int arr2[]=new int[x];
		for(int i=0;i<x;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;x<n;i++) {
			arr2[i]=arr[x];
			x++;
		}
		x=n/2;
		for(int i=0;i<x;i++) {
			System.out.print(arr1[i]+" ");
			System.out.print(arr2[i]+" ");	
		}
		}
	}

