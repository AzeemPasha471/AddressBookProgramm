package com.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AdressBookMain {
	
	 static ArrayList<ContactInfo> user = new ArrayList<ContactInfo>();


	    public static void addContact() {
	        ContactInfo a1 = new ContactInfo();
	        a1.getInput();
	        user.add(a1);
	        System.out.println(user);
	    }

	    public static void addnewContact() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("add contact");
	        AdressBookMain.addContact();
	    }
	               
	           

	    public static void main(String[] args) {
	        System.out.println("Welcome to Address Book Programme");
	        //UC1
	        AdressBookMain.addContact();
	        //UC2
	        AdressBookMain.addnewContact();


	    }
	}