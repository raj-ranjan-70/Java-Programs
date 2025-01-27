import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the total cart amount: ");
	    double amount = sc.nextDouble();
	    double discount, finalPrice;
	    if(amount > 5000)
	    {
	        discount = 0.2 * amount;
	        finalPrice = amount - discount;
	        System.out.printf("Discount: %.2f\n", discount);
	        System.out.printf("Amount: %.2f\n", finalPrice);
	    }
	    else if(amount >= 3000 && amount <= 5000)
	    {
	        discount = 0.1 * amount;
	        finalPrice = amount - discount;
	        System.out.printf("Discount: %.2f\n", discount);
	        System.out.printf("Amount: %.2f\n", finalPrice);
	    }
	    else
	    {
	        finalPrice = amount;
	        System.out.println("Discount: No discount");
	        System.out.printf("Amount: %.2f\n", finalPrice);
	    }
	}
}
