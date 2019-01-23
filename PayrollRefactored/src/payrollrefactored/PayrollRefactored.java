/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrefactored;
import java.util.*;
import my.PayrollGUI.*;
/**
 *
 * @author Neto
 */
public class PayrollRefactored {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Schedule> schedule = new ArrayList<>();
        Stack<ArrayList<Employee>> undo = new Stack<>();
        Stack<ArrayList<Employee>>redo = new Stack<>();
        schedule.add(new Schedule("semanal 1 sexta"));
        schedule.add(new Schedule("mensal $"));
        schedule.add(new Schedule("semanal 2 sexta"));
        PayrollGUI pg = new PayrollGUI();
        pg.employees = employees;
        pg.redo = redo;
        pg.undo = undo;
        pg.schedule = schedule;
        pg.setVisible(true);
        // TODO code application logic here
    }
    
}
