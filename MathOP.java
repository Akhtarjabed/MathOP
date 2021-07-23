package assignment4;

import java.util.Scanner;

public class MathOP {
	
	private final double r;
	private final double i;
	MathOP(double r,double i){
		this.r=r;
		this.i=i;
	}
	
	public MathOP sum(MathOP other) {
		
		
		double r=this.r+other.r;
		double i=this.i+other.i;
		
		return new MathOP(r,i);
	}
	
	public MathOP sub(MathOP other) {
		
		
		double r=this.r-other.r;
		double i=this.i-other.i;
		
		return new MathOP(r,i);
	}
	
	public String toString() {
		return r+" + "+i+"i";
	}
	
	 void printComplexNumber()
	    {
	        System.out.println("Complex number: " + r + " + " + i + "i");
	    } 
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter the 1st real & imaginary part respectively: ");
		double r1=sc.nextDouble();
		double i1=sc.nextDouble();
		
		System.out.print("\nEnter the 2nd real & imaginary part respectively: ");
		double r2=sc.nextDouble();
		double i2=sc.nextDouble();
		
		MathOP c1=new MathOP(r1,i1);
		c1.printComplexNumber();
		
		MathOP c2=new MathOP(r2,i2);
		c2.printComplexNumber();
		
		MathOP sum=c1.sum(c2);
		MathOP sub=c1.sub(c2);
		
		System.out.println("\nAddition of two complex numbers: " + sum);
		System.out.println("Subtraction of two complex numbers: " + sub);
	}

}
