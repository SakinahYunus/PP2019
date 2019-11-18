//TUGAS MODUL NOMOR 3
//Input Usia dalam hari kemudian cetak dalam tahun, bulan, dan hari
//diikuti dengan keterangan tahun, bulan, dan hari
import java.util.Scanner;

class Method4 {
  public static void main(String[] args) {
    Scanner sa = new Scanner(System.in);
    System.out.println("Usia dalam hari: ");
    int usia = sa.nextInt();
    System.out.printf("%d tahun", tahun(usia));
    System.out.println(bulan(usia));
    System.out.println(hari(usia));
  }

  public static int tahun(int usiaTahun) {
    return usiaTahun / 365;
  }

  public static int bulan(int usiaBulan) {
    return (usiaBulan % 365) / 30;
  }

  public static int hari(int usiaHari) {
    return (usiaHari % 365) % 30;
  }
}
