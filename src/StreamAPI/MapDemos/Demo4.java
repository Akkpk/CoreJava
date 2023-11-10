package StreamAPI.MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//collection -> stream -> filter -> map -> collect

class Employee{
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        List<Employee> empl = Arrays.asList(
                new Employee(101,"Aditya",200020),
                new Employee(102,"Aman",20320),
                new Employee(103,"Prince",20020),
                new Employee(104,"Rakesh",220020)
        );
        List<Double> el = new ArrayList<>();

        el=empl.stream().filter(e->e.sal>20030).map(emp-> emp.sal+emp.sal*0.5).collect(Collectors.toList());
        System.out.println(el);
    }
}
