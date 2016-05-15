/**
 * Created by TAWEESOFT on 4/21/16 AD.
 */
public class Product {

    private String name,size,color;

    public Product(Builder builder){
        this.name = builder.name;
        this.size = builder.size;
        this.color = builder.color;
    }

    public static class Builder {
        private String name ,size , color;

        public Builder(String name) {
            this.name = name;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }
        public Product build() {
            return new Product(this);
        }
    }

    public String toString() {
        return String.format("%s %s %s" , name ,size , color);
    }
    public static void main(String[] ar){
        Product product = new Product.Builder("Chair").size("3").color("red").build();
        System.out.println(product.toString());
    }
}
