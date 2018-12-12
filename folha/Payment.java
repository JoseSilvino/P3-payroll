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
        int or_month = today.get(GregorianCalendar.MONTH);
        int or_d = today.get(GregorianCalendar.DAY_OF_MONTH);
        today.add(GregorianCalendar.MONTH, 1);
        today.set(GregorianCalendar.DAY_OF_MONTH,1);
        do {
            today.add(GregorianCalendar.DAY_OF_MONTH, -1);
        }while(today.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY || today.get(GregorianCalendar.DAY_OF_WEEK) == GregorianCalendar.SUNDAY );
        int Day_Calculated = today.get(GregorianCalendar.DAY_OF_MONTH);
        today.set(GregorianCalendar.DAY_OF_MONTH,or_d);
        today.set(GregorianCalendar.MONTH,or_month);
        return Day_Calculated;
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
    public Payment(String base,int day,String day_of_week) {
        this.name = base.concat(" " + Integer.toString(day)+" "+day_of_week);
        System.out.println(this.name);
        if(!base.equals("mensal")) {
            this.frequency = day;
            switch (day_of_week.toLowerCase()) {
                case "domingo":
                    this.day_of_week = 1;
                    break;
                case "segunda":
                    this.day_of_week = 2;
                    break;
                case "terça":
                    this.day_of_week = 3;
                    break;
                case "quarta":
                    this.day_of_week = 4;
                    break;
                case "quinta":
                    this.day_of_week = 5;
                    break;
                case "sexta":
                    this.day_of_week = 6;
                    break;
                case "sabado":
                    this.day_of_week = 7;
                    break;
                default:
                    break;
            }
        }
        else{
            this.day = day;
        }
    }
}
