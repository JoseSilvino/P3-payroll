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
public class Employee {
	private String name;
	private Adress location;
	private Employee_types type;
	private Payment payment_day;
        private boolean to_sind,is_new;
	private int employee_number,sindicate_number;
        private double tax;
        private int payment_method;
        private int repetitions;
        /*
        1 check by courier
        2 check in hands
        3 bank deposit
        */
        public boolean isNew() {
            return is_new;
        }
        public boolean isDay(GregorianCalendar today) {
            if(!this.isNew()) {
                if(today.get(GregorianCalendar.DAY_OF_WEEK) == this.payment_day.getDay_Of_Week()) {
                    if(this.repetitions == this.payment_day.getFrequency()) {
                        this.repetitions = 1;
                        return true;                    
                    }
                    this.repetitions++;
                }
            }
            else {
                if(this.payment_day.getName().equals("mensal $")) {
                this.payment_day.setDay(this.payment_day.Calculate(today));
                }
                if(today.get(GregorianCalendar.DAY_OF_MONTH) == this.payment_day.getDay()) {
                    return true;
                }
            }
            return false;
        }
        public void setMethod(int method) {
            this.payment_method = method;
        }
        public int getMethod() {
            return payment_method;
        }
        public void setTax(double tax) {
            this.tax = tax;
        }
        public double getTax() {
            return tax;
        }
	public void setName (String name) {
		this.name = name;
	}
        public void setSindicate(int number) {
            this.sindicate_number = number;
        }
        public boolean isSind() {
            return to_sind;
        }
        public void toSind(boolean new_info) {
            this.to_sind = new_info;
        }
        public int getSindicate() {
            return sindicate_number;
        }
	public void setPayment_Day (Payment payment) {
		this.payment_day = payment;
	}
	public String getName() {
		return name;
	}
	public Adress getLocation() {
		return location;
	}
	public Employee_types getType() {
		return type;
	}
	public Payment getPay_Day() {
		return payment_day;
	}
	public void setEmployee_number (int number) {
		this.employee_number = number;
	}
	public int getEmployee_number () {
		return employee_number;
	}
	public void Print_emp() {
		System.out.printf("name : %s\n",this.name);
		System.out.printf("payment day : %s\n",this.payment_day);
		System.out.printf("street : %s\n",this.location.getStreet());
		System.out.printf("type : %s\n",this.type.getType());
		System.out.printf("id : %d\n",this.employee_number);
	}
        public int edit(Scanner input,int sind_number) {
            System.out.println("Type 1 to edit employee's name");
            System.out.println("Type 2 to edit employee's adress");
            System.out.println("Type 3 to edit employee's type");
            System.out.println("Type 4 to edit employee's payment method");
            System.out.println("Type 5 to edit employee's sindicate's information");
            int dec = input.nextInt();
            input.nextLine();
            switch (dec) {
                case 1:
                    System.out.println("Type the new name");
                    this.name = input.nextLine();
                    break;
                case 2:
                    System.out.println("Type the new adress");
                    this.location.setStreet(input.nextLine());
                    break;
                case 3:
                    System.out.println("Type the new type(1 to hourly 2 to salaried 3 to commisioned)");
                    this.type.setType(input.nextInt());
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("Type the payment method\n"+"1 check by courier\n" +"2 check in hands\n" +"3 bank deposit");
                    this.payment_method = input.nextInt() ;
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("Type 1 to add/remove from sindicate\nType 2 to change sindical tax");
                    int decision = input.nextInt();
                    input.nextLine();
                    if(decision == 1) {
                        if(this.to_sind) {
                            this.to_sind = false;
                            this.sindicate_number = -1;
                            this.tax = 0;
                        }
                        else {
                            this.sindicate_number = ++sind_number;
                            return sind_number;
                        }
                    }
                    else if(decision == 2) {
                        System.out.println("Type the new sindical tax");
                        this.tax = input.nextDouble();
                        input.nextLine();
                    }
                    break;
                default:
                    break;
            }
            return sind_number;
        }
	public Employee (Scanner input,GregorianCalendar today) {
		System.out.println("type the employee's name");
		setName(input.nextLine());
		System.out.println("type the employee's adress");
		this.location = new Adress(input);
		System.out.println("type the employee's type");
		this.type = new Employee_types(input);
                this.is_new = false;
                System.out.println("Type the payment method\n"+"1 check by courier\n" +"2 check in hands\n" +"3 bank deposit");
                setMethod(input.nextInt());
                input.nextLine();
                this.payment_day = new Payment(this.type.getType(),today);
                if(this.type.getType() == 2) {
                    this.is_new = true;
                }
                this.repetitions = 1 ;
	}
        public Employee (Employee to_copy) {
            this.name = to_copy.name;
            this.is_new = to_copy.is_new;
            this.employee_number = to_copy.employee_number;
            this.payment_day = new Payment (to_copy.payment_day);
            this.payment_method = to_copy.payment_method;
            this.repetitions = to_copy.repetitions;
            this.tax = to_copy.tax;
            this.to_sind = to_copy.to_sind;
            this.location = new Adress(to_copy.location);
            this.type = new Employee_types(to_copy.type);
        }
}
