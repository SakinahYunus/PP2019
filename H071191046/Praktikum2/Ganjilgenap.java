import java.util.Scanner;
public class Ganjilgenap { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genap, ganjil, positif, negatif = 0;
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            genap = (a % 2 == 0 ? 1 : 0) + (b % 2 == 0 ? 1 : 0) + (c % 2 == 0 ? 1 : 0) + (d % 2 == 0 ? 1 : 0) + (e % 2 == 0 ? 1 : 0);
            ganjil = (a % 2 == 1 ? 1 : 0) + (b % 2 == 1 ? 1 : 0) + (c % 2 ==  1? 1 : 0) + (d % 2 == 1 ? 1 : 0) + (e % 2 == 1 ? 1 : 0);
            positif = (a > 0 ? 1 : 0) + (b > 0 ? 1 : 0) + (c > 0 ? 1 : 0) + (d > 0 ? 1 : 0) + (e > 0 ? 1 : 0);
            negatif = (a < 0 ? 1 : 0) + (b < 0 ? 1 : 0) + (c < 0 ? 1 : 0) + (d < 0 ? 1 : 0) + (e < 0 ? 1 : 0);

            System.out.println(genap + "Angka Genap");
            System.out.println(ganjil + "Angka Ganjil");
            System.out.println(positif + "Angka Positif");
            System.out.println(negatif + "Angka Negatif");

        } catch (Exception y) {
            System.out.println("Inputan tidak valid");
        } finally {
            System.out.println("");
        }

    }
}