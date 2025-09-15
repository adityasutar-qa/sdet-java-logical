package logical_programs;

public class Find_max_min {

	public static void main(String[] args) {
	int []arr = {10,2,99,50,25,42,150};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)max=arr[i];
		if(arr[i]<min)min=arr[i];
		
	}
 System.out.println("Maximum element is :" + max);
 System.out.println("Minimum element is :" + min);
	}

}
