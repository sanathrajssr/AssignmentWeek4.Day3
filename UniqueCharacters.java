package AssignmentWeek4.Day3;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String name= "babu";
		Set<Character>names = new HashSet<Character>();
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length; i++) {
			if(!names.add(charArray[i])) {
				names.remove(charArray[i]);
			}
			 
			
		}
		System.out.println(names);
			
		}
		

	}


