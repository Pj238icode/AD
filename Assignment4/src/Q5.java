import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		//Missing number in a given array
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	    int temp[]=new int[arr.length+1];
	    for(int ele:arr) {
	    	temp[ele-1]=1;
	    }
	    int missingnumber=0;
	    int flag=0;
	    for(int i=0;i<temp.length;i++) {
		  if(temp[i]==0) {
			  missingnumber=i+1;
			  flag=1;
			  break;
		   }
	  }
	  if(flag==1) {
		  System.out.println("The missing number in the given array is "+missingnumber);
	  }
	  else {
		  System.out.println("There is no missing number in the given array");
	  }
		
	}

}
