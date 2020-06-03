import java.util.Arrays;

public class algorithms {
	public static String arrayToString(int[] arr)
	{
		String str = "[";
		for (int i = 0; i<arr.length; i++)
		{
			str+=arr[i];
			if (i!=arr.length-1)
				{
				str+=" ";
				}
		}
		str+="]";
		return str;
	}
	
	public static int[] reverseOrder(int[] arr)
	{
		int[] dummy = new int[arr.length];
		int counter = 0;
		for (int i = arr.length-1; i>=0; i--)
		{
			dummy[counter] = arr[i];
			counter++;
		}
		return dummy;
	}
	
	public static boolean endWithY(String[] arr)
	{
		for (String str: arr)
		{
			if (str.charAt(str.length()-1) != 'y')
			{
				return false;
			}
		}
		return true;
	}
	
	public static int maxProduct(int[] arr)
	{
		int maxProd = 0;
		for (int i = 0; i<arr.length-1; i++)
		{
			for (int j = i+1; j< arr.length; j++)
			{
				int prod = arr[i]*arr[j];
				if (prod > maxProd)
				{
					maxProd = prod;
				}
			}
		}
		
		return maxProd;
	}
	
	public static int maxDifference(int[] arr)
	{
		int maxDiff = 0;
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				int diff = Math.abs(arr[i]-arr[j]);
				if (diff > maxDiff)
				{
					maxDiff = diff;
				}
			}
		}
		
		return maxDiff;
	} // {0,1,2,3,1,2,3}
	
	public static boolean nameEndsWithY(String[] arr)
	{
		for (String str: arr)
		{
			if (str.charAt(str.length()-1) != 'y')
			{
				System.out.println(str);
				return false;
			}
		}
		return true;
	}
	
	public static int[] toss()
	{
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*6) + 1;
		}
		
		return arr; // {2, 1, 1, 1, 3, 5} 
	}
	
	public static int maxRun(int[] arr)
	{
		int runCount = 0;
		int maxCount = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < arr.length-1; i++)
		{
			if (arr[i] == arr[i+1])
			{
				runCount++;
			}
			
			if (runCount > maxCount)
			{
				maxCount = runCount;
				maxIndex = i;
			}
		}
		
		maxCount++;
		
		return maxIndex-maxCount;
	}
	
	public static int[] rotLeft(int[] arr)
	{
		int dum = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = dum;
		
		return arr;
	}
	
	public static int[] rotRight(int[] arr)
	{
		int[] out = new int[arr.length];
		out[0] = arr[arr.length-1];
		int p = 1;
		for (int i = 0; i< arr.length-1; i++)
		{
			out[p] = arr[i];
			p++;
		}
		
		return out;
	}
	
	
	
	public static int minArray(int[] arr)
	{
		int minVal = arr[0];
		for (int i = 1; i<arr.length; i++)
		{
			if (arr[i]<minVal)
			{
				minVal = arr[i];
			}
		}
		return minVal;
		
	}
	public static void sortArrBubble(int[] arr)
	{
		int counter = arr.length;
		while (counter > 0)
		{
			for (int i = 0; i<arr.length-1; i++)
			{
				if (arr[i] > arr[i+1]) 
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			counter--;
		}
	}
	
	public static int findSingular(int[] arr)
	{
		int[] copy = Arrays.copyOf(arr, arr.length);
		sortArrInsertion(copy);
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] != arr[i-1])
			{
				return arr[i];
			}
		}
		
		return -1;
	}
	
	public static void sortArrSelection(int[] arr)
	{
		int counter = 0;
		int minNum = arr[0];
		while (counter < arr.length)
		{
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] < minNum)
				{
					minNum = arr[i];
					arr[counter] = minNum;
					counter++;
				}
			}
		}
	}
	
	
	public static boolean arrEqual(int[] arr1, int[] arr2)
	{
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i] != arr2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static int consecutiveInts(int[] arr)
	{
		int count = 0;
		for (int i = 0; i< arr.length-1; i++)
		{
			if (arr[i] == arr[i+1])
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		//int[] arr = toss();
		//System.out.println(arrayToString(arr));
		//System.out.println(maxRun(arr));
		//sortArrInsertion(arr);
		//System.out.println(arrayToString(reverseOrder(arr)));
		//String[] names = {"Johny", "Becky", "Fanny", "Sammy"};
		//System.out.println(nameEndsWithY(names));
		//System.out.println(consecutiveInts(arr));
		//System.out.println(arrayToString(rotRight(arr1)));
		//int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
		//int[] arr2 = {0, 1, 2, 3, 4, 5, 7};
		//System.out.println(arrEqual(arr1, arr2));
		int[] arr = {1, 1, 5, 2, 8, 9, 6};
		//sortArrSelection(arr);
		//System.out.println(arrayToString(arr));
		System.out.println(maxProduct(arr));

	}

}
