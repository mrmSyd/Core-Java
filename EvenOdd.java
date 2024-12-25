import java.util.Scanner;
class EvenOdd {
    public static void main (String arg[]){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()){
            int number = sc.nextInt();
            if(number % 2 == 0){
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }

    }
}