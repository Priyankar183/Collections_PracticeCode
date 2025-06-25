package Collections_Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicates
{
    String str = "priyanka";
    //Find duplicate characters in a string using collections
    public void FindDuplicatesCharInString() {

        char[] arr = str.toCharArray();
        HashSet<Character> a = new HashSet<Character>();
        HashSet<Character> b = new HashSet<Character>();

        for (char ch : arr) {
            if (!a.add(ch)) {
                b.add(ch);
            }
        }
        System.out.print(b);
    }

    public void FindOccuranceOfCharacters()
    {
    char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: arr)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
    }

    public void FindNonRepeatedCharacters()
    {
        char[] arr = str.toCharArray();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (char ch:arr)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    public void FindFirstDuplicateCharacter()
    {
        char[] arr = str.toCharArray();
        HashSet<Character> a = new HashSet<>();
        HashSet<Character> b = new HashSet<>();
        for(char c: arr)
        {
            if(a.contains(c))
            {
                System.out.println(c);
                return;
            }
            else
            {
                a.add(c);
            }
        }
        System.out.println(b);
    }


}
