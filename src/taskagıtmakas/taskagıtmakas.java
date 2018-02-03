package taskagýtmakas;
import java.util.Random;
import java.util.Scanner;
public class taskagýtmakas {
	public static void main(String[] args) {
		Scanner veri = new Scanner(System.in);
		int secim,a,sen,rakip;
		sen=0;
		rakip=0;
		System.out.println("Lütfen kaç kez oynamak istediginizi giriniz : ");
		int sayi = veri.nextInt();
		for (int i=0;i<sayi;i++){	
			MenuGoster();
			secim=MenuSec();
			Random dusman = new Random();
			a=dusman.nextInt(2);
			a++;
				switch(secim){
					case 1:
						if(a==1){
							System.out.println("Tas-Tas Berabere");
							break;
						}else if(a==2){
							System.out.println("Tas-Kagit kaybettiniz :(");
							rakip+=1;
							break;
						}else if(a==3){
							System.out.println("Tas-Makas Kazandiniz :)");
							sen+=1;
							break;
						}
						System.out.println("Sen "+sen);
						System.out.println("Rakip "+rakip);
						break;
					case 2:
						if(a==1){
							System.out.println("Kagit-Tas Kazandiniz :)");
							sen+=1;
						}else if(a==2){
							System.out.println("Kagit-Kagit Berabere");
						}else if(a==3){
							System.out.println("Kagit-Makas Kaybettiniz :(");
							rakip+=1;
						}
						System.out.println("Sen "+sen);
						System.out.println("Rakip "+rakip);
						break;
					case 3:	
						if(a==1){
							System.out.println("Makas-Tas Kaybettiniz :(");
							rakip+=1;
						}else if(a==2){
							System.out.println("Makas-Kagit Kazandiniz :)");
							sen+=1;
						}else if(a==3){
							System.out.println("Makas-Makas Berabere");
						}
						System.out.println("Sen "+sen);
						System.out.println("Rakip "+rakip);
						break;
				}
		}
	}
	public static void MenuGoster(){
		System.out.print("1-Tas\n"+
				"2-Kagit\n"+
				"3-Makas\n");
	}
	public static int MenuSec(){
		Scanner veri = new Scanner(System.in);
		int sayi;
		System.out.println("Birini secin : ");
		sayi=veri.nextInt();
		return sayi;
	}
}
