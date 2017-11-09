package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.HibernateDatabase;

public class HibernateMain {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		HibernateDatabase hibernateDatabase = new HibernateDatabase();
		boolean flag = true;
		while (flag) {
			System.out.println("\n1.Insert\n2.Update\n3.Delete\n4.Show\n5.Exit");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("Please enter the firstname and lastname:");
				hibernateDatabase.insert(scanner.next(), scanner.next());
				break;
			case 2:
				System.out.println("Enter id and name to update:");
				hibernateDatabase.update(scanner.nextInt(), scanner.next());
				break;
			case 3:
				System.out.println("Enter the id to delete:");
				hibernateDatabase.delete(scanner.nextInt());
				break;
			case 4:
				hibernateDatabase.show();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
