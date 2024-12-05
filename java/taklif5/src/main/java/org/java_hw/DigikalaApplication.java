package org.java_hw;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class DigikalaApplication {

    static final Logger log = Logger.getLogger(DigikalaApplication.class.getName());

    public static void main(String[] args) {


        Category c1 = new Category(1, "Digital");
        Category c2 = new Category(2, "kid");
        Category c3 = new Category(3, "Car");
        Category c4 = new Category(4, "Sport");

        List<Category> categories = Arrays.asList(c1, c2, c3,c4);

        List<Product> products = Arrays.asList(
                new Product(1, "Samsung-A12", c1, true) ,
                new Product(2, "Toy puzzle", c2, false),
                new Product(3, "Mirror", c3, false),
                new Product(4, "iphone13", c1, false),
                new Product(5, "iphone14", c1, false),
                new Product(6, "iphone15", c1, false),
                new Product(7, "ball", c4, false),
                new Product(8, "Wheels", c3, true));

        SearchService ob = new SearchService(categories, products);

        log.info("------ user search method output ------");


        System.out.println(ob.getProducts());
        System.out.println(ob.getProducts("iphone13"));
        System.out.println(ob.getProducts(c1));
        System.out.println(ob.getProducts(c2));
        System.out.println(ob.getCategories());
        System.out.println(ob.getCategories("Digital"));
    }

}

