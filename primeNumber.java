import java.util.Scanner;
import java.lang.Math;

public class primeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n <= 1){
			System.out.println("Numner is not Prime");
		}
		else{
			for(int i=2 ; i<=Math.sqrt(n) ; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}else{
					continue;
				}
			}
			if(isPrime == true){
				System.out.println("Number is Prime");
			}
			else{
				System.out.println("Number is not prime");
			}
		}
	}
}
