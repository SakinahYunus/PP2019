import java.util.Scanner;
class Modul2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= y; i++) {
            System.out.print(i+"\t");
            count++;
            if (count == x) {
                System.out.println();
                count = 0;
            }
        }
    }
}