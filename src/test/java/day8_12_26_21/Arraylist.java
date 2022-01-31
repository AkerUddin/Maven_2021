package day8_12_26_21;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //Arraylist is a resizable array which means you dont need to add the lengh to add more array values

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhatten");


        //shortcut for println is sout lowercase
        System.out.println("My city is " + cities.get(2));



        ArrayList<Integer> StreetNumber = new ArrayList<>();
        StreetNumber.add(111);
        StreetNumber.add(112);
        StreetNumber.add(113);
        System.out.println("My third city is " + cities.get(2) + " and my third house number is " + StreetNumber.get(2));

    }
}
