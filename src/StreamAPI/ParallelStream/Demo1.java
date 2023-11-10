package StreamAPI.ParallelStream;

import java.util.Arrays;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        var sl = Arrays.asList(
                new Student("Aditya",100),
                new Student("Ad",90),
                new Student("Ak",50),
                new Student("Akp",70)
        );


        sl.parallelStream().filter(s->s.getScore()>=80).forEach(student -> System.out.println(student.getName()+" "+student.getScore()));

        //Stream to parallel stream
        sl.stream().parallel().filter(s->s.getScore()>=80).forEach(student -> System.out.println(student.getName()+" "+student.getScore()));
    }
}
