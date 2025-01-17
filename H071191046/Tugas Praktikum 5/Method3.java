
//TUGAS MODUL NOMOR 2
//Melengkapi Program
//Contoh Input = 4 5
//Contoh Output = 13463-54631-97361-53825
import java.util.Scanner;
import java.util.Random;

class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        String str = "";
        Random nomor = new Random();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int nilai = nomor.nextInt(10);
                str += String.valueOf(nilai);
            }
            if (i == n) {
                str += " ";
            } else {
                str += "-";
            }
        }
        return str;
    }
}