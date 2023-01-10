// 8. Write the program that tell you which line pass through particular stations.
//Just use Zone 1 stations name.
package wk9;

import java.util.HashMap;

public class Two8 {
    public static void main(String[] args) {
        HashMap<String, String> station = new HashMap<>();
        station.put("Picadilly", "Picadilly");
        station.put("Waterloo", "Waterloo & City");
        station.put("Waterloo", "Jubliee");
        station.put("Oxford", "Bakerloo");
        station.put("king Cross", "Central");
        station.put("Oxford", "Victoria");

        System.out.println("Station & Tube Lines in Zone 1 :");
        System.out.println(station);

    }
}




