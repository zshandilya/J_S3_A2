import java.util.Scanner;

public class CheckPrimeDemoA2 {

	public static void main(String[] args) {

		CheckPrimeA2 x;
		int n;
		char ans;
		Scanner s=new Scanner(System.in);
		
		do {
			
			System.out.println("***** CHECK PRIME OR NOT??? *****");
			System.out.print("Enter the number: ");
			n=s.nextInt();
			
			if(n<0)
				System.out.println("Number can't be negative. Please retry ....");
			else {
				if(n==0 || n==1)
					System.out.println(n+" is neither a Prime nor a Composite number.");
				else {
					x = new CheckPrimeA2(n);
					if (x.IsPrime())
						System.out.println(n+" is a Prime Number.");
					else
						System.out.println(n+" is a Composite Number.");
				}
			}
			System.out.print("\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
		} while(ans=='y');
		s.close();
	}

}
