package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Blue");
        hm.put(2,"Green");
        hm.put(3,"White");
        hm.put(4,"Black");
        hm.put(5,"Peach");
        System.out.println("the colour is removed is:" +hm.remove(3));
        if(hm.containsValue("Green"))
        {
            System.out.println("Green is present");
        }else{
            System.out.println("Green is not present in map");
        }
        System.out.println("The size of the hashmap is:" +hm.size());
    }
}
