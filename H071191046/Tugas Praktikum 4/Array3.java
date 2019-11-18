//TUGAS MODUL NOMOR 1
//Print masing-masing setiap dua elemen yang saling relatif prima
import java.util.Scanner;
class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = (i+1); j < n; j++) {
                int a = nilai[i];
                int b = nilai[j];
                int sa = 0;
                for (int k = a < b ? a : b; k > 0; k--) {
                    if (a % k == 0 && b % k == 0) {
                        fpb = k;
                        break;
                    }
                }
                if (fpb == 1) {
                    System.out.println(a + " " + b);
                }
            }
        }
    }
}