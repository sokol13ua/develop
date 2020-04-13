package part2;

public class CustomerGoods {
    // Attributes
    private int  utilityIsIncreasing;
    private float price;
    private float shelfLife;
    private String ingredients;
    private String manufacturer;
    private String currency;
    private String packaging;
    private String producerGrowsInGreenhouses;
    private boolean priceRisesThreeTimes;
    private boolean availabilityDependsOnSeason;


    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    private float getPrice() {
        return price;
    }
    private String getCurrency() {
        return currency;
    }
    private float getShelfLife(){
        return  shelfLife;
    }
    private String getPackaging(){ return packaging; }
    private String getManufacturer(){ return manufacturer; }

    //Methods
    public void сhangePriceDependOnColor(String color){
        if( color=="yellow")
            price = (float) (price*1.2);
    }
    public  String showManufacturerAndPrice(){
        return manufacturer + " - " + price;
    }
    public void morePackagingMorePrice(String packaging){
        if(packaging == "quality")
            price = (float) (price * 2.5);
    }
    public void lessShelfLifeLessprice (String shelfLife){
        if (shelfLife== "minimum")
            price = price /2;
    }
    public void naturalIngredientsShelfLifeSmall(String ingredients){
        if (ingredients== "natural")
            shelfLife = shelfLife - 5 ;
    }
    private static void chooseAFruit(String whichOf) {
        for (String a = whichOf; a == "Banana"; ) {
            System.out.println("Mango");
            System.out.println(a);
        }
    }
    public void chooseProducts(String products) {
        switch (products) {
            case "Vegetables":
                utilityIsIncreasing = utilityIsIncreasing *2;
                priceRisesThreeTimes = true;
                availabilityDependsOnSeason = false;
                producerGrowsInGreenhouses = "Depending on the fruit";
            case "Fruit":
                chooseAFruit("Orange");
                utilityIsIncreasing = utilityIsIncreasing *3;
                priceRisesThreeTimes = true;
                availabilityDependsOnSeason = true;
                producerGrowsInGreenhouses = "Brought from warm countries";
            case "Citrus":
                utilityIsIncreasing = utilityIsIncreasing *5;
                priceRisesThreeTimes = true;
                availabilityDependsOnSeason = true;
                producerGrowsInGreenhouses = "Depending on the citrus";
        }

    }
    public static void main(String[] args){

        CustomerGoods pizza = new CustomerGoods();
        pizza.setPrice(100);
        pizza.setCurrency("dollar");
        CustomerGoods fruit = new CustomerGoods();
        fruit.setPrice(1000);
        fruit.setManufacturer("Africa");
        fruit.chooseAFruit("apple");
        System.out.println(fruit.getPrice() + fruit.getManufacturer());
        System.out.println( "My pizza price is "+ pizza.getPrice() +pizza.getCurrency());
    }
}
