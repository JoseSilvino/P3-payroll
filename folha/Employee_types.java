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
public class Employee_types {
	private double salary;
	private int type;
	private double commision ;
        private double actual_salary;
        public void setActual(double salary) {
            this.actual_salary = salary;
        }
        public void sumActual(double sum) {
            this.actual_salary += sum;
        }
        public double getActual() {
            return actual_salary;
        }
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setType (int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public void setCommision(double commision) {
            if(this.type == 3) {
		this.commision = commision;
            }
	}
	public double getCommision (){
            if(this.type == 3) {
		return commision;
            }
            return -1;
	}
	public Employee_types (Scanner input) {
		System.out.println("Type 1 if this employee is a hourly type\n" + "Type 2 if this employee type is salaried\n" + "Type 3 if this is a commisioned employee");
		setType(input.nextInt());
                input.nextLine();
                this.actual_salary = 0 ;
		System.out.println("type the employee's salary");
                if(input.hasNextDouble()) {
                    setSalary(input.nextDouble());
                    input.nextLine();
                    if(3 == this.type ) {
                        System.out.println("Type the employee's commission");
			setCommision(input.nextDouble());
                        input.nextLine();
                    }
                }
                else {
                    System.out.println("You didn't typed a valid number");
                }
	}
        public Employee_types (Employee_types old) {
            this.commision = old.commision;
            this.actual_salary = old.actual_salary;
            this.salary = old.salary;
            this.type = old.type;
        }
}
