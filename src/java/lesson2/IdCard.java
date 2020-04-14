package lesson2;

import java.util.*;


public class IdCard extends Employee {
    private Date dateExpire;
    private int number;

    public IdCard(int n) {
        number = n;
    }

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setDateExpire(Date newDateExpire) {
        dateExpire = newDateExpire;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

}
