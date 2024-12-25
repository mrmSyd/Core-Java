import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        System.out.print("*********Select an option*********\n\t 1.Add\n\t 2.Subtract\n\t 3.Divide\n\t 4.Multiply \n");
        Scanner sc = new Scanner(System.in);
         
        if(sc.hasNextInt()){
            int selectedOption = sc.nextInt();
            performOperation(selectedOption, sc);
        } else {
            System.out.println("Invalid option selected.");
        }
    }   
 
    private static void performOperation(int option, Scanner sc){
        String operation = switch(option){
            case 1 -> "Add";
            case 2 -> "Subtract";
            case 3 -> "Divide";
            case 4 -> "Multiply";
            default -> null;
        };

        if(operation == null) {
            System.out.println("Invalid option selected.");
            return;
        }

        int x = getInput("Enter the first number to " + operation + ": ", sc);
        int y = getInput("Enter the second number to " + operation + ": ", sc);

        switch(option){
            case 1 -> System.out.print("Answer: " + (x + y));
            case 2 -> System.out.print("Answer: " + (x - y));
            case 3 -> {
                if(y == 0){
                    System.out.println("Cannot divide by 0.");
                } else {
                    System.out.print("Answer: " + (x / y));
                }
            }
            case 4 -> System.out.print("Answer: " + (x * y));
        }
    }

    private static int getInput(String msg, Scanner sc){
        System.out.println(msg);
        while(!sc.hasNextInt()){
            System.out.println("Invalid input. Enter valid number.");
            System.out.println(msg);
            sc.next();
        }
        return  sc.nextInt();
    }
}
