import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first Number: ");
        int number = scanner.nextInt();
        System.out.println("Enter your second Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter your operator: ");
        String operator= scanner.next();

        switch (operator){
            case "+":
                System.out.println("Your answer is = "+number+number2);
                break;
            case "-":
                System.out.println("Your answer is = "+number+number2);
                break;
            case "*":
                System.out.println("Your answer is = "+number*number2);
                break;
            case "/":
                System.out.println("Your answer is = "+number/number2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}