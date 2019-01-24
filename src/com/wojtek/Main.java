package com.wojtek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Locations> locations = new HashMap<>();
    public static void main(String[] args) {

        Map<String,Integer> tempExit = new HashMap<>();
        locations.put(0, new Locations(0, "Dom",tempExit));
        tempExit.put("Q",0);
        tempExit.put("W", 2);
        tempExit.put("E", 5);
        locations.put(1, new Locations(1, "Las",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("Q",0);
        tempExit.put("S", 4);
        tempExit.put("N", 3);
        locations.put(2, new Locations(2, "Szkola",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("Q",0);
        tempExit.put("E", 1);
        tempExit.put("S", 5);
        tempExit.put("W", 2);
        locations.put(3, new Locations(3, "Sklep",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("Q",0);
        tempExit.put("W", 0);
        tempExit.put("S", 2);
        tempExit.put("N", 3);
        locations.put(4, new Locations(4, "Park",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("Q",0);
        tempExit.put("E", 2);
        tempExit.put("N", 1);
        tempExit.put("S", 4);
        locations.put(5, new Locations(5, "Szpital",tempExit));


            int loc = 1;
        while (true) {
            if (loc == 0) {
                System.out.println("Nie ma ruchu");
            } else {
                System.out.println("Twoja lokalizacja to: " + locations.get(loc).getDescription());

            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.print("Mozesz isc do: ");
            for (String str :
                    exits.keySet()) {
                System.out.print(" " + str);
            }


            System.out.println();

            Map<String,String> vocbulary = new HashMap<>();
            vocbulary.put("QUIT","Q");
            vocbulary.put("NORTH","N");
            vocbulary.put("SOUTH","S");
            vocbulary.put("EAST","E");
            vocbulary.put("WEST","W");

            Scanner sc = new Scanner(System.in);

            String location = sc.nextLine().toUpperCase();

            if (location.length() > 1 ) {
                String[] name = location.split(" ");
                for (String word: name) {
                    if (vocbulary.containsKey(word)){
                        location = vocbulary.get(word);
                        break;
                    }
                }
            }

            loc = exits.get(location).intValue();


            if (exits.containsKey(location)) {

                System.out.println(locations.get(loc).getDescription());
            } else {
                System.out.println("zla lokacja");
            }


        }
    }
}
