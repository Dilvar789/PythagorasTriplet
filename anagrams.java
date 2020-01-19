
import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    char []ch1=s1.toCharArray();
    char []ch2=s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
        if (s1.length() == s2.length()) 
        {
            for (int i = 0; i < s1.length(); i++) 
            {
                    if(ch1[i]!=ch2[i])
                    {
                       break;
                    }
            }
             System.out.println("Anagrams");
        }
        else 
        {
            System.out.println("Not Anagrams");
        }
        sc.close();
}
}