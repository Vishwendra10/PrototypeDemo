package com;

import java.util.ArrayList;
import java.util.List;

public class Flight implements Cloneable{
    private List<String> deafultFlightList;

    public Flight() {
        this.deafultFlightList= new ArrayList<String>();
    }
    public Flight(List<String> deafultFlight) {
        this.deafultFlightList= deafultFlight;
    }

    public void loadDefaultFlightList()
    {
        deafultFlightList.add("IndiGo");
        deafultFlightList.add("GoAir");
        deafultFlightList.add("Spice Jet");
    }

    public List<String> getDefaultFlightList(){
        return this.deafultFlightList;
    }

    public Object clone() throws CloneNotSupportedException
    {
        List<String> temp= new ArrayList<>();
        for(String x: deafultFlightList)
        {
            temp.add(x);
        }
        return new Flight(temp);
    }
}
