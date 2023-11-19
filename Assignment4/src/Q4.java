import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		//Element pair with Maximum and Minimum Difference
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int maxfirst=0;
		int maxsecond=0;
		int minfirst=0;
		int minsecond=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		int maxdifference=0;
		int mindifference=max;
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int diff=Math.abs(arr[j]-arr[i]);
				
				if(diff>maxdifference) {
					maxdifference=diff;
					maxfirst=arr[j];
					maxsecond=arr[i];
				}
			
				if(diff<mindifference) {
					mindifference=diff;
					minfirst=arr[j];
					minsecond=arr[i];
				}
				
			}
		}
			
		
		System.out.println("The element pairs with max and min difference are "+"("+maxfirst+","+maxsecond+")"+" and ("+minfirst+","+minsecond+") respectively");
		
	}

}