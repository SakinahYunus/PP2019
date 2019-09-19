import java.util.Scanner;
public class Kuadran{
    public static void main(String[] args) {
    Scanner soal = new Scanner(System.in);
    int x = soal.nextInt();
    int y = soal.nextInt();
    
    if(x < 0 && y >= 0) {
        System.out.println("Koordinat berada pada Quadran 1");
    }else if(x < 0 && y > 0) {
        System.out.println("Koordinat berada pada garis Q1 dan Q2");
    }else if (x < 0 && y > 0) {
        System.out.println("Koordinat berada pada Quadran 2");
    }else if (x > 0 && y > 0) {
        System.out.println("Koordinat berada pada Quadran 3");
    }else if (x > 0 && y > 0) {
        System.out.println("Koordinat berada pada garis Q3 dan Q4 ");
    }else if (x > 0 && y > 0) {
        System.out.println("Koordinat berada pada Quadran 4");
    }else if (x > 0 && y < 0) {
        System.out.println("Koordinat berada pada Quadran 5");
    }else if (x > 0 && y < 0) {
        System.out.println("Koordinat berada pada garis Q5 dan Q6");
    }else if (x > 0 && y < 0) {
        System.out.println("Koordinat berada pada Quadran 6");
    }else if (x < 0 && y < 0) {
        System.out.println("Koordinat berada pada Quadran 7");
    }else if (x < 0 && y < 0) {
        System.out.println("Koordinat berada pada garis Q7 dan Q8");
    }else if(x < 0 && y < 0) {
        System.out.println("Koordinat berada pada Quadran 8");
    }else {
        System.out.println("Berada pada titik pusat");
    }
    }
}