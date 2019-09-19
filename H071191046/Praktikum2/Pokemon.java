import java.util.Scanner;
public class Pokemon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fire, ice, electric, water, ground;
        // String pokemon1, element1, pokemon2, element2;

        System.out.print("Pokemon1 : ");
        String pokemon1 = sc.nextLine();
        String element1 = sc.nextLine();
        System.out.print("Pokemon2 : ");
        String pokemon2 = sc.nextLine();
        String element2 = sc.nextLine();
        System.out.print("Winner : ");
        switch (element1) {
            case "fire" :
            switch (element2) {
                case "fire" :
                    System.out.println("draw");
                    break;
                case "ice" :
                    System.out.println(pokemon1);
                    break;
                case "electric" :
                    System.out.println(pokemon1);
                    break;
                case "water" :
                    System.out.println(pokemon2);
                    break;
                case "ground" :
                    System.out.println(pokemon2);
                    break;
            }break;
            case "ground":
            switch (element2) {
                case "ground" :
                    System.out.println("draw");
                    break;
                case "fire" :
                    System.out.println(pokemon1);
                    break;
                case "ice" :
                    System.out.println(pokemon2);
                    break;
                case "electric" :
                    System.out.println(pokemon1);
                    break;
                case "water" :
                    System.out.println(pokemon2);
                    break;            
            }break;
            case "ice" :
            switch (element2) {
                case "ground" :
                System.out.println(pokemon1);
                break;
            case "fire" :
                System.out.println(pokemon2);
                break;
            case "ice" :
                System.out.println("draw");
                break;
            case "electric" :
                System.out.println(pokemon2);
                break;
            case "water" :
                System.out.println(pokemon1);
                break;            
            }break;
            case "water" :
            switch (element2) {
                case "ground" :
                    System.out.println(pokemon1);
                    break;
                case "fire" :
                    System.out.println(pokemon1);
                    break;
                case "ice" :
                    System.out.println(pokemon2);
                    break;
                case "electric" :
                    System.out.println(pokemon2);
                    break;
                case "water" :
                    System.out.println("draw");
                    break;            
            }break;
            case "electric" :
            switch (element2) {
                case "ground" :
                    System.out.println(pokemon2);
                    break;
                case "fire" :
                    System.out.println(pokemon2);
                    break;
                case "ice" :
                    System.out.println(pokemon1);
                    break;
                case "electric" :
                    System.out.println("draw");
                    break;
                case "water" :
                    System.out.println(pokemon1);
                    break;            
            }default :
            break;
        }
    }
}