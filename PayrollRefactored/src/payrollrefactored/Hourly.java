/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrefactored;

/**
 *
 * @author Neto
 */
public class Hourly  extends Employee{
    private double work_hours;

    public void setWork_hours(double work_hours) {
        this.work_hours = work_hours;
    }

    public double getWork_hours() {
        return work_hours;
    }
    public Hourly(String name, String street, int h_num, int number, double salary, String method,Schedule schedule) {
        super(name, street, h_num, number, salary, method,schedule);
        this.work_hours = 0;;
    }
    public Hourly(Hourly old) {
        super(old);
        this.work_hours = old.work_hours;
    }
}
