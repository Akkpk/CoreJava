package StreamAPI.FlatMapDemos;

import java.util.Arrays;
import java.util.List;

class Student{
    int id;
    String sname;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.sname = name;
        this.grade = grade;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        List<Student> l1 = Arrays.asList(
                new Student(101,"Aditya",'A'),
                new Student(102,"Tashrif",'B'),
                new Student(103,"Rakesh",'C')
        );

        List<Student> l2 = Arrays.asList(
                new Student(104,"Vishal",'A'),
                new Student(105,"Ayush",'B'),
                new Student(106,"Avinash",'C')
        );

        var li = Arrays.asList(l1,l2);

        li.stream().flatMap(sl->sl.stream().map(s->s.sname)).forEach(System.out::println);

    }
}
