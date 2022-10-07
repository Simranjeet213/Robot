package finalexam;

//-------------------------------------------------------
//Final Exam
//Written by: ( name: Simranjeet kaur and student id : 2102116)
//For “Programming Concepts I” Section (cohort 7) – Summer 2021
//--------------------------------------------------------


public class Complex {
	
	//instance variables
	private double real;
	private double imaginary;
	
	//default constructor
	public Complex()
	{
		real=0.0;
		imaginary=0.0;
	}
	
	//parameterised constructor
	public Complex (double realnum,double imagenum)
	{
		real=realnum;
		imaginary=imagenum;
	}
	
	//copy constructor
	public Complex(Complex ref)
	{
		real=ref.real;
		imaginary=ref.imaginary;
	}
	
	//tostring
	public String toString()
	{
		String stringoutput;
           stringoutput=String.format("%.2f + %.2f"+"*i",real,imaginary);
           
           return stringoutput;
	}
	//accessors
	public double getreal()
	{
		return real;
	}
	public double getimaginary()
	{
		return imaginary;
	}
	
	//mutators
	public void setreal(double realnumb)
	{
		real=realnumb;
	}
	public void setimaginary(double imagine)
	{
		imaginary=imagine;
	}

	//A public method called addition() that returns a new Complex object which is the
	//sum of the calling object and the passed object
	
	public Complex addition(Complex c2)
	{
		Complex temp=new Complex();
		temp.real=real+c2.real;
		temp.imaginary=imaginary+c2.imaginary;
		return temp;
		
	}
	
	//A public static method called multiplication() that returns a new Complex object
	//which is the product of two passed complex numbers.
	
	public static Complex multiplication(Complex c1,Complex c2)
	{
		Complex temp= new Complex(0,0);
		temp.real=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
		temp.imaginary=(c1.real*c2.imaginary)+(c1.imaginary*c2.real);
		return temp;
	}
	
	//equals method
	public boolean equals(Complex obj)
	{
		Complex c= (Complex)obj;
		if(real!=c.real)
			return false;
		else 
			if (imaginary!=c.imaginary)
				return false;
		else
		return true;
	}
	
	//swapping
	public void swapp(double r,double i)
	{
		this.real=i;
		this.imaginary=r;
	}
	
	//user entered number added to one of complex numbers
	public void addnum(double num)
	{
		this.real=this.real+num;
		this.imaginary=this.imaginary+num;
	}
	}
	
		
	

