import java.util.Scanner;
class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka = ");
        int a = sc.nextInt();
        int hasil = 1;
        System.out.printf("%d! = " , a);
        while (a > 1) {
            System.out.print(a + " * ");
            hasil *= a;
            a--;
        }
        System.out.printf("%s\n" , (hasil != 1) ? "1 = " + hasil : hasil);

    }
}