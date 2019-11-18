import java.util.Scanner;
class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bilangan = new int[n];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = sc.nextInt();
        }
        for (int element : bilangan) {
            if (element % 2 == 0) {
                System.out.print(e + " ");
            }
        }
    }
}