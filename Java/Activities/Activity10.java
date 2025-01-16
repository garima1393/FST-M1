package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println("The Hashset is:" +hs);
        System.out.println("The size of hashset is:" +hs.size());
        System.out.println("Removing B from hashset:" +hs.remove("B"));
        if(hs.remove("J")) {
            System.out.println("J removed from the Set");
        } else {
            System.out.println("J is not present in the Set");
        }
        if(hs.contains("D"))
        {
            System.out.println("D is present in hashset");
        }
        else{
            System.out.println("D is not present in the Hashset");
        }
        System.out.println("the updated hashset is :"+hs);
    }
}
