import java.util.Random;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int[]	arr; //creates array variable but no array
		arr = new int[20];	// create an array and store its reference in arr
		arr[2] = 5;	// sets element in index 2 equal to 5
		//System.out.println(arr[2]);
		
		Random rand = new Random(50);
		
		for(int i=0;i<arr.length;i++)
			arr[i] = rand.nextInt(50);
		
		for(int i=0;i<arr.length;i++)   
		  System.out.println(arr[i]);
		
	
	}

}
