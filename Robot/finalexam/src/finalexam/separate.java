package finalexam;
import java.util.Scanner;

//-------------------------------------------------------
//Final Exam
//Written by: ( name: Simranjeet kaur and student id: 2102116)
//For “Programming Concepts I” Section (cohort 7) – Summer 2021
//--------------------------------------------------------


public class separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       double r2=0.0,i2=0.0;
       
      /* Creates two Complex objects:
    	   o First one is created with the default constructor.*/
    	   
		Complex c1=new Complex();
		//Complex c2=new Complex(r2,i2);
		
	//welcome message
		System.out.println("----------------------------------------");
		System.out.println("Let's play with complex numbers!");
		System.out.println("----------------------------------------");
		
		// Outputs the descriptions of the two Complex objects created 
		System.out.printf("\nComplex number created with default constructor is ");
		System.out.println(c1);
		System.out.print("\nEnter real part of 2nd complex number:");
		 r2=sc.nextDouble();
		System.out.print("Enter the imaginary part of 2nd Complex number:");
		 i2=sc.nextDouble();
		System.out.print("Entered complex number is:");
		
		//second complex object created
		Complex c2=new Complex(r2,i2);
		System.out.println(c2);
		
		// Compares the two Complex objects for equality and displays the result
		if(c1.equals(c2))
			System.out.println("\nThe complex numbers"+c1+"and"+c2+" are equal");
		else
			System.out.println("\nThe complex numbers "+c1+" and "+c2+" are not equal");
		
		//Swaps the real and imaginary parts of the 2nd Complex object and display the resulting
		//Complex object.
		System.out.print("\nSwapping real and imaginary part of "+c2+" results in ");
		c2.swapp(r2,i2);
		System.out.println(c2);
		
		// used copy constructor
		//Changes the first Complex object’s content to be the same as that of the second one.
		
		c1=new Complex(c2);
		
		//Compares the two Complex objects for equality again and displays the result.
		if(c1.equals(c2))
			System.out.println("The complex numbers "+c1+" and "+c2+" are equal");
		else
			System.out.println("The complex numbers "+c1+" and "+c2+" are not equal");
		
		//Prompts the user for a number and adds this value to the real and imaginary part of first complex number.
		System.out.print("\nEnter a number please: ");
		double n=sc.nextDouble();
		
		System.out.print(c1+" has been changed to ");
		c1.addnum(n);
		System.out.print(c1);
		
		//Compares the two Complex objects for equality again and displays the result
		if(c1.equals(c2))
			System.out.println("\nThe complex numbers "+c1+" and "+c2+"are equal");
		else
			System.out.println("\nThe complex numbers "+c1+" and "+c2+" are not equal");
		
		//Adds the two Complex objects storing the result in the 1st Complex object and displays
		//the result
		System.out.print("\nAdding "+c1+" to "+c2+" results in the complex number ");
				c1=c1.addition(c2);
				System.out.println(c1);
				
	   //Multiplies the two Complex objects storing the result in the 2nd Complex object and
		//displays the result
		System.out.print("Multiplying "+c1+" to "+c2+" results in the complex number ");
		c2= Complex.multiplication(c1, c2);
		System.out.println(c2);
		
		//. Finishes of with a closing message giving the final values of the two Complex objects.

		System.out.println("\nSo after all this manipulation the original complex number have morphed into ");
		System.out.println(c1+" and "+c2);
		System.out.println("\nYou should now be comfortable with defining a class and manipulating objects,right?");
		System.out.println("On to bigger and better things!");
		sc.close();
				
				
		
		
	
	}

}
