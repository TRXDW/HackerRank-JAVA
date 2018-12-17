import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        scan.close();

        if(number%2 != 0){
            System.out.println("Weird");
        } else if(number >= 2 && number <=5){
            System.out.println("Not Weird");
        } else if(number >= 6 && number <= 20){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }
    }
}
