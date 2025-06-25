package Collections_Programs;

import java.util.HashSet;

public class Duplicates
{
    //Find duplicate characters in a string using collections
    public void FindDuplicatesCharInString()
    {
    String str  = "PriyankaSuryakantnarkar";
    char[] arr  = str.toCharArray();
        HashSet<Character> a = new HashSet<Character>();
        HashSet<Character> b = new HashSet<Character>();

        for (char ch: arr)
        {
             if(!a.add(ch))
             {
                 b.add(ch);
             }
        }

        System.out.print(b);


    }
}
