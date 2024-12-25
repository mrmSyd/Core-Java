import java.util.Scanner;

class MaxOfTwoNumber {

    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();            
            System.out.print("Enter another number: ");
            if(sc.hasNextInt()){
                b = sc.nextInt();
                if (a > b) {
                    System.out.println(a + " is greater than " + b);
                } else {
                    System.out.println(b + " is greater than " + a);
                }
            } else {
                System.out.println("Invalid input.");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}