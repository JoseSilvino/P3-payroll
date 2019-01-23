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
public class Salaried extends Employee {
    
    public Salaried(String name, String street, int h_num, int number, double salary, String method,Schedule schedule) {
        super(name, street, h_num, number, salary, method,schedule);
    }
    public Salaried(Salaried old) {
        super(old);
    }
}
