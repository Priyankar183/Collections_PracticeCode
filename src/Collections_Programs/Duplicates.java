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

    public void Removeduplicatecharactersfromstring()
    {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> a = new HashSet<>();
        for (char ch : arr)
        {
            if(!a.contains(ch)) {
                a.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public void FindOccurenceOfDuplicateWordsInSentence()
    {
    String str1 = "Hare Rama Hare Krishna Krishna Krishna Hare Hare";
    String[] arrstr = str1.split(" ");
    HashMap<String,Integer> map = new HashMap<>();
    for (String a: arrstr)
    {
        map.put(a,map.getOrDefault(a,0)+1);
    }

    for(Map.Entry<String,Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    }

    public void RemoveDuplicateWordFromSentence()
    {
        String str = "Hare Govind Hare";

        String[] arrstr = str.split(" ");

        HashSet<String> a = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(String ss : arrstr)
        {
            if(!a.contains(ss))
            {
                a.add(ss);
                sb.append(ss);
            }
        }

        System.out.println(sb);
    }

    public void TwoStrings_DuplicateCharacters()
    {
        String s1 = "priyanka";
        String s2 = "tul";

        HashSet<Character> a = new HashSet<>();

        for(char c: s1.toCharArray())
        {
            a.add(c);
        }
        for (char c1 : s2.toCharArray())
        {
            if(a.contains(c1))
            {
                System.out.println("Duplicate characters found");
            }
        }
    }
}
