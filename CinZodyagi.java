package Projeler;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.print("Do�um y�l�n�z� giriniz: ");
		int yil=scan.nextInt();
		if(yil%12==0) System.out.println("�in zodya�� burcunuz: Maymun");
		if(yil%12==1) System.out.println("�in zodya�� burcunuz: Horoz");
		if(yil%12==2) System.out.println("�in zodya�� burcunuz: K�pek");
		if(yil%12==3) System.out.println("�in zodya�� burcunuz: Dom");
		if(yil%12==4) System.out.println("�in zodya�� burcunuz: Fazre");
		if(yil%12==5) System.out.println("�in zodya�� burcunuz: �k�z");
		if(yil%12==6) System.out.println("�in zodya�� burcunuz: Kaplan");
		if(yil%12==7) System.out.println("�in zodya�� burcunuz: Tav�an");
		if(yil%12==8) System.out.println("�in zodya�� burcunuz: Ejderha");
		if(yil%12==9) System.out.println("�in zodya�� burcunuz: Y�lan");
		if(yil%12==10) System.out.println("�in zodya�� burcunuz: At");
		if(yil%12==11) System.out.println("�in zodya�� burcunuz: Koyun");
		}

	}

}