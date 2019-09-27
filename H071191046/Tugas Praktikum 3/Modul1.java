import java.util.Scanner;
class Modul1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i + "  Genap positif");
            }
            else if (i % 2 == 0 && i < 0) {
                System.out.println(i + " Genap negatif");
            }
            else if (i % 2 == 1 && i > 0) {
                System.out.println(i + " Ganjil positif");
            }
            else if (i % 2 == 1 && i < 0) {
                System.out.println(i + " Ganjil negatif");
            }
            else {
                System.out.println(i + " nol");
            }
        }
        for (int i = y; i <= x; i++) {
            if (i % 2 == 0 && i > 0) {
                System.out.println(i + " Genap positif");
            }
            else if (i % 2 == 0 && i < 0) {
                System.out.println(i + " Genap negatif");
            }
            else if (i % 2 == -1 && i > 0) {
                System.out.println(i + " Ganjil positif");
            }
            else if (i % 2 == -1 && i < 0) {
                System.out.println(i + " Ganjil negatif");
            }
            else {
                System.out.println(i + " nol");
            }
        }
    }
}