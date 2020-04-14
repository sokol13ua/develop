package lesson2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
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

    public static void main(String[] args) throws ParseException {
        IdCard card = new IdCard(123);
        card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
        IdCard sysEngineer = new IdCard(4);
        sysEngineer.setIdCard(card);
        sysEngineer.setName("Влад");
        sysEngineer.setPosition("Driver");
        Room room101 = new Room(101);
        Room room321 = new Room(321);
        sysEngineer.setRoom(room101);
        sysEngineer.setRoom(room321);
        System.out.println(sysEngineer.getName() + " работает в должности " + sysEngineer.getPosition());
        System.out.println("Удостоверение действует до " +
                new SimpleDateFormat("yyyy-MM-dd").format(sysEngineer.getIdCard().getDateExpire()));
        System.out.println("Может находиться в помещеньях:");
        Iterator iter = sysEngineer.getRoom().iterator();
        while (iter.hasNext()) {
            System.out.println(((Room) iter.next()).getNumber()); }
        Department programmersDepartment = new Department("Водителя");
        programmersDepartment.addEmployee(sysEngineer);
        System.out.println("Относится к отделу " + sysEngineer.getDepartment().getName());
        sysEngineer.setPosition("Сторож");
        System.out.println("В прошлом работал как:"+ sysEngineer.getPosition());
        Employee director = new Employee("Федор", "Дубов", "Директор");
        Menu menu = new Menu();
        Employee employees[] = new Employee[10];
        employees[0]= sysEngineer;
        employees[1] = director;
        Menu.showEmployees(employees);
        System.out.println("В отделе "+sysEngineer.getDepartment().getName()+" работает "
                +sysEngineer.getDepartment().getPersonCount()+" человек.");

    }
}
