package logical_programs;

public class count_vowels_consonants {

	public static void main(String[] args) {
    String str="Automation";
    int vowels=0;
    int consonants=0;
    for(char c:  str.toCharArray())
    {
    	if("aeiouAEIOU".indexOf(c)!=-1)
    	{
    		vowels++;
    	}
    	else if(Character.isLetter(c))
    	{
    		consonants++;
    	}
       
    }
    System.out.println("Vowels;" +vowels+ ",Consonants:" +consonants);
	}

}
