package TestException;

import java.util.Scanner;

public class T {
	public static void main(String[] args) {
		try {
			int a ;
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
