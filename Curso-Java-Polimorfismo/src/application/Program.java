package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> listTaxpayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxpayers = sc.nextInt();
		
		for(int i = 0; i < taxpayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			switch (ch) {
				case 'i':
					System.out.print("Health expenditures: ");
					double healthExpenditures = sc.nextDouble();
					listTaxpayer.add(new Individual(name, anualIncome, healthExpenditures));
					break;
				case 'c':
					System.out.print("Number of employees: ");
					int numberOfEmployees = sc.nextInt();
					listTaxpayer.add(new Company(name, anualIncome, numberOfEmployees));
					break;
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double totalTaxes = 0.0;
		
		for(TaxPayer taxpayer: listTaxpayer) {
			totalTaxes += taxpayer.tax();
			System.out.println(taxpayer.toString());
		}
		
		System.out.println();
		System.out.println("Total taxes: $ " + String.format("%.2f", totalTaxes));
		sc.close();
	}

}
