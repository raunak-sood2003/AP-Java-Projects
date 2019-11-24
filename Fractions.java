/* Name: Raunak Sood
 * Course: AP Java
 * Teacher: Mrs. Schkolnik
 * Project: Fraction Class
 * Date: 5 November 2019
 */
import java.math.*;
public class Fractions {
	private int numerator;
	private int denominator;
	private Fractions()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	public Fractions(int numerator, int denominator)
	{
		if (denominator != 0)
		{
			this.numerator = numerator;
			this.denominator = denominator;
		}
		else
		{
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
		
	}
	public Fractions(int numerator)
	{
		this.numerator = numerator;
		this.denominator = 1;
	}
	/* 
	Method: gcf
	Purpose: finds gcf of two numbers
	Parameters: two integers
	Preconditions: Parameters are positive integers
	Postconditions: None
	Returns: gcf of two numbers
	*/
	public int gcf(int d1, int d2)
	{
		int gcd = 0;
		for (int i = 1; i<=d1 && i<=d2; i++ )
		{
			if (d1%i == 0 && d2%i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}
	/*
	Method:reduce
	Purpose: reduces a fraction to lowest whole numbers 
	Parameters: A fraction
	Preconditions: None
	Postconditions: None
	Returns: reduced fraction
	*/
	public Fractions reduce()
	{
		int numerator = this.getNumerator()/gcf(this.getNumerator(),this.getDenominator());
		int denominator = this.getDenominator()/gcf(this.getNumerator(),this.getDenominator());
		if (denominator != 1)
			{
			return new Fractions(numerator,denominator);
			}
		else
		{
			return new Fractions(numerator);
		}
	}
	/*
	Method:reciprocal
	Purpose: gets the reciprocal of a fraction 
	Parameters: None
	Preconditions: Numerator isn't zero
	Postconditions: None
	Returns: reciprocal of a fraction
	*/
	public Fractions reciprocal()
	{
		int new_numerator = this.getDenominator();
		int new_denominator = this.getNumerator();
		Fractions new_frac = new Fractions(new_numerator, new_denominator);
		return new_frac;
	}
	/*
	Method:equalParts
	Purpose: Check and simplify 1 in denominator 
	Parameters: None
	Preconditions: None
	Postconditions: None
	Returns: fraction without 1 in denominator
	*/
	public Fractions equalParts()
	{
		if (this.getDenominator() == 1)
		{
			Fractions new_frac = new Fractions(this.numerator);
			return new_frac;
		}
		else
		{
			return this;
		}
	}
	/* Method: addFraction
	Purpose: adds two fractions together
	Parameters: A fraction
	Preconditions: Positive fractions
	Postconditions: None
	Returns: Added Fractions*/
	public Fractions addFraction(Fractions other)
	{
		int new_numerator = (this.getNumerator()*other.getDenominator())+(this.getDenominator()*other.getNumerator());
		int new_denominator = this.getDenominator()*other.getDenominator();
		Fractions c = new Fractions(new_numerator, new_denominator);
		c = c.reduce();
		return c;
	}
	/* Method: subFraction
	Purpose: subtracts two fractions 
	Parameters: A fraction
	Preconditions: Positive fractions
	Postconditions: None
	Returns: Subtracted Fraction
	*/
	public Fractions subFraction(Fractions other)
	{
		int new_numerator = (this.getNumerator()*other.getDenominator())-(this.getDenominator()*other.getNumerator());
		int new_denominator = this.getDenominator()*other.getDenominator();
		Fractions c = new Fractions(new_numerator, new_denominator);
		c = c.reduce();
		return c;
	}
	/* Method: multFraction
	Purpose: Multiplies two fractions 
	Parameters: A fraction
	Preconditions: Positive fractions
	Postconditions: None
	Returns: Multiplied Fractions
	*/
	public Fractions multFraction(Fractions other)
	{
		int new_numerator = this.getNumerator()*other.numerator;
		int new_denominator = this.getDenominator()*other.denominator;
		Fractions new_frac = new Fractions(new_numerator, new_denominator);
		new_frac = new_frac.reduce();
		return new_frac;
	}
	/* Method: divFraction
	Purpose: Divides two fractions 
	Parameters: A fraction
	Preconditions: Positive fractions
	Postconditions: None
	Returns: Divided Fractions
	*/
	public Fractions divFraction(Fractions other)
	{
		Fractions reciprocal_frac = other.reciprocal();
		Fractions new_frac = this.multFraction(reciprocal_frac);
		new_frac = new_frac.reduce();
		return new_frac;
	}
	/*
	Method: toDecimal
	Purpose: converts fraction to decimal 
	Parameters: A fraction
	Preconditions: Positive fractions
	Postconditions: None
	Returns: Decimal version of fraction
	*/
	public double toDecimal()
	{
		return (double) this.getNumerator()/this.getDenominator();
	}
	public static Fractions toFraction(double decimal)
	{
		int whole_num = (int) decimal;
		int count = 1;
		double new_dec = 0;
		double dec = decimal-whole_num;
		while (dec <= 1)
		{
			new_dec = dec*10;
			count+=1;
		}
		int num = (int)new_dec;
		int denom = count*10;
		MixedNumbers mixed = new MixedNumbers(whole_num, new Fractions(num,denom));
		return mixed.conv2Fraction();
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
		
	}
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	public String toString()
	{
		Fractions new_frac = this.reduce();
		if (new_frac.getDenominator()==1)
		{
			return ""+numerator;
		}
		else 
		{
			return numerator + "/" + denominator;
		}
		
	}

	}
