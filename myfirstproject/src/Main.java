import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Hello " + name +" "+ "your age is: " + age);

            System.out.println("What's your weight ?: ");
            float weight = scanner.nextFloat();
            System.out.println("Hello " + name +" "+ "your weight is: " + weight + "Kg");

            System.out.println("Are you a student? (true/false): ");
            boolean isStudent = scanner.nextBoolean();
            if (isStudent){
                System.out.println("You are enrolled as a student");
            }
            else{
                System.out.println("You are NOT enrolled as a student");
            }

            scanner.close();
    }
}
