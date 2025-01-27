import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter your age: ");
	    int age = sc.nextInt();
	    
	    System.out.print("Enter your monthly income: ");
	    double income = sc.nextDouble();
	    
	    System.out.print("Do you have any pending dues(true/false): ");
	    boolean dues = sc.nextBoolean();
	    
	    System.out.print("\n\n");
	    
	    if(age >= 18)
	    {
	        if(income >= 30000)
	        {
	            if(!dues)
	            {
	                System.out.println("You are eligible for premium membership.");
	            }
	            else
	            {
	                System.out.println("You are not eligible for premium membership as you have some pending dues.");
	            }
	        }
	        else
	        {
	            System.out.println("You are not eligible for premium membership as your income is less than ₹30,000.");
	        }
	    }
	    else
	    {
	        System.out.println("You are not eligible for premium membership as your age is below 18.");
	    }
	}
}
