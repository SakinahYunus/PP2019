import java.util.Scanner;
class Modul04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Harga barang = " );
        int hargaBarang = sc.nextInt();
        System.out.print("Bayar = ");
        int bayar = sc.nextInt();
        int kembalian = bayar-hargaBarang;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

        while (kembalian >= 100000) {
            kembalian = kembalian-100000;
            a++;
        } while (kembalian >= 50000) {
            kembalian = kembalian-50000;
            b++;
        } while (kembalian >= 20000) {
            kembalian = kembalian-20000;
            c++;
        } while (kembalian >= 10000) {
            kembalian = kembalian-10000;
            d++;
        } while (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            e++;
        } while (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f++;
        }
        System.out.println(a + " uang Rp. 100.000");
        System.out.println(b + " uang Rp. 50.000");
        System.out.println(c + " uang Rp. 20.000");
        System.out.println(d + " uang Rp. 10.000");
        System.out.println(e + " uang Rp. 5.000");
        System.out.println(f + " uang Rp. 2.000");
        System.out.println(g + " uang Rp. 1.000");
    }
}