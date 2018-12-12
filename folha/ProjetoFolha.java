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
    public class ProjetoFolha {
	public static void Card(Scanner input,ArrayList<Employee> employees) {
            System.out.println("Type the employee's id");
		int emp_num = input.nextInt();
                input.nextLine();
                emp_num = search(employees,emp_num);
                if(emp_num!=-1) {
                Employee employee = employees.get(emp_num);
                if(employee.getType().getType() == 1) {
                    System.out.println("Type how many hours the employee worked");
		double hour = input.nextDouble();
                input.nextLine();
                employee.getType().sumActual(employee.getType().getSalary()*hour);        
                }
                else if(employee.getType().getType() == 2 || employee.getType().getType() == 3) {
                    employee.getType().sumActual(employee.getType().getSalary());
                }
                }
        }
        public static void Pay_employees(ArrayList<Employee> employees,GregorianCalendar today) {
            int t = employees.size();
            Employee actual;
            for(int i = 0 ; i < t ; i ++ ) {
                actual = employees.get(i);
                if(actual.isDay(today)) {
                    System.out.println("Paying "+actual.getName()+" "+actual.getType().getActual());
                    actual.getType().setActual(0);
                }
            }
        }
        public static ArrayList<Employee> copy_to_stack(ArrayList<Employee> copyed) {
            ArrayList<Employee> clone = new ArrayList<>();
            int t = copyed.size();
            for(int i = 0 ; i < t ; i ++) {
                clone.add(new Employee(copyed.get(i)));
            }
            return clone;
        }
        public static int search(ArrayList<Employee> employees,int id) {
            int t = employees.size();
            for(int i = 0 ; i < t ; i ++ ) {
                if(employees.get(i).getEmployee_number() == id) {
                    return i;
                }
            }
            return -1;
        }
        public static boolean was_day(GregorianCalendar today,ArrayList<Employee> employees,int unre) {
            int t = employees.size();
            GregorianCalendar before = new GregorianCalendar();
            before.set(GregorianCalendar.MONTH,today.get(GregorianCalendar.MONTH));
            if(unre == 1) {
                before.set(GregorianCalendar.DAY_OF_MONTH, today.get(GregorianCalendar.DAY_OF_MONTH)-1);
                int quantity = 0;
                for(int i = 0 ; i < t ; i ++) {
                    if(employees.get(i).isDay(before)) {
                        quantity ++ ;
                    }
                }
                if(quantity  != 0) {
                    for(int i  = 0 ; i < t ; i ++) {
                        if(employees.get(i).isDay(before)) {
                            if(employees.get(i).getType().getActual() == 0) {
                                quantity -- ;
                            }
                        }
                    }
                }
                    if(quantity == 0 ) {
                        return true;
                    }
            }
            else if(unre == 2) {
                before.set(GregorianCalendar.DAY_OF_MONTH, today.get(GregorianCalendar.DAY_OF_MONTH)+1);  
                int quantity = 0 ;
                for(int i = 0 ; i < t ; i ++) {
                    if(employees.get(i).isDay(today)) {
                        quantity ++ ;
                    }
                }
                if(quantity!=0) {
                    for(int i = 0 ; i < t ; i ++) {
                        if(employees.get(i).isDay(today)&&employees.get(i).getType().getActual() == 0 ) {
                            quantity -- ;
                        }
                    }
                    if(quantity == 0 ) {
                        return true;
                    }
                }
            }

            return false;
        }
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
                Stack<ArrayList<Employee>> undo = new Stack<>();
                Stack<ArrayList<Employee>> redo = new Stack<>();
                ArrayList<Payment> Pay_types = new ArrayList<>();
                GregorianCalendar today = new GregorianCalendar();
                for(int i = 1 ; i < 4 ; i ++) {
                    Pay_types.add(new Payment(i,today));
                }
                int sind_number = 0;
		int j = 1,i=1;
		while (j==1){
			System.out.println("Type 0 to close the program\n"+"Type 1 to add a employee\n" + "Type 2 to remove a employee" );
			System.out.println("Type 3 to set a timecard");
			System.out.println("Type 4 to set a sell result");
                        System.out.println("Type 5 to set a service tax");
                        System.out.println("Type 6 to edit a employee's details");
                        System.out.println("Type 7 to print the payroll");
                        System.out.println("Type 8 to undo/redo");
                        System.out.println("Type 9 to change a employee's the payment schedule");
                        System.out.println("Type 10 to create a new payment schedule");
                        System.out.println("Today is " + today.getTime());
                        int decision = input.nextInt();
			input.nextLine();
                    switch (decision) {
                        case 0:
                            j=0;
                            break;
                        case 1:
                            {
                                undo.push(copy_to_stack(employees));
                                while(!redo.empty()) {
                                    redo.pop();
                                }
                                employees.add(new Employee(input,today));
                                int index = employees.size() - 1;
                                (employees.get(index)).setEmployee_number(i);
                                (employees.get(index)).Print_emp();
                                i++;
                                
                                break;
                            }
                        case 2:
                            {   
                                while(!redo.empty()) {
                                    redo.pop();
                                }
                                undo.push(copy_to_stack(employees));
                                System.out.println("type the employee's Number");
                                int e_Num = input.nextInt();
                                input.nextLine();
                                int index = search(employees,e_Num);
                                if(index > -1) {
                                    employees.remove(index);
                                }
                                break;
                            }
                        case 3:                            
                            while(!redo.empty()) {
                                    redo.pop();
                            }
                            undo.push(copy_to_stack (employees));
                            Card(input,employees);
                            break;
                        case 4:
                            {
                                undo.push(copy_to_stack (employees));
                                while(!redo.empty()) {
                                    redo.pop();
                                }
                                System.out.println("Type the employee's number");
                                int index = input.nextInt();
                                index = search(employees,index);
                                input.nextLine();
                                if(index!=-1) {
                                System.out.println("Type the sold item's price");
                                double price = input.nextDouble();
                                input.nextLine();
                                Employee actual = employees.get(index);
                                actual.getType().sumActual((price%100)*actual.getType().getCommision());
                                
                                }
                                break;
                            }
                        case 5:
                            {
                                undo.push(copy_to_stack (employees));
                                while(!redo.empty()) {
                                    redo.pop();
                                }
                                System.out.println("Type the employee's id");
                                int index = input.nextInt();
                                input.nextLine();
                                index  = search(employees,index);
                                if(index!=-1) {
                                    Employee user = employees.get(index);
                                    System.out.println("Type the tax(%) applied to "+ user.getName());
                                    double tax = input.nextDouble();
                                    input.nextLine();
                                    user.getType().sumActual(-((tax%100)*user.getType().getSalary()));
                                }
                                break;
                            }
                        case 6:
                            undo.push(copy_to_stack (employees));
                            while(!redo.empty()) {
                                redo.pop();
                            }
                            System.out.println("Type the employee's id");
                            int id = input.nextInt();
                            input.nextLine();
                            id = search(employees,id);
                            if(id!=-1) {
                            sind_number = employees.get(id).edit(input,sind_number);
                            }
                            break;
                        case 7:
                            undo.push(copy_to_stack (employees));
                            while(!redo.empty()) {
                                redo.pop();
                            }
                            Pay_employees(employees,today);
                            today.add(GregorianCalendar.DATE, 1);
                            break;
                        case 8:
                            System.out.println("Type 1 to undo\nType 2 to redo");
                            int unre = input.nextInt();
                            input.nextLine();
                            if(unre == 1) {
                                if(undo.empty()) {
                                    System.out.println("Can't undo");
                                }
                                else {
                                    
                                    if(was_day(today,employees,unre)) {
                                        today.add(GregorianCalendar.DAY_OF_MONTH, -1);
                                    }
                                    redo.push(copy_to_stack(employees));
                                    employees = undo.pop();
                                }
                            }
                            else if (unre == 2) {
                                if(redo.empty()) {
                                    System.out.println("Can't redo");
                                }
                                else {
                                    undo.push(copy_to_stack(employees));
                                    employees = redo.pop();
                                    if(was_day(today,employees,unre)) {
                                        today.add(GregorianCalendar.DAY_OF_MONTH, 1);
                                    }
                                }
                            }
                            break;
                    //PrintSchedule();
                        case 9:
                            System.out.println("Type the employee's id");
                            int identity = search(employees,input.nextInt());
                            input.nextLine();
                            Employee actual = employees.get(identity);
                            System.out.println(actual.getName()+" Choose an option");
                            int t = Pay_types.size();
                            for( int k = 0 ; k < t ; k ++ ){
                                System.out.println((k+1) + ": " +Pay_types.get(k).getName() );
                            }
                            int pt = input.nextInt();
                            actual.setPayment_Day(Pay_types.get(pt));
                            break;
                    //create schedule
                        case 10:
                            System.out.println("Type the new Payment Type");
                            String type_name = input.next();
                            int day = input.nextInt();
                            if(type_name.equals("semanal")) {
                            Pay_types.add(new Payment(type_name,day,input.next()));
                            }
                            else {
                                Pay_types.add(new Payment(type_name,day,""));
                            }
                            break;
                        default:
                            break;
                    }
		}
	}
    
}
