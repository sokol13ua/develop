package lesson2;

public  class Room extends Employee{
    private int number;

    public Room(int n){
        number = n;
    }
    public void setNumber(int newNumber){
        number = newNumber;
    }
    public int getNumber(){
        return number;
    }
}
