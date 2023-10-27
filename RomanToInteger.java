import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger 
	{

		public int romanToInt(String s) 
		{
			if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
		public static void main(String[] args) 
		{
			System.out.println("Enter a Roman value: ");
			Scanner sc=new Scanner(System.in);
			String romanString=sc.next();
			RomanToInteger romanToInteger = new RomanToInteger();
			String romanNumeral = romanString; // Example: Roman numeral for 1994
			int result = romanToInteger.romanToInt(romanString);
			
			System.out.println("Integer"+ result);
		}
}