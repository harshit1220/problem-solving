/*public static boolean checkPangram(String str)
{
	boolean[] mark = new boolean[26];
	int index = 0;
	for (int i = 0; i < str.length(); i++) 
	{
	    if ('A'<= str.charAt(i)&& str.charAt(i) <= 'Z')
		{
			index = str.charAt(i) - 'A';
		}
		else if ('a' <= str.charAt(i)&& str.charAt(i) <= 'z')
		{
			index = str.charAt(i) - 'a';
		}
		else 
			continue;
		mark[index] = true;
	} 
	for (int i = 0; i <= 25; i++)
	{
		if (mark[i] == false)
		{
			return (false);
		}
	}       
	        return (true);
}
public static void main(String[] args)
{
	String str= "abcd efghijkl mnopqrst uvwxyz";//can be user input
	if (checkPangram(str) == true)
	{
		System.out.print(str + " \nis a pangram.");
	}
	else
	{
		System.out.print(str + " \nis not a pangram.");
	}
}*/
import java.util.Scanner;
public class CheckPangram {
    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ('A' <= ch && ch <= 'Z') {
                    index = ch - 'A';
                } else if ('a' <= ch && ch <= 'z') {
                    index = ch - 'a';
                }
                mark[index] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter a scentence to check if pangram or not: ");
        String str = var.nextLine(); // can be user input
        if (checkPangram(str)) {
            System.out.print(str + " \nis a pangram.");
        } else {
            System.out.print(str + " \nis not a pangram.");
        }
    }
}
