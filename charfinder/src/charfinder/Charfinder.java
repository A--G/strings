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
	
	void getCharPos(String s, Character toFind) {
		s = s.toLowerCase();
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		Boolean found = false; 
		
		while (currentPosition <= lastPosition){
			if (s.charAt(currentPosition) == toFind) {
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
}







