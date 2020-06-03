import java.math.*;
public class LineIn2D
{
	private double yInt;
	private double slope;
	
	public LineIn2D()
	{
		slope = 1;
		yInt = 0;
	}
	public LineIn2D(double yInt)
	{
		slope = 0;
		this.yInt = yInt;
	}
	public LineIn2D(double slope, double yInt)
	{
		this.yInt = yInt;
		this.slope = slope;
	}
	public boolean isParallel(LineIn2D other)
	{
		if (this.getSlope() == other.getSlope())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isPerpendicular(LineIn2D other)
	{
		double new_slope = -1.0/other.getSlope();
		if (this.getSlope() == new_slope)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public double getYCoordinate(double x)
	{
		return this.getSlope()*x+yInt;
	}
	public double getXCoordinate(double y)
	{
		return (y-yInt)/this.getSlope();
	}
	public double getSlope()
	{
		return slope;
	}
	public double getYInt()
	{
		return yInt;
	}
	public void setSlope(double s)
	{
		slope = s;
	}
	public void setYInt(double y)
	{
		yInt = y;
	}
	public String toString()
	{
		return "y = " + this.getSlope() + "x + " + this.getYInt();
	}
	public static void main(String[] args)
	{
		/*LineIn2D l1 = new LineIn2D();
		LineIn2D l2 = new LineIn2D(3);
		LineIn2D l3 = new LineIn2D(1,3);
		LineIn2D l4 = new LineIn2D(-1,2);
		LineIn2D l5 = new LineIn2D(1,4);
		System.out.println(l3.isParallel(l4));
		System.out.println(l3.isParallel(l5));
		System.out.println(l3.isPerpendicular(l4));
		System.out.println(l3.isPerpendicular(l5));
		System.out.println(l3.getXCoordinate(4));
		System.out.println(l3.getYCoordinate(0));
		System.out.println(l4.toString());*/
		int x = 8;
		if (x > 10)							
			if (x < 20)
				x = x -10;
		else
		{
			x += 1;
		}
		System.out.println(x);
		
	}
}
	
