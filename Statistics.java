import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.math.*;
public class Statistics 
{
	double[] array;
	public Statistics(double[] array)
	{
		this.array = array;
	}
	
	/*
	 * Method: average
	 * Purpose: get the average of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: average of numbers as double
	 */
	
	static double average(double[] arr)
	{
		double total = 0;
		for (double i: arr)
		{
			total+=i;
		}
		return total/arr.length;
	}
	
	/*
	 * Method: range
	 * Purpose: get the range of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: two or more elements in array
	 * Postconditions: None
	 * Returns: range of numbers as double
	 */
	
	static double range(double[] arr)
	{
		double[] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		double start = arr2[0];
		double end = arr2[arr2.length-1];
		return end-start;
	}
	
	/*
	 * Method: median
	 * Purpose: get the median of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: median of numbers as double
	 */
	
	static double median(double[] arr)
	{
		double[] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		if (arr2.length%2 == 0)
		{
			double med1 = arr2[arr2.length/2-1];
			double med2 = arr2[arr2.length/2];
			return (med1+med2)/2;
		}
		else
		{
			return arr2[arr2.length/2];
		}
	}
	
	/*
	 * Method: mode
	 * Purpose: get the mode of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: mode of numbers as double
	 */
	
	static ArrayList<Double> mode(double[] arr)
	{
		ArrayList<Double> list = new ArrayList<Double>();
		int maxCount=0;   
		for (int i = 0; i < arr.length; ++i)
		{
			int count = 0;
			for (int j = 0; j < arr.length; ++j)
			{
				if (arr[j] == arr[i])
				{
					++count;
				}
			}
			if (count > maxCount)
			{
				maxCount = count;
			    list.clear();
			    list.add(arr[i]);
			} 
			else if (count == maxCount)
			{
			      list.add( arr[i]);
			}
		}
		Collections.sort(list);
		for (int k = 0; k<list.size()-1; k++)
		{
			if (list.get(k).doubleValue() == list.get(k+1).doubleValue())
			{
				list.remove(k);
				k--;
			}
		}
			  return list;
	}
	
	
	/*
	 * Method: upperQuartile
	 * Purpose: get the upperQuartile of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: upperQuartile of numbers as double
	 */
	
	static double upperQuartile(double[] arr)
	{
		if (arr.length%2 == 0)
		{
			double[] copied_arr = Arrays.copyOf(arr, arr.length);
			ArrayList<Double> list = new ArrayList<Double>();
			Arrays.sort(copied_arr);
			for (double i: copied_arr)
			{
				list.add(i);
			}
			list.add(arr.length/2, Statistics.median(arr));
			ArrayList<Double> list2 = new ArrayList<Double>();
			for (int i = arr.length/2+1; i<list.size(); i++)
			{
				list2.add(list.get(i));
			}
			double[] finalarray = new double[list2.size()];
			for (int i = 0; i<finalarray.length; i++)
			{
				finalarray[i] = list2.get(i);
			}
			return Statistics.median(finalarray);	
		}
		else
		{
			double[] copied_arr = Arrays.copyOf(arr, arr.length);
			ArrayList<Double> list = new ArrayList<Double>();
			Arrays.sort(copied_arr);
			for (int i = arr.length/2+1; i<arr.length; i++)
			{
				list.add(copied_arr[i]);
			}
			double[] finalarray = new double[list.size()];
			for (int i = 0; i<finalarray.length; i++)
			{
				finalarray[i] = list.get(i);
			}
			return Statistics.median(finalarray);
		}
	}
	
	/*
	 * Method: lowerQuartile
	 * Purpose: get the lower quartile of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: lower quartile of numbers as double
	 */
	
	static double lowerQuartile(double[] arr)
	{
		if (arr.length%2 == 0)
		{
			double[] copied_arr = Arrays.copyOf(arr, arr.length);
			ArrayList<Double> list = new ArrayList<Double>();
			Arrays.sort(copied_arr);
			for (double i: copied_arr)
			{
				list.add(i);
			}
			list.add(arr.length/2, Statistics.median(arr));
			ArrayList<Double> list2 = new ArrayList<Double>();
			for (int i = 0; i<arr.length/2; i++)
			{
				list2.add(list.get(i));
			}
			double[] finalarray = new double[list2.size()];
			for (int i = 0; i<finalarray.length; i++)
			{
				finalarray[i] = list2.get(i);
			}
			return Statistics.median(finalarray);	
		}
		else
		{
			double[] copied_arr = Arrays.copyOf(arr, arr.length);
			ArrayList<Double> list = new ArrayList<Double>();
			Arrays.sort(copied_arr);
			for (int i = 0; i<arr.length/2; i++)
			{
				list.add(copied_arr[i]);
			}
			double[] finalarray = new double[list.size()];
			for (int i = 0; i<finalarray.length; i++)
			{
				finalarray[i] = list.get(i);
			}
			return Statistics.median(finalarray);
		}
	}
	
	/*
	 * Method: interquartileRange
	 * Purpose: get the interquartile range of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: interquartile range of numbers as double
	 */
	
	static double interquartileRange(double[] arr)
	{
		double upper = upperQuartile(arr);
		double lower = lowerQuartile(arr);
		return upper-lower;
	}
	
	/*
	 * Method: outliers
	 * Purpose: get the outliers of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: outliers of numbers as ArrayList
	 */
	
	static ArrayList<Double> outliers(double[] arr)
	{
		double upperOutlier = upperQuartile(arr)+(interquartileRange(arr)*1.5);
		double lowerOutlier = lowerQuartile(arr)-(interquartileRange(arr)*1.5);
		ArrayList<Double> list = new ArrayList<Double>();
		for (double i: arr)
		{
			if (i>=upperOutlier || i<=lowerOutlier)
			{
				list.add(i);
			}
		}
		return list;
	}
	
	/*
	 * Method: standardDeviation
	 * Purpose: get the standard deviation of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: standard deviation of numbers as double
	 */
	
	static double standardDeviation(double[] arr)
	{
		double mean = average(arr);
		double summand = 0;
		for (int i = 0; i<arr.length; i++)
		{
			summand+=Math.pow((arr[i]-mean),2);
		}
		double variance = summand/(arr.length-1);
		return Math.sqrt(variance);
	}
	
	/*
	 * Method: zScore
	 * Purpose: get the z-score of numbers in an array
	 * Parameters: array of type double
	 * Preconditions: one or more elements in array
	 * Postconditions: None
	 * Returns: z-score of numbers as double
	 */
	
	static double zScore(double[] arr, double num)
	{
		return (num-average(arr))/standardDeviation(arr);
	}
	

}
