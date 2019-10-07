package com.daniel;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Vw Golf");
        cars.add("Vw Polo");
        cars.add("Ford Focus");
        cars.add("Ford Fiesta");
        System.out.println(cars);
        TreeSet<String> trains = new TreeSet<String>();
        trains.add("steam");
        trains.add("diesel");
        trains.add("electric");
        System.out.println(trains);
        TreeMap<Integer, String> bakkies = new TreeMap<Integer, String>();
        bakkies.put(0, "Isuzu Kb");
        bakkies.put(1, "Toyota Hilux");
        bakkies.put(2, "Land Rover Defender");
        for(Map.Entry m:bakkies.entrySet())
        {
        System.out.println(m.getKey() + ""+ m.getValue());
        }
    }
}
