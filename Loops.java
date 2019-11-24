import java.math.*;
public class Loops {
	/*
	 * Raunak Sood
	 * Mrs. Shkolnik
	 * AP Java
	 * Code for Loops Quiz
	 * */
	static void loop1(int n) //Prints 1-7 then 1-6...
	{
		for (int i = n; i>=1; i--)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
				//System.out.print(i-1);
			}
			System.out.println();
		}
	}
	static void loop3(int n) //Prints 1 then 1-2 then 1-3 ...
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
				//System.out.print(i-1);
			}
			System.out.println();
		}
	}
	static void loop2(int n) // Combos loop 1 and 3
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = n-1; i>=1; i--)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
				//System.out.print(i-1);
			}
			System.out.println();
		}
	}
	static void loop5(int n) //Prints n stars then n-1 stars...
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = n; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void loop6(int n) //Prints 1 star then 2 stars...n stars
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void loop4(int n) //Prints n once then n-1 twice then n-2 three times...
	{
		for (int i = n; i>=1; i--)
		{
			for (int j = i; j<=n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	static void loop8(int a, int b) //Prints numbers between a and b along with cube roots csv style
	{
		double num = 1.0/3;
		if (a<b)
		{
			for (int i = a;i<=b; i++)
			{
				System.out.println(i + ", "+Math.pow(i, num));
			}
		}
		else
		{
			System.out.println("First needs to be less than second!");
		}
	}
	static void strangeSum(int a, int b) //Prints sum of all numbers between a and b
	{
		int count = 0;
		if (a<=b)
		{
		for (int i = a; i<=b; i++)
		{
			count+=i;
		}
		System.out.println(count);
		}
		else
		{
			for (int i = b; i<=a; i++)
			{
				count+=i;
			}
			System.out.println(count);
		}
	}
	static void aWeekLeft(int day) //Tells you how many days until 7 days
	{
		for (int i = day; i> 7; i--)
		{
			System.out.println("You have "+ i+ " days left.");
		}
	}
	static void numsInBetween(int n) //Prints all numbers from -n to +n
	{
		int negN = -n;
		for (int i = negN+1; i<n; i++)
		{
			if (i == negN+1)
			{
				System.out.print(i);
			}
			else {
				System.out.print(" ,"+ i);
			}
		}
	}
	static void numsInBetweenSquares(int n) //Prints perfect squares between -n to +n
	{
		for (int i = 0; i<=n; i++)
		{
			if (Math.floor(Math.sqrt(i)) == Math.sqrt(i))
			{
				System.out.print(i +", ");
			}
		}
	}
	static void numsInBetweenOddNumbers(int n) //Prints odd numbers between -n and n
	{
		int negN = -n;
		for (int i = negN; i<=n; i++)
		{
			if (i%2 !=0)
			{
				System.out.print(i +", ");
			}
		}
	}
	static void pyramid (int n) //Prints n to 1, then n-1 to 1...
	{
		for (int i = n; i>=1; i--)
		{
			for (int j = i; j>=1; j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	static void rightpyramid(int n) //prints pyramid but with -- to fill whitespace
	{  
		int a =n;
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<i; j++)
			{
				System.out.print(" ");
			}
			for (int k = n; k>=i; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
		
	
	static void takeFive(int a, int b) //Prints numbers divisible by 5 between a and b
	{
		for (int i = a; i<=b; i++)
		{
			if (i%5 ==0)
			{
				System.out.println(i);
			}
		}
	}
	static void factorial(int n) //Prints n!
	{
		int count = 1;
		for (int i = 1; i<=n; i++)
		{
			count*=i;
		}
		System.out.println(count);
	}
	static void fibonacci(int n) //Prints fibonacci sequence till n rows
	{
		System.out.println(1);
		int count = 1;
		int first = 1;
		int second = 1;
		for (int i = 1; i<=n; i++)
		{
			int sum = first+second;
			first = second;
			second = sum;
			System.out.println(first);
		}
	}
	static void pattern1(int n) // 1,121,12321,1234321...
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			for (int a = i+1; a>=1; a--)
			{
				System.out.print(a);
			}
			System.out.println();
		}
		
	}
	static void pattern2(int n) //543212345, 4321234, 32123....
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = n; j>=1; j--)
			{
				System.out.print(j);
			}
			for (int k = 2; k<=n; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	static void countdown(int n) //counts down by fives from 100 until given number reached
	{
		for (int i = 100; i>=n; i-=5)
		{
			System.out.println(i);
		}
		System.out.println("I stopped.");
	}
	static void strangeProduct(int a, int b) //Prints the product of all number divisible by 2 in range
	{
		int count = 1;
		if (a<b)
		{
		for (int i = a; i<=b; i++)
		{
			if (i%2 == 0)
			{
				count*=i;
			}
		}
		}
		else
		{
			for (int i = b; i<=a; i++)
			{
				if (i%2 == 0)
				{
					count*=i;
				}
			}
		}
		System.out.println(count);
	}
	static void myspacedpattern(int n) 
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = n; j>=i; j--)
			{
				for (int k = n; k>=j; k--)
					{
					System.out.print("-"); }
					
					}
			System.out.print(i);
			System.out.println();
		}
	}
	static void staircase(int n)
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = 0; j<n-i; j++)
			{
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
	static void weirdspacedpattern(int n)
	{
		for (int i = 1; i<=n; i++)
		{
			for (int j = n; j>=i; j--)
			{
				for (int k = n; k>=j; k--)
					{
					System.out.print(" "); 
					
					}
			System.out.print(i);
			System.out.println();
		}}
	}
	static void tens(int a, int b)
	{
		for (int i = a; i <=b; i++)
		{
			if (i%10 == 0)
			{
				System.out.print(i +", ");
			}
		}
	}
	static void inchConverter(int n)
	{
		double inchInMile = 5280*12;
		double miles = n/inchInMile;
		double feet = (miles - Math.floor(miles))*5280;
		double inches = (feet-Math.floor(feet))*12;
		System.out.print("Miles "+ Math.floor(miles) + "\nFeet: "+ Math.floor(feet)+ "\nInches: " + inches);
	}
	static void timestable(int n)
	{
		for (int i = 1; i<=10; i++)
		{
			System.out.println("2 x " + i + "= "+ 2*i);
		}
		
	}
	static void gcf(int a, int b)
	{
		String num = "";
		for (int i = 1; i<=a; i++)
		{
			for (int j = 1; j<=b; j++)
			{
				if (a%i == 0 && b%j == 0 && i == j)
				{
					num+=i;
				}
			}
		}
		System.out.println(num.substring(num.length()-1));
	}
	public static void numberPyramid(int rows)
	{
		int a = 1;
		for (int i = 1; i<=rows; i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(a + " ");
				a++;

			}
		
		System.out.println();
		}
	}

	static void stuff(int rows)
	{
		String str = "7654321234567";
		for (int i = 0; i<=rows; i++)
		{
			System.out.println(str.substring(i,rows-i));
			for (int j = 0; j<=i; j++)
				{
				System.out.print(" ");
				}
		}
		
	}



	public static void main(String[] args)
	{
		/* Need to try:
		 * Review Scanner
		 */
		
		//loop2(7);
		//loop1(7);
		
		//strangeProduct(2,10);
		//countdown(86);
		//myspacedpattern(5);
		//tens(1,99);
		//inchConverter(100);
		//weirdspacedpattern(20);
		//loop3(7);
		//loop4(7);
		//loop5(7);
		//loop6(7);
		//loop8(10,50);
		//strangeSum(7,3);
		//aWeekLeft(11);
		//numsInBetween(17);
		//numsInBetweenSquares(10);
		//numsInBetweenOddNumbers(10);
		//pyramid(10);
		//newSqrt(3); //Work in progress
		//rightpyramid(5); //Work in progress
		//takeFive(1,99);
		//factorial(10);
		//fibonacci(15);
		//rightpyramid(5); //Work in progress
		//pattern1(5);
		//pattern2(5); //work in progress
		staircase(5);
		//timestable(2);
		//gcf(5,36);
		rightpyramid(5);
		//numberPyramid(7);
		//stuff(13);

}
	}
