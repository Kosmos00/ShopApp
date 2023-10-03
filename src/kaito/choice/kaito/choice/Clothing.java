package kaito.choice.kaito.choice;

public class Clothing implements Comparable<Clothing>{
    String description;
    private double price;
    public final static double min_price = 10;
    String size = "M";
    public final static double TAX = 0.2;
    double total;
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
        this.total = 0;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double newPrice) {
        price = (newPrice > min_price) ? newPrice : min_price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price + price * TAX;
    }

    public String getSize() {
        return size;
    }

    public double getTax() {
        return TAX;
    }

    public double getTotal() {
        return total;
    }

    public void description() {
        //System.out.println(description + " is: " + " " + price + " " + size);
    }
    @Override
    public String toString(){
        return getDescription() + "," + getSize() + "," +getPrice();
    }
}