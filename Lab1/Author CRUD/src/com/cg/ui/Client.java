package com.cg.ui;

import java.io.IOException;
import java.util.Scanner;

import com.cg.entity.AutEntity;
import com.cg.service.AutServiceImpl;

public class Client {

	public static void main(String[] args) {
		AutServiceImpl eService = new AutServiceImpl();
		AutEntity aut=null;
         boolean saved=false;
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter <firstname> <middlename> <lastname> <Mobile>");
		 aut= new AutEntity(scan.next(),scan.next(),scan.next(),scan.nextLong());
		saved = eService.saveAut(aut);
		if (saved)
			System.out.println("Auther table saved :)");
		else
			System.out.println("Auther table not saved :(");
		aut = null;
		System.out.println("Press enter to continue..");
		try {
			System.in.read();
		} catch (IOException e) {
		}
		System.out.println("Find Auther : Enter <id>");
		aut = eService.getAut(scan.nextInt());
		System.out.println("Emp found: " + aut);
		if (aut!= null) {
			System.out.println("Enter new phone no");
			aut.setPhoneno(scan.nextLong());
			saved = eService.update(aut);
			if (saved)
				System.out.println("Aut updated");
			else
				System.out.println("Aut could not be updated");
				}
	}}

