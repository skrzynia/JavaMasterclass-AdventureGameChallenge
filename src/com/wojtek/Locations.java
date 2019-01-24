package com.wojtek;

import java.util.HashMap;
import java.util.Map;

public class Locations {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Locations(int locationID, String description, Map<String,Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q",0);
    }

    public void addExits(String move , int location){
        exits.put(move,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
