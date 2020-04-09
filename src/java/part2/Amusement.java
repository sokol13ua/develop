package part2;

public class Amusement {
    private float price;
    private  int age;
    private  String place;
    private float complexity;
    private Float noisiness;
    private String inventory;


    public void setAge(int age) {
        this.age = age;
    }
    public void setComplexity(float complexity) { this.complexity = complexity;}
    public void setPrice(float price){this.price = price;}

    private float getPrice() {
        return price;
    }
    private int getAge() {
        return age;
    }
    private String getPlace() {
        return place;
    }
    private float getComplexity() {
        return complexity;
    }

    //Methods

    public void complexityDependsOnAge (int age){
    if (age==50)
        complexity = complexity + 10;
    }
    public void сhangePriceDependOnPlace(String place){
       if(place == "beautiful")
           price = price*2;
    }
    public void MoreInventoryMorePrice (String inventory){
        if(inventory=="a lot of")
            price = price * 3;
    }
    public void LessInventoryLessNoisiness(String inventory){
        if(inventory == "little inventory")
            noisiness = noisiness - 10;
    }
   public void MoreComplexityLessAge (float complexity){
        if(complexity==(+10))
            age= age + 20;
   }
   public static void main(String[] args){
       Amusement tennis = new Amusement();
       tennis.setPrice(1000);
       tennis.setAge(10);


       System.out.println("Price and Age :" +" " + tennis.getPrice()  + "and" + tennis.getAge() );

   }

}