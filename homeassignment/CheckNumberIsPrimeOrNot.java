package week1.homeassignment;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		int n = 13;
		int count=0;
		for (int i = 2; i < n - 1; i++) {

			if (n % i == 0) {
				count=1;
				break;
			}

		}
		if (count==0)
			System.out.println("The number " + n + " is not a Prime number");
		else
			System.out.println("The number " + n + " is Prime number");
	}

	

}
