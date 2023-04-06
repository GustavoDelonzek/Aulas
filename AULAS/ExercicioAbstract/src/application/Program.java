package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number og tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Annual Income: ");
			double income = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double health  = sc.nextDouble();
				list.add(new PessoaFisica(name, income, health));
			} else {
				System.out.print("Number of employees :");
				int employees = sc.nextInt();
				list.add(new PessoaJuridica(name, income, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getName() + ": $" + String.format("%.2f", pessoa.impost()));
		}
		
		sc.close();
	}

}
