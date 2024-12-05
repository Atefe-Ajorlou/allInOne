package org.java_hw;

import java.util.List;
import java.util.Objects;

import static org.java_hw.DigikalaApplication.log;

public class SearchService {

    private List<Category> categories;
    private List<Product> products;

    public SearchService(List<Category> categories, List<Product> products) {

        this.categories = categories;
        this.products = products;
    }


    protected List<Category> getCategories() {
        log.info("------ show all categories ------");
        return categories;
    }

    public List<Category> getCategories(String name) {
        log.info("------ show products by categories ------");
        return categories.stream()
                .filter(t -> t.getName().contains(name))
                .toList();
    }

    public List<Product> getProducts() {
        log.info("------ show all products ------");
        return products;
    }

    public List<Product> getProducts(String name) {
        log.info("------ show products by name ------");
        return products.stream()
                .filter(t -> t.getName().contains(name))
                .toList();
    }

    public List<Product> getProducts(Category category) {
        log.info("------ show products by category ------");
        return products.stream()
                .filter(t -> Objects.equals(t.getCategory().getName(), category.getName()))
                .toList();
    }
}
