package part2;

public class Sport {
    private int view;
    private float price;
    private  int  inventory;
    private  String  age;

    public void setView(int view) {
        this.view = view;
    }
    public void setInventory(int inventory) { this.inventory = inventory;}

    private int getView() {
        return view;
    }
    private float getPrice() {
        return price;
    }
    private int getInventory() {
        return inventory;
    }
    private String getAge() {
        return age;
    }
    //Methods
    public void MoreInventoryMorePrice (int inventory) {
        if (inventory == 5)
            price = price * 2;
    }
    public void AtAGreaterAgeHalfThePrice (String age){
        if (age == "old")
            price = price/2;
    }

}
