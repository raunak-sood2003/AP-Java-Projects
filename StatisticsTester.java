import java.util.ArrayList;
import java.util.Arrays;
public class StatisticsTester {	

	public static void main(String[] args) {
		double[][] arr = {{1,5,6,4,4,4,5,6,6,5,7,8,8,8},
						 {0,1,4,5,8,765,9,7},
						 {6,3,4,5,5},
						 {0,1}};
		double[][] copied = Arrays.copyOf(arr, arr.length);
		
		for (double[] list: copied) 
		{
			System.out.println("Average: "+Statistics.average(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Range: "+Statistics.range(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Median: "+Statistics.median(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Upper Quartile: "+Statistics.upperQuartile(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Lower Quartile: "+Statistics.lowerQuartile(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Interquartile Range: "+Statistics.interquartileRange(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Outliers: "+Statistics.outliers(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Standard deviation: "+Statistics.standardDeviation(list));
		}
		for (double[] list: copied) 
		{
			System.out.println("Z-score: "+Statistics.zScore(list, 1));
		}
		for (double[] list: copied) 
		{
			System.out.println("Mode: "+Statistics.mode(list));
		}
		

	}
}


