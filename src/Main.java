import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int divied(int a, int b) {
        int result = a / b;
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı!");
            return 0;
        } else {
            System.out.println("Sonuç: " + result);
            return result;
        }
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuç: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Dikdörtgenin Çevresi: " + (2 * (a + b)));
        System.out.println("Dikdörtgenin Alanı: " + (a * b));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi \n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap ";

        System.out.println(menu);

        while (true) {

            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("Birinci Sayı: ");
            int a = input.nextInt();

            System.out.print("İkinci Sayı: ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    divied(a, b);
                    break;

                case 5:
                    power(a, b);
                    break;

                case 6:
                    mod(a, b);
                    break;

                case 7:
                    calc(a, b);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }

    }
}
