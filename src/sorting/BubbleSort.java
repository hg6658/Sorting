package sorting;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the list of numbers");
		for(int i=0;i<a.length;i++) {
			a[i]= in.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j= i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
