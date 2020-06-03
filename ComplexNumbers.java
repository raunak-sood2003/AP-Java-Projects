import java.math.*;
public class ComplexNumbers 
{
	private int real;
	private int imaginary;
	public ComplexNumbers()
	{
		real = 1;
		imaginary = 1;
	}
	public ComplexNumbers(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	public ComplexNumbers(int real)
	{
		this.real = real;
		imaginary = 0;
	}
	static ComplexNumbers complexAdd(ComplexNumbers num1, ComplexNumbers num2)
	{
		int new_real = num1.getReal()+num2.getReal();
		int new_imaginary = num1.getImaginary()+num2.getImaginary();
		return new ComplexNumbers(new_real, new_imaginary);
	}
	static ComplexNumbers complexSub(ComplexNumbers num1, ComplexNumbers num2)
	{
		int new_real = num1.getReal()-num2.getReal();
		int new_imaginary = num1.getImaginary()-num2.getImaginary();
		return new ComplexNumbers(new_real, new_imaginary);
	}
	static ComplexNumbers complexMult(ComplexNumbers num1, ComplexNumbers num2)
	{
		int new_real = ((num1.getReal()*num2.getReal())-(num1.getImaginary()*num2.getImaginary()));
		int new_imaginary = (num1.getReal()*num2.getImaginary())+(num2.getReal()*num1.getImaginary());
		return new ComplexNumbers(new_real, new_imaginary);
	}
	static ComplexNumbers complexDiv(ComplexNumbers num1, ComplexNumbers num2)
	{
		double new_real = ((num1.getReal()*num2.getReal())+(num1.getImaginary()*num2.getImaginary()))/
				(Math.pow(num2.getReal(),2)*Math.pow(num2.getImaginary(), 2));
		double new_imaginary = -(num1.getReal()*num2.getImaginary())-(num2.getReal()*num1.getImaginary())/
				(Math.pow(num2.getReal(),2)*Math.pow(num2.getImaginary(), 2));
		return new ComplexNumbers((int)new_real, (int)new_imaginary);
	}
	public int getReal()
	{
		return real;
	}
	public int getImaginary()
	{
		return imaginary;
	}
	public void setReal(int x)
	{
		real = x;
	}
	public void setImaginary(int y)
	{
		imaginary = y;
	}
	public String toString()
	{
		return "" + real + " + " + imaginary + "i";
	}
	public static void main(String[] args)
	{
		ComplexNumbers num1 = new ComplexNumbers(1, 1);
		ComplexNumbers num2 = new ComplexNumbers(1,2);
		ComplexNumbers num3 = complexAdd(num1,num2);
		ComplexNumbers num4 = complexSub(num1,num2);
		ComplexNumbers num5 = complexMult(num1,num2);
		ComplexNumbers num6 = complexDiv(num1,num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	}
	

}
