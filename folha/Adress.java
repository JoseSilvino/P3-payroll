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
public class Adress {
	private String street;
	private int number;
	public void setStreet (String street) {
		this.street = street;
	}
	public void setNumber (int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public int getNumber(){
		return number;
	}
	public Adress (Scanner input) {
		System.out.println("1st step : type the street's name");
		setStreet(input.nextLine());
		System.out.println("2nd step : type the house's number");
		setNumber(input.nextInt());
		input.nextLine();
	}
        public Adress (Adress old) {
            this.number = old.number;
            this.street = old.street;
        }
}