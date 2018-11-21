import java.util.Scanner;
import java.util.ArrayList;
public class payroll {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> items = new ArrayList<Employee>();
		for (int j =0;j<3;j++){
		System.out.println("Type 1 to add a employee");
		System.out.println("Type 2 to remove a employee");
		int decision = input.nextInt();
		input.nextLine();
		if(decision==1) {
				items.add(new Employee(input));
			}
		else if(decision==2) {
			int phrase = input.nextInt();
			int index = items.indexOf(getNumber()==phrase);
				items.remove(index);
				System.out.printf("%s\n",items.get(index));
			}
		}
	}
}