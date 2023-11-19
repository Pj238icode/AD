import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Maximum occuring element in an array
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
	        int max1=temp[arr[0]];
	        int max_element=0;
	        for(int i=0;i<arr.length;i++) {
	        	if(temp[arr[i]]>max1) {
	        		max1=temp[arr[i]];
	        		max_element=arr[i];
	             }
	        }
	        System.out.print("The max occuring element in the given array is "+max_element);
		
		
		
	}

}
