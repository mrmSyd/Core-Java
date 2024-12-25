import java.util.Scanner;
public class Area {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the area of: \n 1. Square\n 2. Circle: \n=======");
        if(sc.hasNextInt()){
            int option = sc.nextInt();
            if(option==1){               
                Square sq = new Square();
                System.out.print("\nEnter a number to find the area of a Square:");
                Float l = sc.nextFloat();
                System.out.println("Are of a Square is " + sq.area(l));

            } else if (option==2){                
                Circle cr = new Circle();
                System.out.print("\nEnter a number to find the area of a Circle: ");
                Float r = sc.nextFloat();
                System.out.println("Are of a Circle is " + cr.area(r));

            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
class Square {
    
    public Float area(Float l){
        return l*l;
    }
}

class Circle {
    
    public Double area(Float r){
        return 3.14 * r * r;
    }
}