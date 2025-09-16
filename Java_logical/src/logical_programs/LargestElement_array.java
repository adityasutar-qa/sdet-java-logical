package logical_programs;

public class LargestElement_array {

	public static void main(String[] args) {
    int [] arr= {100,251,625,780,969,999};
    int largest = arr[0];
    for(int num : arr)
    {
    	if(num>largest)
    	{
    		largest=num;
    	}
    }
	System.out.println("Largest element is :" + largest);

	}

	
}
