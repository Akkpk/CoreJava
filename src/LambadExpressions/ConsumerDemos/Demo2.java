package LambadExpressions.ConsumerDemos;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int esalary;
    String gender;

    public Employee(String ename, int esalary, String gen) {
        this.ename = ename;
        this.esalary = esalary;
        this.gender = gen;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee("Aditya",100000,"Male"));
        al.add(new Employee("Devid",100000,"Male"));
        al.add(new Employee("Merry",50000,"Female"));
        al.add(new Employee("Puja",40000,"Female"));
        al.add(new Employee("Don",10000,"Male"));

        //Function Interface
        Function<Employee, Integer> f = emp-> (emp.esalary*10/100);

        //Predicate
        Predicate<Integer> p = b->b>=5000;

        //Consumer
        Consumer<Employee> c = emp->{
            System.out.println(emp.ename);
            System.out.println(emp.esalary);
            System.out.println(emp.gender);
        };

        for (Employee e:al) {
            int bonus = f.apply(e);//InvokedFunction
            if(p.test(bonus)){//Invoked Predicate
                c.accept(e);//Invoked Consumer
                System.out.println(bonus);
                System.out.println();
            }
        }
    }
}
