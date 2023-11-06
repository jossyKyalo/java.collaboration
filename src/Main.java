
import java.util.Scanner;
 class Addition {
    public static int add(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
    }
class division{
    public static float div(float num1, float num2){
        if(num2==0){
            System.out.println("Number cannot be divivded by zero");
        }
        else{
            return num1/num2;

        }
        

    }
 }
 
//Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");//The Main Java Hello World Program
        Scanner scanner=new Scanner(System.in);
        //For the classes input queries
        System.out.println("Select your arithmetic operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication"); 
        System.out.println("4.Division");
        System.out.println("5.Rectangle perimeter");
        System.out.println("6.Triangle area");
        System.out.println("7.Circle area");
        System.out.println("8.Circle perimeter");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the first number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int secondNumber = scanner.nextInt();
                //add method for addition and the output statement for result
                int sum = Addition.add(firstNumber,secondNumber);
                System.out.println("Result of addition: " + sum);
                break;
            case 2:
                System.out.print("Enter the first number: ");
                int num3 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num4 = scanner.nextInt();
                //add method for substraction and the output statement for result
                
                break;
            case 3:
                System.out.print("Enter the first number: ");
                int num5 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num6 = scanner.nextInt();
                //add method for multiplication and the output statement for result
                break;
            case 4:
                System.out.print("Enter the first number: ");
                double num7 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num8 = scanner.nextDouble();
                //add method for division and the output statement for result
                float div= division.div(num1,num2);
                System.out.println("The result is:"+div);
                break;
            case 5:
                System.out.print("Enter the length: ");
                int length = scanner.nextInt();
                System.out.print("Enter the width: ");
                int width = scanner.nextInt();
                //add method for rectangle's perimeter and the output statement for result
                break;
            case 6:
                System.out.print("Enter the base: ");
                int base = scanner.nextInt();
                System.out.print("Enter the height: ");
                int height = scanner.nextInt();
                //add method for computing the area of a right-angled triangle and the output statement for result
                break;
            case 7:
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
               //add method for calculating area of the circle and the output statement for result
                break;
            case 8:
                System.out.print("Enter the radius: ");
                double circleRadius = scanner.nextDouble();
                //add method for finding perimeter of the circle and the output statement for result
                break;
            default:
                System.out.println("Invalid choice! You can try again now.");
        }

      
    }
}

    

