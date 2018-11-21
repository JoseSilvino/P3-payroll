import java.util.Scanner;
public class Employee {
	private String name;
	private String adress;
	private String type;
	private String payment_day;
	private int employee_number;
	public void setName (String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setType (String type) {
		this.type = type;
	}
	public void setPayment_Day (String payment) {
		this.payment_day = payment;
	}
	public void setEmployee_num(int number) {
		this.employee_number = number;
	}
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public String getType() {
		return type;
	}
	public String getPay_Day() {
		return payment_day;
	}
	public int getNumber(){
		return employee_number;
	}
	public Employee (Scanner input) {
		System.out.println("type the employee's name");
		setName(input.nextLine());
		System.out.println("type the employee's adress");
		setAdress(input.nextLine());
		System.out.println("type the employee's type");
		setType(input.nextLine());
		System.out.println("Type the payment day");
		setPayment_Day(input.nextLine());
		System.out.println("type the employee's number");
		setEmployee_num(input.nextInt());
	}
}