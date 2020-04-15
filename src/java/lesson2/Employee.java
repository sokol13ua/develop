package lesson2;


import java.util.HashSet;
import java.util.Set;

public class Employee extends Man {
    private String position;
    private IdCard iCard;
    private Set<Room> room = new HashSet<Room>();
    private Department department;
    private Set pastPosition = new HashSet();


    public Employee(String n, String s, String p) {
        name = n;
        surname = s;
        position = p;
    }

    public Employee() {

    }

    public void setRoom(Room newRoom) {
        room.add(newRoom);
    }

    public void setDepartment(Department d){ department = d; }

    public Department getDepartment(){ return department;}

    public Set getRoom() { return room; }

    public void deleteRoom(Room r) {
        room.remove(r);
    }

    public void setPastPosition(PastPosition p){ pastPosition.add(p); }

    public Set getPastPosition(){ return pastPosition; }

    public void deletePastPosition(PastPosition p){ pastPosition.remove(p); }

    public void setPosition(String newProfession) {
        position = newProfession;
    }

    public String getPosition() {
        return position;
    }

    public void setIdCard(IdCard c) {
        iCard = c;
    }

    public IdCard getIdCard() {
        return iCard;
    }
}
