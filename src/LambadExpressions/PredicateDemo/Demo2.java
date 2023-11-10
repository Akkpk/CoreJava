package LambadExpressions.PredicateDemo;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    public Employee(String name, int sal, int exp) {
        this.ename = name;
        this.salary = sal;
        this.experience = exp;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        //Lambda Expression for Objects

        //Ex 1
//        Employee emp = new Employee("John", 100000, 5);
//
//        //emp obj --> return name if salary>50000 and exp>3
//        Predicate<Employee> pr = e ->(e.salary>50000 && e.experience>3);
//        System.out.println(pr.test(emp));

        //Ex 2
        ArrayList<Employee> al = new ArrayList<>();

        Predicate<Employee> pr = e ->(e.salary>50000 && e.experience>3);

        al.add(new Employee("John", 80000, 4));
        al.add(new Employee("Adi", 40000, 2));
        al.add(new Employee("Aman", 50000, 5));
        al.add(new Employee("Aditya", 90000, 7));
        al.add(new Employee("Rakesh", 70000, 4));

        for(Employee e: al){
            if(pr.test(e)){
                System.out.println(e.ename+" "+e.salary);
            }
        }


    }
}
