package charfinder;

public class Charfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Charfinder cf = new Charfinder();
		String s = "Praktikum";
		System.out.println("The first character of " + s + " is " + cf.getFirstChar(s));
		System.out.println("The last character of " + s + " is " + cf.getLastChar(s));
		cf.printAllCharPositions(s);
		cf.getCharPos(s, 'p');
		
		cf.countCharOccAlaWhileLoop(s, 'k');
		cf.countCharOccAlaForLoop(s, 'k');
		//char t = s.charAt(0);
		//System.out.println(s + " length is") + s.length();	
		//char l = s.charAt(s.length()-1);
		//System.out.println(l);
	}
	
	Character getFirstChar(String s) {
		Character ch = s.charAt(0);
		return ch;
	}
	
	Character getLastChar(String s) {
		Character ch = s.charAt(s.length() - 1);
		return ch;
	}
	
	void printAllCharPositions(String s) {
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		while (currentPosition <= lastPosition) {
			System.out.println(s.charAt(currentPosition) + " is at position " + currentPosition);
			currentPosition++;
		}
	}
	
	public void getCharPos(String s, Character toFind) 
	{
		s = s.toLowerCase();
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		Boolean found = false; 
		
		while (currentPosition <= lastPosition)
		{
			if (s.charAt(currentPosition) == toFind) 
			{
				found = true;
				System.out.println(toFind + " is at position " + currentPosition + " of " + s);
			}
			
			currentPosition++;
		} //Ende while-Schleife
		
		if(found == false)
		{
			System.out.println(toFind + " was not found");
		}
	}
	
	public void countCharOccAlaForLoop(String s, Character toFind) 
	{
		
		s = s.toLowerCase();
		Integer stringLength = s.length();
		Integer counter = 0;
		
		for(Integer i = 0; i < stringLength; i++) 
		{
			if(s.charAt(i) != toFind) 
			{
				continue;
			}
			else 
			{
				counter++;
			}
			
			if(counter == 0) {
				System.out.println(" " + toFind + " was not found in " + s + ".");
			}
		} 
			if(counter == 1) {
				System.out.println("There is " + counter + " occurence of " + toFind + " in " + s);
			} else {
				System.out.println("There are  " + counter + " occurrences of " + toFind + " in " + s + "." );
			}
			
	}
	
	//Mail an mondaca schicken
	
	public void countCharOccAlaWhileLoop(String s, Character toFind) 
	{		
			s = s.toLowerCase();
			Integer counter = 0;
			Integer currentPosition = 0;
			
			while(currentPosition < s.length()) 
			{
				
				if(s.charAt(currentPosition) == toFind) 
				{
					counter++;
				}
				
				if(counter == 0) 
				{
					System.out.println(" " + toFind + " was not found in " + s + ".");
				}
				
				currentPosition++;
			} 
				if(counter == 1) 
				{
					System.out.println("There is " + counter + " occurence of " + toFind + " in " + s);
				} 
				else 
				{
					System.out.println("There are  " + counter + " occurrences of " + toFind + " in " + s + "." );
				}			
		}
}


// for (Initialisierung, Abbruchbedingung, Inkrementierung){Anweisung}



