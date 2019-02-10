package sorting;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int[] l = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the list of numbers");
		for(int i=0;i<l.length;i++) {
			l[i]= in.nextInt();
		}
		int temp=0;
		for(int i=0;i<l.length-1;i++) {
			for(int j= i+1;j<l.length;j++) {
				if(l[i]>l[j]) {
					temp=l[i];
					l[i]=l[j];
					l[j]=temp;
				}
			}
		}
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		

	}

}
