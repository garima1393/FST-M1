package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Kelly");
        myList.add("Michael");
        myList.add("Kate");
        myList.add(3,"Rachel");
        myList.add(1,"Emiley");

        System.out.println("Print All the Names:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("The 3rd element in the list is: " + myList.get(2));
        System.out.println("Is Kate is in list: " + myList.contains("Kate"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Emiley");

        System.out.println("New Size of ArrayList: " + myList.size());
        System.out.println("Print All the Names:");
        for(String s:myList){
            System.out.println(s);
        }

    }
}
