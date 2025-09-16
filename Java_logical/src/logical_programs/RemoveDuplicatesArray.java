package logical_programs;

import java.util.HashSet;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
    int []arr= {10,20,30,30,20,10};
    HashSet<Integer> set=new HashSet<>();
    for(int num :arr)
    {
    	set.add(num);
    }
    System.out.println(set);

	}

}
