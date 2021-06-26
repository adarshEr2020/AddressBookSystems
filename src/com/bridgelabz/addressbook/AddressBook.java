package com.bridgelabz.addressbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	static List<Contact> list = new LinkedList<Contact>();

	//Created method for adding contact
	public static void addContact()
	{
		System.out.println("Enter your firstName : ");
		String firstName = sc.nextLine();
		System.out.println("Enter your lastName : ");
		String lastName = sc.nextLine();
		System.out.println("Enter your address : ");
		String address = sc.nextLine();
		System.out.println("Enter your city : ");
		String city = sc.nextLine();
		System.out.println("Enter your state : ");
		String state = sc.nextLine();
		System.out.println("Enter your pin : ");
		String pin = sc.nextLine();
		System.out.println("Enter your MobileNo : ");
		String MobileNo = sc.nextLine();
		System.out.println("Enter your email : ");
		String email = sc.nextLine();
		
		Contact obj = new Contact(firstName, lastName, address, city, state, pin, MobileNo, email);
		list.add(obj);
	}

	public static void main(String[] args) {
		System.out.println("***Welcome To Address Book System*** ");
		addContact();
        System.out.println(list);
	}
}