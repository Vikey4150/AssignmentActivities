package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input="Vigneshkumar";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> setChar= new LinkedHashSet<Character>();
		
		for (Character value : charArray) {
			
			if(value!=' ')
			setChar.add(value);
		}

		System.out.println(setChar);
	}
}
