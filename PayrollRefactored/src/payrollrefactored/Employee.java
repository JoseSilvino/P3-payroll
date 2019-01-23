/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrefactored;
import java.util.Calendar;
/**
 *
 * @author Neto
 */
public class Employee {
    private String name;
    private boolean Sindicated;
    private int number;
    private String street;
    private int house_number;
    private double salary;
    private double tax;
    private double actual_salary;
    private String payment_method;
    private Schedule payment_schedule;
    private int freq;
    private int sn;
    private boolean paid;
    

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isPaid() {
        return paid;
    }
    public int getSindn() {
        return sn;
    }
    public Schedule getPayment_schedule() {
        return payment_schedule;
    }

    public void setPayment_schedule(Schedule payment_schedule) {
        this.payment_schedule = payment_schedule;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }
    @Override
    public String toString() {
        String s = "Número do sindicato";
        if(sn!=-1)  s = s + Integer.toString(sn) + "\n";
        else s = "";
       return "Nome : " + name +"\nRua :" + street + "Número :" + house_number + "\nSalário :" + salary + "\nPagamento : "+payment_method+"\n" + s ;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double commision) {
        this.tax = commision;
    }

    public void setActual_salary(double actual_salary) {
        this.actual_salary = actual_salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }

    public double getActual_salary() {
        return actual_salary;
    }
    public int getHouse_number() {
        return house_number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public boolean isSindicated() {
        return Sindicated;
    }

    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSindicated(boolean Sindicated) {
        this.Sindicated = Sindicated;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public boolean isDay(Calendar today) {
        if(this.payment_schedule.getName().equals("mensal $")) {
            int day = this.payment_schedule.Dayof$(today);
            return day==today.get(Calendar.DAY_OF_MONTH);
        } else if(payment_schedule.getName().substring(0, 6).equals("mensal")) {
            return today.get(Calendar.DAY_OF_MONTH)==payment_schedule.getDay();
        }
        else {
            freq++;
            boolean to_ret = today.get(Calendar.DAY_OF_WEEK)==payment_schedule.getDay_of_week()&&freq==payment_schedule.getFrequency();
            if(to_ret) freq = 0;
            return to_ret;
        }
    }
    public Employee(String name,String street,int h_num,int number,double salary,String method,Schedule schedule) {
        this.name = name;
        this.street = street;
        this.house_number = h_num;
        this.number = number;
        this.salary = salary;
        this.payment_method = method;
        this.payment_schedule = schedule;
        this.freq = 0;
        this.sn=-1;
    }
    public void setSindn(int sn) {
        this.sn= sn;
    }
    public Employee(Employee old) {
        this.name = old.name;
        this.Sindicated = old.Sindicated;
        this.actual_salary = old.actual_salary;
        this.house_number = old.house_number;
        this.number = old.number;
        this.payment_method = old.payment_method;
        this.payment_schedule = new Schedule(old.payment_schedule);
        this.salary = old.salary;
        this.street = old.street;
        this.freq = old.freq;
        this.sn = old.sn;
    }
}
