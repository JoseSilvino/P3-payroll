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
public class Commisioned extends Employee {
    private double commision;
    public void setCommision(double commision) {
        this.commision = commision;
    }
    public double getCommision() {
        return commision;
    }
    public Commisioned(String name, String street, int h_num, int number, double salary, String method,Schedule schedule,Double commision) {
        super(name, street, h_num, number, salary, method,schedule);
        this.commision = commision;
    }
    public Commisioned(Commisioned old) {
        super(old);
        this.commision = old.commision;
    }
}
