package StreamAPI.MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("Car","Truck","Jeep");
        List<Integer> vehicleLen = new ArrayList<>();

//        without Streams
        for (String s: vehicles) {
            vehicleLen.add(s.length());
        }
        System.out.println(vehicleLen);

//        with stream
        vehicles.stream().map(s -> s.length()).forEach(System.out::println);


    }
}
