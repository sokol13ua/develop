package part2;

public class CustomerGoods {
    // Attributes
   private float price;
    private String[] ingredients;
    private  String manufacturer;
    private  String currency;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //Methods
    public void сhangePriceDependOnColor(String color){
        if( color=="yellow")
            price = (float) (price*1.2);
    }
    public  String showManufacturerAndPrice(){
        return manufacturer + " - " + price;
    }
    private float getPrice() {
        return price;
    }
    private String getCurrency() {
        return currency;
    }

    public static void main(String[] args){

        CustomerGoods pizza = new CustomerGoods();
        pizza.setPrice(100);
        pizza.setCurrency("dollar");

        System.out.println( "My pizza price is "+ pizza.getPrice() +pizza.getCurrency() );
        System.out.println();


    }


}
