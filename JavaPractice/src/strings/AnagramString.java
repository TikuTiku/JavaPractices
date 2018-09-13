package strings;

import java.util.Arrays;

public class AnagramString {
	
	public static void isAnagram(String s1,String s2)
	{
		String remvWhitespc1=s1.replaceAll("\\s", "");
		String remvWhitespc2=s2.replaceAll("\\s", "");
		
		boolean status=true;
		if(remvWhitespc1.length()!=remvWhitespc2.length())
		{
			System.out.println(s1+"string first and "+s2+"string second are not anagram");
			status=false;
		}
		else
		{
			//changing the case and converting to char array
			char[] stringArray1=remvWhitespc1.toLowerCase().toCharArray();
			char[] stringArray2=remvWhitespc2.toLowerCase().toCharArray();
			Arrays.sort(stringArray1);
			Arrays.sort(stringArray2);
			status=Arrays.equals(stringArray1, stringArray2);
		}
		if(status)
		{
			System.out.println(s1+"   and  "+s2 +" are anagram");
			
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagram");
		}
	}

	public static void main(String[] args) 
	{
		//Two string are called anagram if they contain same 
		//set of characters but in different order
		isAnagram("School Master","The Classroom");
		
		

	}

}
