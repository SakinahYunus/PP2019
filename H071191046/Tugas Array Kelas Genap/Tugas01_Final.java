import java.util.Scanner;

class Tugas01_Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] data = new double[10];
        double sum = 0;
        double error = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
            sum += data[i];
        }
        double ratarata = sum / data.length;
        System.out.println("---------------------------------");
        System.out.println("|NO |\tDATA\t|\tERROR\t|");
        System.out.println("---------------------------------");
        for (int i = 0; i < data.length; i++) {
            error = Math.sqrt(Math.pow(ratarata - data[i], 2));
            System.out.printf("| %d |", i + 1);
            System.out.printf("   %.2f\t", data[i]);
            System.out.print("| ");
            System.out.printf("   %.2f\t|\n", error);
        }

    }
}