package part2;

public class Garment {
    // Attributes
    private String manufacturer;
    private String  color;
    private String style;
    private float price;

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(float price) { this.price = price; }

    private String getManufacturer() {
        return manufacturer;
    }
    private String getColor() {
        return color;
    }
    private String getStyle() {
        return style;
    }
    private float getPrice() {
        return price;
    }

    //Methods
    public void MoreStylishClothesMoreExpensivePrice (String style) {
        if (style == "beautiful") ;
        price = price * 2;
    }
    public void ColorWhitePriceCheaper (String color){
        if(color == "white")
        price = price - 100;
    }







}
