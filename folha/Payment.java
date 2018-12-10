/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.folha;

/**
 *
 * @author Neto
 */
import java.util.*;
import java.text.*;
public class Payment {
    private int day_of_week;
    private int frequency;
    private String name;
    //if is a different type(a specific day of month)
    private int day;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDay_Of_Week() {
        return day_of_week;
    }
    public void setDay_Of_Week(int day) {
        this.day_of_week = day;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getFrequency() {
        return frequency;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int Calculate(GregorianCalendar today) {
        today.add(GregorianCalendar.MONTH, 1);
        today.set(GregorianCalendar.DAY_OF_MONTH,1);
        do {
            today.add(GregorianCalendar.DAY_OF_MONTH, -1);
        }while(today.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY || today.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SUNDAY );
        System.out.println("today.get(GregorianCalendar.DAY_OF_MONTH) = "+ today.get(GregorianCalendar.DAY_OF_MONTH));
        return today.get(GregorianCalendar.DAY_OF_MONTH);
    }    
    public Payment(int i,GregorianCalendar today) {
        this.day = 0;
        if(i == 1) {
            this.name = "semanal 1 sexta";
            this.day_of_week = 6;
            this.frequency = 1;
        }
        if (i == 2) {
            this.name = "mensal $";
            this.day = Calculate(today);
        }
        if(i == 3) {
            this.name = "semanal 2 sexta";
            this.frequency = 2;
            this.day_of_week = 6;
        }
    }
    public Payment(Payment old) {
        this.day = old.day;
        this.day_of_week = old.day_of_week;
        this.frequency = old.frequency;
    }
    public Payment(String base,String day,String day_of_week) {
        this.name = base;
    }
}
