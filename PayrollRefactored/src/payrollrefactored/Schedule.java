/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrefactored;
import java.util.*;
/**
 *
 * @author Neto
 */
public class Schedule {
    private int day_of_week;
    private int frequency;
    private String name;
    private int day;

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setDay_of_week(int day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getDay_of_week() {
        return day_of_week;
    }
    public int Dayof$(Calendar today) {
       int or_month = today.get(Calendar.MONTH);
       int or_d = today.get(Calendar.DAY_OF_MONTH);
       today.add(Calendar.MONTH,1);
       today.set(Calendar.DAY_OF_MONTH,1);
       do {
           today.add(Calendar.DAY_OF_MONTH, -1);
       }while(today.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
       int day_cal = today.get(Calendar.DAY_OF_MONTH);
       today.set(Calendar.MONTH,or_month);
       today.set(Calendar.DAY_OF_MONTH,or_d);
       return day_cal;
    }
    public Schedule(Schedule old) {
        this.day = old.day;
        this.day_of_week = old.day_of_week;
        this.frequency = old.frequency;
        this.name = old.name;
    }
    public Schedule(String to_read) {
        if(!to_read.equals("mensal $")) {
        try (Scanner input = new Scanner(to_read)) {
            String base = input.next();
            int dia = input.nextInt();
            String dayofweek = input.next();
            base = base.toLowerCase();
            switch (base) {
                case "semanal":
                    this.frequency = dia;
                    switch(dayofweek.toLowerCase()) {
                        case "domingo":
                            this.day_of_week =1;
                            break;
                        case"segunda":
                            this.day_of_week = 2;
                            break;
                        case"terça" :
                            this.day_of_week = 3;
                            break;
                        case "quarta" :
                            this.day_of_week = 4;
                            break;
                        case "quinta" :
                            this.day_of_week = 5;
                            break;
                        case "sexta" :
                            this.day_of_week = 6;
                            break;
                        case"sábado" :
                            this.day_of_week = 7;
                            break;
                        default:
                            break;
                    }   this.name = to_read;
                    break;
                case "mensal":
                    this.day = dia;
                    this.name = to_read;
                    break;
                default:
                    javax.swing.JOptionPane.showMessageDialog(null,base + "é um tipo inválido de agenda");
                    break;
            }
        }
        }
        else {
                    this.name = to_read;
        }
    }
}
