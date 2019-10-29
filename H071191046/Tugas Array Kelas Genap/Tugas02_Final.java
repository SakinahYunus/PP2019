import java.util.Scanner;

class Tugas02_Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ukuran Matriks A");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Ukuran Matriks B");
        int r = sc.nextInt();
        int s = sc.nextInt();
        int matriksA[][] = new int[p][q];
        int matriksB[][] = new int[r][s];
        int sum;

        for (int a = 0; a < p; a++) {
            for (int b = 0; b < q; b++) {
                matriksA[a][b] = sc.nextInt();
            }
        }
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < s; b++) {
                matriksB[a][b] = sc.nextInt();
            }
        }
        // MatriksA * MatriksB
        System.out.println("AB = ");
        for (int a = 0; a < p; a++) {
            for (int b = 0; b < s; b++) {
                sum = 0;
                for (int c = 0; c < q; c++) {
                    sum += matriksA[a][c] * matriksB[c][b];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        // MatriksB * MatriksA
        System.out.println("BA = ");
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < q; b++) {
                sum = 0;
                for (int c = 0; c < s; c++) {
                    sum += matriksB[a][c] * matriksA[c][b];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }
}