package lamda;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;

    }
}
public class Run2 {
    public static void main(String[] args){

        List<Product> list = Arrays.asList(
                new Product(1,"dell",25000f),
                new Product(2,"HP",13000f),
                new Product(3,"toshiba",7000f),
                new Product(4,"Lenova",19999f),
                new Product(5,"accer",20000));

        Stream<Product> filterData = list.stream().filter(p->p.price<40000);

        filterData.forEach(p-> System.out.println(p.name + " : " + p.price));

    }
}
