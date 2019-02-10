package sorting;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int[] p = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the list of numbers");
		for(int i=0;i<p.length;i++) {
			p[i]= in.nextInt();
		}
		int temp=0;
		for(int i=0;i<p.length-1;i++) {
			for(int j= i+1;j<p.length;j++) {
				if(p[i]>p[j]) {
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		

	}

}
