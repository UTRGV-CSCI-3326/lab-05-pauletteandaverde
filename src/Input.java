import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        // Setting up object for Scanner
        Scanner scanner = new Scanner(System.in);
        // Varibles
        String name;
        int age;
        double weight;
        boolean smoker;

        // Assigning inputs
        System.out.print("Full Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Weight: ");
        weight = scanner.nextDouble();
        System.out.print("Are you a smoker? (Write 'true' or 'false'): ");
        smoker = scanner.nextBoolean(); 

        // Outputting info
        System.out.println("Patient's Full Name: " + name);
        System.out.println("Patient's Age: " + age);
        System.out.println("Patient's Weight: " + weight);
        System.out.println("Patient is a smoker: " + smoker);

        scanner.close();
    }
}
