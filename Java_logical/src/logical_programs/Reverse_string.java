package logical_programs;

public class Reverse_string {

	public static void main(String[] args) {
		String str= "Automation";
		String reverse="";
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse string is :" + reverse);
	}
	
	
	
	
}
