//TUGAS MODUL NOMOR 2
//Perkalian Matriks
import java.util.Scanner;
class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ukuran matriks
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int matriksA[][] = new int[i][j];
        int matriksB[][] = new int[j][k];

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = sc.nextInt();
            }
        }
        for (int b = 0; b < j; b++) {
            for (int c = 0; c < k; c++) {
                matriksB[b][c] = sc.nextInt();
            }
        }
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                int sum = 0;
                for (int c = 0; c < j; c++) {
                    sum = sum + matriksA[a][c] * matriksB[c][b];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}