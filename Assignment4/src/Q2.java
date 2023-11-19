import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    	//Find Duplicate Elements in an array
    	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
         int maxElement = arr[0];
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > maxElement) {
		                maxElement = arr[i];
		            }
		        }
           int[] temp = new int[maxElement + 1];
           for (int i = 0; i < arr.length; i++) {
		            temp[arr[i]]++;
		        }
		       System.out.print("The duplicate elements in the given array are: ");
		        for(int i=0;i<temp.length;i++) {
		        	if(temp[i]>1) {
		        		System.out.print(i+" ");
		        		
		        	}
		        	
		        	
		        }
		        
		       
		    }
	}
