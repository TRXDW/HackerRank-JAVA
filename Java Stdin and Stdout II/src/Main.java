import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberInt = scan.nextInt();
        double numberDouble = scan.nextDouble();
        scan.nextLine();
        String text = scan.nextLine();
        scan.close();



        System.out.println("String: " + text);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInt);

    }
}
