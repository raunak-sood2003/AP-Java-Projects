import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
public class Lists_Arrays {
	static void getMax(int[] arr)
	{
		int maxval = arr[0];
		for (int i = 1; i<=arr.length; i++)
		{
			if (arr[i]>maxval)
			{
				maxval = i;
			}
		}
		System.out.println(maxval);
	}
	static void getMin(int[] arr)
	{
		int minval = arr[0];
		for (int i = 1; i<=arr.length; i++)
		{
			if (arr[i]<minval)
			{
				minval = i;
			}
		}
		System.out.println(minval);
	}
	static int[] varargs(int...a) //Allows us to use multiple arguments!!!
	{
		return a;
	}
	static int countMultiplesof3(int[] arr)
	{
		int count = 0;
		for (int i: arr)
		{
			if (i%3 == 0)
			{
				count+=1;
			}
		}
		return count;
	}
	static boolean longblah(ArrayList<String> list)
	{
		for (int i = 0; i<list.size(); i++)
		{
			if (list.get(i).length()>5)
			{
				list.set(i, "blah");
				return true;
			}
		}
		return false;
		
	}
	static int[] no3digits(ArrayList<Integer> arr)
	{
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i<arr.size(); i++)
		{
			if (arr.get(i) > 999 || arr.get(i)<100)
			{
				arr1.add(arr.get(i));
			}
		}
		int[] arr2 = new int[arr1.size()];
		for (int j = 0; j<arr1.size(); j++)
		{
			arr2[j] = arr1.get(j);
		}
		return arr2;
		
	}
	
	static int arrsum(int[] arr)
	{
		int sum = 0;
		for (int i: arr)
		{
			sum+=i;
		}
		return sum;
	}
	static int[] rowSum(int[][] mat)
	{
		int[] finalarr = new int[mat.length];
		for (int i = 0; i<mat.length; i++)
		{
			finalarr[i] = arrsum(mat[i]);
		}
		return finalarr;
	}

	public static void main(String[] args) {
//		int[] arr1 = new int[10]; //Initializes arr with size 10
//		int[] arr2 = {0,1,2,3,4,5,6,7,8,9};
//		int length_arr2 = arr2.length; //Not a method
//		//System.out.println(length_arr2);
//		ArrayList<Integer> arrls = new ArrayList<Integer>();
//		for (int i = 0; i<=10; i++) //Adds 0-10 to arrls
//		{
//			arrls.add(i);
//		}
//		int a = arrls.get(0);
//		//arrls.set(1, 2); //Must use set method to change element in array list
//		System.out.println(a);
//		System.out.println(arrls.get(1)); //Must use get method instead of indexing
//		arrls.add(2,3); //Adds 2 to position 3 and shifts everything to right
//		arrls.remove(2);
//		for (int i:arrls)
//		{
//			System.out.print(i + " ");
//		}
//		Remember: You can change the value of an array but you cannot change the size; you use 
//		ArrayList for that capability
//		int[] arr3 = new int[11]; //Must be careful when setting the size; ArrayLists are a better option
//		for (int i = 0; i<=10; i++)
//		{
//			arr3[i] = 1;
//		
//		}
//		for (int j:arr3)
//		{
//			System.out.print(j+" ");
//		}
//		int[][] arr2D = new int[3][3];
//		for (int i = 0;i<=2; i++)
//		{
//			for (int j = 0; j<=2; j++)
//			{
//				arr2D[i][j] = 0;
//			}
//		}
//		for (int[] a:arr2D) //Have to do this in order to display
//		{
//			for (int b: a)
//			{
//				System.out.print(b);
//			}
//			System.out.println();
//		}
//		ArrayList<String> blah = new ArrayList<String>();
//		blah.add("hi");
//		blah.add("goodbye");
//		blah.add("elephant");
//		blah.add("water");
//		longblah(blah);
//		for (String i: blah)
//		{
//			System.out.print(i + " ");
//		}
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(12);
//		arr.add(345);
//		arr.add(6);
//		arr.add(9001);
//		arr.add(877);
//		for (int i: no3digits(arr))
//		{
//			System.out.print(i + " ");
//		}
		
		int[][] arr = {{0,1,2,3,4},
				       {0,1,2,3},
				       {0,1}};
		
		int[] sec = rowSum(arr);
		for (int i = 0; i<sec.length; i++)
		{
			System.out.print(sec[i]+ " ");
		}
//		for (int i = 0; i<arr.length; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
		}
		

	}
	


