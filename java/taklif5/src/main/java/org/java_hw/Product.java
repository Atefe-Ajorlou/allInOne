package org.java_hw;

public class Product {

    private int id;
    private String name;
    private Category category;
    private boolean off;

    public Product(int id, String name, Category category, boolean off) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.off = off;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", off=" + off + "]";
    }

}
