package Projeler;

import java.util.Scanner;

public class ArtikYilHesapla {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Y�l giriniz: ");
		int yil=scan.nextInt();
		if(yil%4==0) {
			System.out.println(yil+" Art�k y�ld�r.");
		}else
			System.out.println(yil+" Art�k y�l de�ildir.");

	}

}
