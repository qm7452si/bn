import java.util.Scanner;

public class WattersPE5
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String sentence;
		char letter;
		int total=0;		
		
		System.out.println("Enter a sentence.");
		sentence = kb.nextLine().toLowerCase();
		
		System.out.println("Enter a letter.");
		letter = (kb.nextLine().toLowerCase()).charAt(0); //i was suprised this worked.
		
		for (int x = 0; x<sentence.length(); ++x)
		{
			if (sentence.charAt(x)==letter)
				total++;
		}
		System.out.println("There are " + total + " " + letter + "'s in your sentence.");
		//rururururrurururururuurururuururururu
	}
}