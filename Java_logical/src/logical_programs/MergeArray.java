package logical_programs;

public class MergeArray {

	public static void main(String[] args) {
	int []arr1= {1,2,3};
	int []arr2= {4,5,6};
	int []mergearray= new int[arr1.length+arr2.length];
	
	for(int i=0;i<arr1.length;i++)
	{
		mergearray[i]=arr1[i];
		
	}
	
	for(int i=0;i<arr2.length;i++)
	{
		mergearray[arr1.length+i]=arr2[i];
	}
	System.out.println("Merged array is : ");
	for(int num :mergearray)
	{
		System.out.println(num + "");
	}

	}

}
