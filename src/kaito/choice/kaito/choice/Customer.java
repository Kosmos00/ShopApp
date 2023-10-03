package kaito.choice.kaito.choice;

public class Customer {
    String name;
    String size;
    private Clothing[] items;

    public void addItems(Clothing[] alonso) {
        items = alonso;

    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double suma = 0;
        for (int i = 0; i < items.length; i++) {
            suma += items[i].getPrice();
        }
        return suma;
    }

    public void setSize(int numSize) {
        switch (numSize) {
            case 1:
            case 2:
            case 3:
                size = "S";
                break;
            case 4:
            case 5:
            case 6:
                size = "M";
                break;
            case 7:
            case 8:
            case 9:
                size = "L";
                break;
            default:
                size = "X";
                break;
        }
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
}