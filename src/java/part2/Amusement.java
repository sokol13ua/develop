package part2;

public class Amusement {
    private float price;
    private  int age;
    private  String place;
    private float complexity;

    public void setAge(int age) {
        this.age = age;
    }
    public void setComplexity(float complexity) { this.complexity = complexity;}

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


}