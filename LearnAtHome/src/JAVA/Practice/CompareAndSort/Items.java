package Basics.CompareAndSort;

public class Items implements Comparable<Items> {
    //
    private String title;
    private double price;

    //
    public void setTitle(String title) {
        this.title = title;
    }

    //
    public void setPrice(double price) {
        this.price = price;
    }

    //
    public String getTitle() {
        return title;
    }

    //
    public double getPrice() {
        return price;
    }

    //
    public Items(String title, double price) {
        setPrice(price);
        setTitle(title);
    }

    //
    @Override
    public String toString() {
        return title + " costs " + price + ((price < 2) ? " dollar" : " dollars");
    }

    //
    @Override
    public int compareTo(Items items) {
        if (this.price == items.getPrice()) return 0;
        if (this.price < items.getPrice()) return -1;
        return 1;
    }
}
