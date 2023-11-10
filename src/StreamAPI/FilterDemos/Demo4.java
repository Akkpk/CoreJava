package StreamAPI.FilterDemos;

import java.util.ArrayList;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<>();
        al.add(new Product(1,"HP",25000));
        al.add(new Product(2,"Dell",35000));
        al.add(new Product(3,"Lenovo",45000));
        al.add(new Product(4,"Sony",55000));
        al.add(new Product(5,"Apple",65000));

        al.stream().filter(p->p.price>50000).forEach(product -> System.out.println(product.price));
    }
}
