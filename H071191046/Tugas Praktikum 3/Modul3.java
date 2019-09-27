import java.util.Scanner;
class Modul3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < angka; i++) {
            System.out.print(n1 + " ");
            int n = n1 + n2;
            n1 = n2;
            n2 = n;
        }
    }
}