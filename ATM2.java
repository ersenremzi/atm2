package JavaProjects;

import java.util.Scanner;

public class ATM2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bakiye = 250;
        int secim = 0;
        System.out.println("1 Bakiye Sogrulama");
        System.out.println("2 Para Çekme");
        System.out.println("3 Para Yatırma");
        while (true){
            System.out.println("Lütfen İşlem Seçiniz.");
            int islem = s.nextInt();

            if (islem == 1) {
                System.out.println("Bakiyeniz : " + bakiye);
            }else if (islem == 2){
                System.out.println("Miktar giriniz");
                int miktar = s.nextInt();
                bakiye = bakiye - miktar ;
                System.out.println("Yeni bakiye : " + bakiye + "TL'dir.");
            }else if (islem == 3){
                System.out.println("Miktar giriniz");
                int miktar1 = s.nextInt();
                bakiye = miktar1 + bakiye;
                System.out.println("Yeni bakiye : " + bakiye + "TL'dir.");

            }else
                System.out.println("Hatalı bir değer girdiniz.");

        }
    }
}
