package LambadExpressions.FunctionDemo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int esalary;

    public Employee(String name, int salary) {
        this.ename = name;
        this.esalary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Aditya", 200000));
        al.add(new Employee("Adi", 100000));
        al.add(new Employee("Aman", 50000));
        al.add(new Employee("Vivek", 20000));
        al.add(new Employee("Rosan", 2000));

        //lambda function for calculating the bonus of employees
        Function<Employee,Integer> f = e -> {
            int sal = e.esalary;
            if(sal>=20000&&sal<=200000){
                return sal*10/100;
            }else if(sal==2000){
                return sal*20/100;
            }else{
                return sal*5/100;
            }
        };

        Predicate<Integer> p = b->b>5000;//checking the bonus>5000

        for (Employee emp:al) {
            System.out.println("Employee Name: "+emp.ename);
            System.out.println("Employee salary: "+emp.esalary);

            int bonus = f.apply(emp);//calculating bonus

            if(p.test(bonus)){//checking the bonus>5000
                System.out.println("Employee bonus: "+bonus);
                System.out.println("Total amount: "+(f.apply(emp)+emp.esalary));
            }else{
                System.out.println("Total amount: "+emp.esalary);
            }

            System.out.println();
        }
    }
}
