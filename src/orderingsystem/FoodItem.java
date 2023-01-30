package orderingsystem;

public class FoodItem {
    protected String name;
    protected int price;
    public FoodItem(){
        name="Invalid item";
        price=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
