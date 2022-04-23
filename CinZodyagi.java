package Projeler;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.print("Doðum yýlýnýzý giriniz: ");
		int yil=scan.nextInt();
		if(yil%12==0) System.out.println("Çin zodyaðý burcunuz: Maymun");
		if(yil%12==1) System.out.println("Çin zodyaðý burcunuz: Horoz");
		if(yil%12==2) System.out.println("Çin zodyaðý burcunuz: Köpek");
		if(yil%12==3) System.out.println("Çin zodyaðý burcunuz: Dom");
		if(yil%12==4) System.out.println("Çin zodyaðý burcunuz: Fazre");
		if(yil%12==5) System.out.println("Çin zodyaðý burcunuz: Öküz");
		if(yil%12==6) System.out.println("Çin zodyaðý burcunuz: Kaplan");
		if(yil%12==7) System.out.println("Çin zodyaðý burcunuz: Tavþan");
		if(yil%12==8) System.out.println("Çin zodyaðý burcunuz: Ejderha");
		if(yil%12==9) System.out.println("Çin zodyaðý burcunuz: Yýlan");
		if(yil%12==10) System.out.println("Çin zodyaðý burcunuz: At");
		if(yil%12==11) System.out.println("Çin zodyaðý burcunuz: Koyun");
		}

	}

}