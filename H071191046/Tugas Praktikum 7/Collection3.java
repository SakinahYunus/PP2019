import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

class Collection3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input angka 1 : ");
    int mulai = sc.nextInt();
    System.out.print("Input angka 2 : ");
    int akhir = sc.nextInt();
    if (mulai < akhir) {
      for (int i = mulai; i <= akhir; i++) {
        if (canSelfDivide(i) && i != 0) {
          System.out.print(i + " ");
        }
      }
    } else {
      for (int i = mulai; i >= akhir; i--) {
        if (canSelfDivide(i) && i != 0) {
          System.out.print(i + " ");
        }
      }
    }
  }

  static boolean canSelfDivide(int number) {
    Iterator<Integer> iterator = seperateDigits(number).iterator();
    try {
      while (iterator.hasNext()) {
        if (number % iterator.next() == 0) {
          continue;
        } else {
          return false;
        }
      }
    } catch (ArithmeticException e) {
      return false;
    }
    return true;
  }

  static List<Integer> seperateDigits(int number) {
    List<Integer> seperatedDigits = new ArrayList<Integer>();
    while (number > 0 || number < 0) {
      seperatedDigits.add(number % 10);
      number = number / 10;
    }
    return (seperatedDigits);
  }
}