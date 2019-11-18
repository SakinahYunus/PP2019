//TUGAS MODUL NOMOR 1
//Menghitung FPB dari dua inputan
import java.util.Scanner;
class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1 = sc.nextInt();
        int bil2 = sc.nextInt();

        FPB(bil1, bil2);
    }
    public static void FPB(int a, int b) {
        System.out.println(hasil(a,b));
    }
    public static int hasil(int a, int b) {
        int fpb = (b == 0) ? a : hasil (b, a % b);
        return fpb;
    }
}