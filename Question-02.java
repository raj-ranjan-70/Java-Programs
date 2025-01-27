public class Main
{
	public static void main(String[] args) {
    
	  int i = 5;
	  double d = 22.34;
	  boolean b = true;
	  char c = 'r';
	    
	  System.out.println("Before Conversion\n");
	  System.out.println("This is an Integer data type : " + i);
    System.out.println("This is an Double data type : " + d);
		System.out.println("This is an Boolean data type : " + b);
		System.out.println("This is an Character data type : " + c + "\n\n");
	    
	  double newi = i;
	  int newc = c;
	    
	  System.out.println("After Conversion\n");
	  System.out.println("This is an Integer data type converted from a Character data type: " + newc);
		System.out.println("This is an Double data type converted from an Integer data type: " + newi);
		System.out.println("This is an Boolean data type : " + b);
		System.out.println("This is an Character data type : " + c);
	}
}
