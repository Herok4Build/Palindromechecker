//import java.util.Scanner;
//Referenced https://stackoverflow.com/questions/4138827/check-string-for-palindrome
import java.util.*;
import java.lang.*;
public class Palindromechecker
{
    public static void main(String args[])
    {

        System.out.printf("Please enter a word to be checked.\n");

        Scanner p = new Scanner(System.in);

        String palindrome = p.nextLine();

        System.out.printf("%s is the word to be checked.\n", palindrome);

        char[] palindrometest = palindrome.toCharArray();

        int point_1= 0;
        
        int point_2= palindrometest.length-1;
        
        boolean checkfalse= true;

        for(point_1 = 0; point_1<point_2; ++point_1, --point_2)
        {
            if (palindrometest[point_1] != palindrometest[point_2])
            {
                System.out.printf("%s is not a palindrome. \n", palindrome);
                
                checkfalse = false;
                
                break;
            }
            checkfalse= true;
        }
        if (checkfalse==true)
            {
                System.out.printf("%s is a palindrome.\n", palindrome);
            }
    }
}
