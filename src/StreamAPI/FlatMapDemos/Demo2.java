package StreamAPI.FlatMapDemos;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        var teamA = Arrays.asList("Aditya","Rakesh","Tashrif");
        var teamB = Arrays.asList("Ayush","Abhishek","Anshu");
        var teamC = Arrays.asList("Abhishek","Ad","Vishal");

        var totalPlayers = Arrays.asList(teamA,teamB,teamC);

        //without Streams
        System.out.println("Without Streams");
        for (var team:totalPlayers) {
            for (var player:team) {
                System.out.println(player);
            }
        }

        //with Streams
        System.out.println("With Streams");
        totalPlayers.stream().flatMap(team->team.stream()).forEach(System.out::println);
    }
}
