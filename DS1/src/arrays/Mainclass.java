package arrays;

public class Mainclass
{
	public static void test(int[] arr,int rot)
	{
		System.out.println("Given array");
		printArray(arr);
		
		int[] temp = new int[rot];
		
		//process
		
		//copy rotating elements
		for(int index = 0; index<rot; index++)
		{
			temp[index] = arr[index];
		}
		
		//shift elements to left
		for (int i = 0; i < arr.length-rot; i++)
		{
			arr[i] = arr[i+rot];
		}
		
		//copy missing elements
		for (int i = 0,j = arr.length - rot; i < temp.length; i++,j++)
		{
			arr[j] = temp[i];
		}
		
		System.out.println("Rotated "+rot+" times from left");
		printArray(arr);
		
		countRot(arr);
		
		
	}
	
	public static void countRot(int[] arr)
	{
		int min = arr[0];
		int idx = -1;
		
		for (int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];//update min value
				idx = i;
			}
		}
		
		System.out.println("rotation count : "+(arr.length-idx));
	}
	
	public static void printArray(int[] arr)
	{
		for(int index = 0; index < arr.length; index++) 
		{
			System.out.print(arr[index]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
       int[] a1 = {20,40,60,100,250,300};
       test(a1,4);
	}
}
