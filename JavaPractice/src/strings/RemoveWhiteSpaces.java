package strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		//Removing white spaces using replaceAll method
		String str="Antilock Braking System";
		String removedWhiteSpaces=str.replaceAll("\\s", "");
		System.out.println(removedWhiteSpaces);

	}

}
