import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Grade: ");
        System.out.println("A B C D F");
        String grade = scanner.nextLine();

        switch (grade){
            case "A":
                System.out.println("Excellent ");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Pass");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}