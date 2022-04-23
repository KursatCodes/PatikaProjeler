package Projeler;

import java.util.Scanner;

public class ArtikYilHesapla {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Yýl giriniz: ");
		int yil=scan.nextInt();
		if(yil%4==0) {
			System.out.println(yil+" Artýk yýldýr.");
		}else
			System.out.println(yil+" Artýk yýl deðildir.");

	}

}
