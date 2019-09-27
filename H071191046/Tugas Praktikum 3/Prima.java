import java.util.Scanner;
class Prima {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
		int angka = sc.nextInt();
		for (int i = 2; i * i <= angka; i++) {
			if (angka % i == 0) {
				System.out.println(angka + " bukan bilangan prima");
				return;
			}
		}

		System.out.println(angka + " bilangan prima");
	}
}