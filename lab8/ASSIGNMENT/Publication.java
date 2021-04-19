package ASSIGNMENT;

public class Publication {

    String title;
    double price;

    public Publication(String title, double v) {
        this.price = v;this.title=title; //set1 ,
    }


    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String display() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
