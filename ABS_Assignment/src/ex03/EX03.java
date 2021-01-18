package ex03;

import java.util.Scanner;

public class EX03 {
	
	public static long fact(int n) {
		if(n == 1) {
			System.out.println(n + "! = " + 1);
			return n;
		} else {
			System.out.println(n + "! = " + n + " * " + (n - 1) + "!");
			return n * fact(n - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("���� ���� �Է�: ");
		n = sc.nextInt();
		
		if(n>=1 && n<=15) {
			System.out.println(fact(n));
		} else {
			System.out.println("1 �̻� 15 ������ ���� �Է����ּ���.");
		}

		sc.close();
		
	}

}
