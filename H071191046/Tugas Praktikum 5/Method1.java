import java.util.Scanner;
class Method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");

        System.out.println("Input angkan sesuai menu yang diinginkan");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.println("Pilih Bangun Datar");
            System.out.println("1.Persegi \n2.Persegi Panjang \n3.Segitiga \n4.Lingkaran \n5.Jajar Genjang \n6. Trapesium \n7. Belah Ketupat \n8.Layang-layang ");
            int bd = sc.nextInt();
            if (bd == 1) {
                System.out.print("Input sisi = ");
                int sisi = sc.nextInt();
                luasPersegi(sisi);
            } 
            else if (bd == 2) {
                System.out.print("Panjang = ");
                int panjang = sc.nextInt();
                System.out.print("Lebar = ");
                int lebar = sc.nextInt();
                luasPersegiPanjang(panjang,lebar);
            } 
            else if (bd == 3) {
                System.out.print("Alas = ");
                int alas = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                luasSegitiga(alas,tinggi);
            }
            else if (bd == 4) {
                System.out.print("Jari-jari = ");
                int r = sc.nextInt();
                luasLingkaran(r);
            }
            else if (bd == 5) {
                System.out.print("Alas = ");
                int alas = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                luasJajargenjang(alas,tinggi);
            }
            else if (bd == 6) {
                System.out.print("sisi atas = ");
                int sisiAtas = sc.nextInt();
                System.out.print("sisi bawah = ");
                int sisiBawah = sc.nextInt();
                System.out.print("tinggi = ");
                int tinggi = sc.nextInt();
                luasTrapesium(sisiAtas,sisiBawah,tinggi);
            }
            else if (bd == 7) {
                System.out.print("diagonal1 = ");
                int diagonal1 = sc.nextInt();
                System.out.print("diagonal2 = ");
                int diagonal2 = sc.nextInt();
                luasBelahKetupat(diagonal1,diagonal2);
            }
            else if (bd == 8) {
                System.out.print("diagonal1 = ");
                int diagonal1 = sc.nextInt();
                System.out.print("diagonal2 = ");
                int diagonal2 = sc.nextInt();
                luasLayanglayang(diagonal1,diagonal2);
            }
        } else if (pilih == 2) {
            System.out.println("Pilih Bangun Ruang");
            System.out.println("1.Kubus \n2.Balok \n3.Limas Segiempat \n4.Prisma Segitiga \n5.Limas Segitiga \n6.Tabung \n7.Kerucut \n8.Bola ");
            int br = sc.nextInt();
            if (br == 1) {
                System.out.print("Input sisi = ");
                int sisi = sc.nextInt();
                volumeKubus(sisi);
            }
            else if (br == 2) {
                System.out.print("Panjang = ");
                int panjang = sc.nextInt();
                System.out.print("Lebar = ");
                int lebar = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                volumeBalok(panjang, lebar, tinggi);
            }
            else if (br == 3) {
                System.out.print("Panjang = ");
                int panjang = sc.nextInt();
                System.out.print("Lebar = ");
                int lebar = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                volumeLimasSegiempat(panjang, lebar, tinggi);
            }
            else if (br == 4) {
                System.out.print("Alas = ");
                int alas = sc.nextInt();
                System.out.print("Tinggi segitiga = ");
                int tinggiS = sc.nextInt();
                System.out.print("Tinggi Prisma= ");
                int tinggi = sc.nextInt();
                volumePrismaSegitiga(alas, tinggiS, tinggi);
            }
            else if (br == 5) {
                System.out.print("Alas = ");
                int alas = sc.nextInt();
                System.out.print("Tinggi segitiga = ");
                int tinggiS = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                volumeLimasSegitiga(alas, tinggiS, tinggi);
            }
            else if (br == 6) {
                System.out.print("Jari-jari = ");
                int r = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                volumeTabung(r, tinggi);
            }
            else if (br == 7) {
                System.out.print("Jari-jari = ");
                int r = sc.nextInt();
                System.out.print("Tinggi = ");
                int tinggi = sc.nextInt();
                volumeKerucut(r, tinggi);
            }
            else if (br == 8) {
                System.out.print("Jari-jari = ");
                int r = sc.nextInt();
                volumeBola(r);
            }
        }
    }
    static void luasPersegi(int sisi) {
        double luasPersegi = sisi*sisi;
        System.out.println("Luas Persegi = " + luasPersegi);
    }
    static void luasPersegiPanjang(int panjang, int lebar) {
        double luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
    }
    static void luasSegitiga(int alas, int tinggi) {
        double luasSegitiga = (alas*tinggi) / 2;
        System.out.println("Luas Segitiga = " + luasSegitiga);
    }
    static void luasLingkaran(int r) {
        double luasLingkaran = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = " + "%.2f" , luasLingkaran);
    }
    static void luasJajargenjang(int alas, int tinggi) {
        double luasJajargenjang = alas * tinggi;
        System.out.println("Luas Jajargenjang = " + luasJajargenjang);
    }
    static void luasTrapesium(int sisiAtas, int sisiBawah, int tinggi) {
        double luasTrapesium = ((sisiAtas+sisiBawah)*tinggi) / 2;
        System.out.println("Luas Trapesium = " + luasTrapesium);
    }
    static void luasBelahKetupat(int diagonal1, int diagonal2) {
        double luasBelahKetupat = (diagonal1*diagonal2) / 2;
        System.out.println("Luas Belah Ketupat = " + luasBelahKetupat);
    }
    static void luasLayanglayang(int diagonal1, int diagonal2) {
        double luasLayanglayang = (diagonal1 * diagonal2) / 2;
        System.out.println("Luas Layang-layang = " + luasLayanglayang);
    }
    static void volumeKubus(int sisi) {
        double volumeKubus = sisi*sisi*sisi;
        System.out.println("Volume Kubus = " + volumeKubus);
    }
    static void volumeBalok(int panjang, int lebar, int tinggi) {
        double volumeBalok = panjang*lebar*tinggi;
        System.out.println("Volume Balok = " + volumeBalok);
    }
    static void volumeLimasSegiempat(int panjang, int lebar, int tinggi) {
        double volumeLimasSegiempat = (panjang*lebar*tinggi)/3;
        System.out.println("Volume Limas Segiempat = " + volumeLimasSegiempat);
    }
    static void volumePrismaSegitiga(int alas, int tinggiS, int tinggi) {
        double volumePrismaSegitiga = ((alas*tinggiS)/2)*tinggi;
        System.out.println("Volume Prisma Segitiga = " + volumePrismaSegitiga);
    }
    static void volumeLimasSegitiga(int alas, int tinggiS, int tinggi) {
        double volumeLimasSegitiga = (((alas*tinggiS)/2)/3)*tinggi;
        System.out.println("Volume Limas segitiga = " + volumeLimasSegitiga);
    }
    static void volumeTabung(int r, int tinggi) {
        double volumeTabung = Math.PI*r*r*tinggi;
        System.out.println("Volume Tabung = " + volumeTabung);
    }
    static void volumeKerucut(int r, int tinggi) {
        double volumeKerucut = (Math.PI*r*r*tinggi)/3;
        System.out.println("Volume Kerucut = " + volumeKerucut);
    }
    static void volumeBola(int r) {
        double volumeBola = (4*(Math.PI*r*r*r))/3;
        System.out.printf("Volume Bola = " + "%.2f" + volumeBola);
    }
}