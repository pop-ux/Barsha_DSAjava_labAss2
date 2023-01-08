package DsAssignment;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//get the number of transactions
		System.out.print("Enter the size of transaction array: ");
		int n = sc.nextInt();
		//Get the value of the transactions
		int[] transactions = new int[n];
		System.out.println("Enter the value of array: ");
		for(int i=0; i<n; i++) {
			transactions[i] = sc.nextInt();
			
		}
		//Get the number of targets
		System.out.print("Enter the total no of targets that needs to be achieved: ");
		int m = sc.nextInt();
		//for each target,check if it can be achieved
		for(int i=0; i<m; i++) {
			System.out.print("Enter the value of target: ");
			int target = sc.nextInt();
			//check if the target is achieveale
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += transactions[j];
				if(sum>=target) {
					System.out.println("Target achieved after" + (j+1) + "transactions");
					break;
					
				}
			}
			//if the target is not achievable print a message
			if(sum<target) {
				System.out.println("Target is not achievale");
			}
		}
		

	}

}
