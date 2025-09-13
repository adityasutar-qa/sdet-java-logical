package logical_programs;

public class Palindrome {

	public static void main(String[] args) {

    String pl="madam";
    String rev="";
    for(int i=pl.length()-1;i>=0;i--)
    {
    	rev=rev+pl.charAt(i);
    }
    if(rev.equals(pl))
    {
    	System.out.println("String is Palindrome");
    }
    else
    {
    	System.out.println("String is not palindrome");
    }

	}

}
