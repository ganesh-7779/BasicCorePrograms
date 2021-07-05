package bridgelabz;
import java.util.Scanner;
public class remainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator=sc.nextInt();
        System.out.println("Enter denominator:");
        int denominator=sc.nextInt();
        System.out.println("Quotient: "+numerator/denominator);
        System.out.println("Remainder: "+numerator%denominator);
        sc.close();
	}

}