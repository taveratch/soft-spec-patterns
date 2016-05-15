/**
 * Created by WIT on 21-Apr-16.
 */
public class Product {
    private String name;
    private String size;
    private String color;

    @Override
    public String toString() {
        return String.format("%s %s %s",name,size,color);
    }

//    public Product(String name, String size, String color) {
//        this.name = name;
//        this.size = size;
//        this.color = color;
//    }
//
//    public Product(String name, String size) {
//        this.name = name;
//        this.size = size;
//    }
//
//    public Product(String name) {
//        this.name = name;
//    }
    public static class Builder{
    private String name = "";
    private String size = "";
    private String color = "";
    public Builder(String name){
        this.name=name;
    }
    public Builder color(String color){
        this.color = color;
        return this;
    }

    public Builder size(String size) {
        this.size = size;
        return this;
    }
    private Product build(){
        return new Product(this);
    }
}   private Product(Builder builder){
        this.name= builder.name;
        this.color = builder.color;
        this.size = builder.size;
    }
    public static void main(String[] args){
        Product product = new Product.Builder("Chair").color("blue").size("7").build();
        System.out.println(product);
    }
}
