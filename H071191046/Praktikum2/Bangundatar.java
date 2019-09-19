import java.util.Scanner;
class Bangundatar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Mencari Luas Bangun Datar");
        System.out.println("2.Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.println("1.Persegi \n2.Persegi Panjang \n3.Segitiga \n4.Lingkaran \n5.Jajar Genjang \n6. Trapesium \n7. Belah Ketupat \n8.Layang-layang ");
            System.out.println("Input angka sesuai bangun datar yang diinginkan");
            int datar = sc.nextInt();
            if (datar == 1) {
                System.out.print("input sisi = ");
                int sisi = sc.nextInt();
                double luas = sisi*sisi;
                System.out.print("Luas Persegi = " + luas);
            }
            else if (datar == 2){
                System.out.print("input panjang = ");
                int panjang = sc.nextInt();
                System.out.print("input lebar = ");
                int lebar = sc.nextInt();
                double luas = panjang*lebar;
                System.out.print("Luas Persegi Panjang = " + luas);
            }
            else if (datar == 3){
                System.out.print("input alas = ");
                int alas = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double luas = (alas*tinggi) / 2;
                System.out.print("Luas Segitiga = " + luas);
            }
            else if (datar == 4) {
                System.out.print("input r = ");
                int r = sc.nextInt();
                double luas = Math.PI*r*r;
                System.out.printf("Luas Lingkaran = " + "%.2f" , luas);
            }
            else if (datar ==5) {
                System.out.print("input alas = ");
                int alas = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double luas = alas * tinggi;
                System.out.print("Luas Jajar Genjang = " + luas);
            }
            else if (datar == 6) {
                System.out.print("input sisi atas = ");
                int sisiAtas = sc.nextInt();
                System.out.print("input sisi bawah = ");
                int sisiBawah = sc.nextInt();
                System.out.print("tinggi = ");
                int tinggi = sc.nextInt();
                double luas = ((sisiAtas*sisiBawah)*tinggi)/2;
                System.out.print("Luas Trapesium = " + luas);
            }
            else if (datar == 7) {
                System.out.print("diagonal1 = ");
                int diagonal1 = sc.nextInt();
                System.out.print("diagonal2 = ");
                int diagonal2 = sc.nextInt();
                double luas = (diagonal1*diagonal2)/2;
                System.out.print("Luas Belah Ketupat = " + luas);
            }
            else if (datar == 8) {
                System.out.print("diagonal1 = ");
                int diagonal1 = sc.nextInt();
                System.out.print("diagonal2 = ");
                int diagonal2 = sc.nextInt();
                double luas = (diagonal1*diagonal2)/2;
                System.out.print("Luas Layang-layang = " + luas);
            }

        }if (pilih == 2){
            System.out.println("1.Kubus \n2.Balok \n3.Limas Segiempat \n4.Prisma Segitiga \n5.Limas Segitiga \n6.Tabung \n7.Kerucut \n8.Bola ");
            System.out.println("Input angka sesuai bangun ruang yang diinginkan");
            int ruang = sc.nextInt();
            if(ruang == 1) {
                System.out.print("input sisi = ");
                int sisi = sc.nextInt();
                double volume = sisi*sisi*sisi;
                System.out.print("Volume Kubus = " + volume);
            }
            else if (ruang == 2) {
                System.out.print("input panjang = ");
                int panjang = sc.nextInt();
                System.out.print("input lebar = ");
                int lebar = sc.nextInt();
                System.out.print("input tinggi");
                int tinggi = sc.nextInt();
                double volume = panjang*lebar*tinggi;
                System.out.print("Volume Balok = " + volume);
            }
            else if (ruang == 3) {
                System.out.print("input panjang = ");
                int panjang = sc.nextInt();
                System.out.print("input lebar = ");
                int lebar = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double volume = (panjang*lebar*tinggi)/3;
                System.out.print("Volume Limas Segiempat = " + volume);
            }
            else if (ruang == 4) {
                System.out.print("input luas alas = ");
                int luasAlas = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double volume = luasAlas*tinggi;
                System.out.print("Volume Prisma Segitiga = " + volume);
            }
            else if (ruang == 5) {
                System.out.print("input luas alas = ");
                int luasAlas = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double volume = (luasAlas*tinggi)/3;
                System.out.print("Volume Limas Segitiga = " + volume);
            }
            else if (ruang == 6) {
                System.out.print("input r = ");
                int r = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double volume = Math.PI*r*r*tinggi;
                System.out.print("Volume Tabung = " + volume);
            }
            else if (ruang == 7) {
                System.out.print("input r = ");
                int r = sc.nextInt();
                System.out.print("input tinggi = ");
                int tinggi = sc.nextInt();
                double volume = (Math.PI*r*r*tinggi)/3;
                System.out.print("Volume Kerucut = " + volume);
            }
            else if (ruang == 8) {
                System.out.print("input r = ");
                int r = sc.nextInt();
                double volume = (4*(Math.PI*r*r*r))/3;
                System.out.printf("Volume Bola = " + "%.2f" , volume);
            }
        }
    }
}