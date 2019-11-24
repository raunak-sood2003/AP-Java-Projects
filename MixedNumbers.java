/* Project: Mixed Numbers
 */
public class MixedNumbers {
	private int wholeNumber;
	private int numerator;
	private int denominator;
	private Fractions fraction;
	public MixedNumbers()
	{
		this.numerator = 0;
		this.denominator = 1;
		this.wholeNumber = 0;
	}
	public MixedNumbers(int wholeNumber, int numerator, int denominator)
	{
		this.wholeNumber = wholeNumber;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public MixedNumbers(int numerator, int denominator)
	{
		if (denominator != 0)
		{
			this.numerator = numerator;
			this.denominator = denominator;	
			this.wholeNumber = 0;
		}
		else
		{
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
	}
	public MixedNumbers(int wholeNumber)
	{
		this.denominator = 1;
		this.wholeNumber = wholeNumber;
		this.numerator = 0;
	}
	public MixedNumbers(int wholeNumber, Fractions fraction)
	{
		if (fraction.getDenominator() != 0)
		{
			this.wholeNumber = wholeNumber;
			this.fraction = fraction;
		}
		else
		{
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
		this.wholeNumber = wholeNumber;
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public MixedNumbers(Fractions fraction)
	{
		this.fraction = fraction;
		this.numerator = this.fraction.getNumerator();
		this.denominator = this.fraction.getDenominator();
		this.wholeNumber = 0;
	}
	/*
	Method: conv2Fraction
	Purpose: converts mixed number to fraction 
	Parameters: None
	Preconditions: Must be used on a mixed number
	Postconditions: None
	Returns: fraction
	*/
	public Fractions conv2Fraction()
	{
		int new_numerator = (this.getDenominator()*this.getWholeNumber())+this.getNumerator();
		return new Fractions(new_numerator, this.getDenominator());
	}
	/*
	Method: toDecimal
	Purpose: converts mixed number to decimal 
	Parameters: None
	Preconditions: Must be used on a mixed number
	Postconditions: None
	Returns: double
	*/
	public double toDecimal()
	{
		Fractions new_frac = this.conv2Fraction();
		return new_frac.toDecimal();
	}
	/*
	Method: addMixedNumber
	Purpose: adds mixed numbers 
	Parameters: mixed number
	Preconditions: None
	Postconditions: None
	Returns: added mixed number
	*/
	public MixedNumbers addMixedNumber(MixedNumbers other)
	{
		Fractions converted1 = this.conv2Fraction();
		Fractions converted2 = other.conv2Fraction();
		Fractions frac = converted1.addFraction(converted2);
		MixedNumbers new_frac = new MixedNumbers(frac);
		return new_frac.simplifyMixedNumber();
	}
	/*
	Method: subMixedNumber
	Purpose: subtracts mixed numbers 
	Parameters: mixed number
	Preconditions: First mixed number must be greater than second
	Postconditions: None
	Returns: subtracted mixed number
	*/
	public MixedNumbers subMixedNumber(MixedNumbers other)
	{
		if (this.toDecimal() > other.toDecimal())
		{
			Fractions converted1 = this.conv2Fraction();
			Fractions converted2 = other.conv2Fraction();
			Fractions frac = converted1.subFraction(converted2);
			MixedNumbers new_frac = new MixedNumbers(frac);
			return new_frac.simplifyMixedNumber();
		}
		else
		{
			throw new IllegalArgumentException("First number must be larger than second!");
		}
		
	}
	/*
	Method: multMixedNumber
	Purpose: multiplies mixed numbers 
	Parameters: mixed number
	Preconditions: None
	Postconditions: None
	Returns: multiplied mixed number
	*/
	public MixedNumbers multMixedNumber(MixedNumbers other)
	{
		Fractions converted1 = this.conv2Fraction();
		Fractions converted2 = other.conv2Fraction();
		Fractions frac = converted1.multFraction(converted2);
		MixedNumbers new_frac = new MixedNumbers(frac);
		return new_frac.simplifyMixedNumber();
	}
	/*
	Method: divMixedNumber
	Purpose: divides mixed numbers 
	Parameters: mixed number
	Preconditions: None
	Postconditions: None
	Returns: divided mixed number
	*/
	public MixedNumbers divMixedNumber(MixedNumbers other)
	{
		Fractions converted1 = this.conv2Fraction();
		Fractions converted2 = other.conv2Fraction();
		Fractions frac = converted1.divFraction(converted2);
		MixedNumbers new_frac = new MixedNumbers(frac);
		return new_frac.simplifyMixedNumber();
	}
	/*
	Method: simplifyMixedNumber
	Purpose: simplifies improper fractions into mixed numbers 
	Parameters: None
	Preconditions: Positive mixed numbers
	Postconditions: None
	Returns: simplified improper fraction
	*/
	public MixedNumbers simplifyMixedNumber()
	{
		if (this.numerator > this.denominator)
		{
			int new_whole_number = this.getNumerator()/this.getDenominator();
			int new_numerator = this.numerator%this.denominator;
			return new MixedNumbers(new_whole_number, new_numerator, denominator);
		}
		else
		{
			return this;
		}
	}
	/*
	Method: reciprocal
	Purpose: gets reciprocal of mixed number
	Parameters: None
	Preconditions: positive mixed number, num and denom not zero
	Postconditions: None
	Returns: reciprocal of a mixed number
	*/
	public MixedNumbers reciprocal()
	{
		Fractions new_frac = this.conv2Fraction();
		Fractions new_new = new_frac.reciprocal();
		return new MixedNumbers(new_new);
		
		
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public int getWholeNumber()
	{
		return wholeNumber;
	}
	public Fractions getFraction()
	{
		return fraction;
	}
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
		
	}
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	public void setwholeNumber(int wholeNumber)
	{
		this.wholeNumber = wholeNumber;
	}
	public void setFraction(Fractions fraction)
	{
		this.fraction = fraction;
	}
	public String toString()
	{
		if (wholeNumber == 0)
		{
			if (numerator != 0)
			{
				return numerator+"/"+denominator;
			}
			else
			{
				return ""+0;
			}
		}
		else
		{
			return wholeNumber+" "+ numerator+"/"+denominator;
		}
	}
	}
