package Dsassignment;
import java.util.Scanner;

public class CurrencyDenomination {

	private static final int[] result = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int n = sc.nextInt();
		int[] denominations = new int[n];
		System.out.println("enter the currency denominations value");
		for(int i=0; i<n; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		int result[] = getMinimumNumberOfNotes(denominations,amount, n);
		System.out.println("your payment approach in order to give min no of notes will be");
		for(int i=0; i<n; i++) {
			if(result[i]!=0) {
				System.out.println(denominations[i]+":"+result[i]);
			}
		}

	}

	private static int[] getMinimumNumberOfNotes(int[] denominations, int amount, int n) {
		int[] result = new int[n];
		for(int i=n-1; i>=0; i--) {
			result[i] = amount%denominations[i];
		}
			
		return result;
		// TODO Auto-generated method stub
		
		
		

		
	}

}
