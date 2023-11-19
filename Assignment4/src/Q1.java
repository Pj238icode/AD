import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
    	//First Repeated Element in an array
    	//Note:-This algorithm only works for positive Numbers
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
		        int flag=0;
		        int ans=0;
		        for(int i=0;i<arr.length;i++) {
		        	if(temp[arr[i]]>1) {
		        		ans=arr[i];
		        		flag=1;
		        		break;
		        		
		        	}
		        	
		        	
		        }
		        if(flag==1) {
		        	System.out.println("The first repeated element in the given array is "+ans);
		        }
		        else {
		        	System.out.println("There is no repeated element in the given array");
		        }
		    }
	}
