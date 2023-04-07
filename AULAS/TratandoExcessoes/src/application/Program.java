package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}
	
	
	public static void method1() {
		System.out.println("----METODO 1 STARTS----");
		method2();
		System.out.println("----METODO 1 Ends----");
	}
	
	public static void method2() {
		System.out.println("----METODO 2 STARTS----");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException a){
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("----METODO 2 Ends----");
	}
}
