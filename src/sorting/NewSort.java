package sorting;

import java.util.Scanner;

public class NewSort {
	void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp1 = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp1; 
        } 
    }

	public static void main(String[] args) {
		int[] p = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the list of numbers");
		for(int i=0;i<p.length;i++) {
			p[i]= in.nextInt();
		}
		NewSort n = new NewSort();
		n.sort(p);
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
        
	}

}
