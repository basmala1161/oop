import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        customer_data customerData = new customer_data();
        Scanner scanner = new Scanner(System.in);
  String[] governorates = {"Cairo", "Alexandria", "Qalyubia"};
        String[][] areas = {
    {"Abbasiya", "Nasr City", "Maadi"},
                {"Montazah", "Roushdy", "Smouha"},
                {"Benha", "Shubra", "Kaliub"}
        };
        while (true) {
            System.out.println("\nWelcome to the Customer System");
     System.out.println("Please select a Governorate:");
            for (int i = 0; i < governorates.length; i++) {
                System.out.println(( i+1) + ". " + governorates[i]);
            }
            System.out.print("Choose a Governorate (1-3): ");
            int governorateChoice = scanner.nextInt();
            scanner.nextLine();
            if (governorateChoice < 1 || governorateChoice > governorates.length) {
                System.out.println("Invalid Governorate");
                continue;
            }
            String selectedGovernorate = governorates[governorateChoice - 1];
            System.out.println("Choose an Area in " + selectedGovernorate + ":");
            for (int j = 0; j < areas[governorateChoice - 1].length; j++) {
                System.out.println((j + 1) + ". " + areas[governorateChoice - 1][j]);
            }
            System.out.print("Choose an Area (1-3): ");
            int areaChoice = scanner.nextInt();
            scanner.nextLine();
            if (areaChoice < 1 || areaChoice > areas[governorateChoice - 1].length) {
                System.out.println("Invalid Area. Please try again.");
                continue;
            }
            String selectedArea = areas[governorateChoice - 1][areaChoice - 1];
            System.out.println("You selected " + selectedGovernorate + " - " + selectedArea);
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("=== Register ===");
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    String email;
                    while (true) {
                        System.out.print("Enter Email: ");
                        email = scanner.nextLine();
                        if (!email.contains("@")) {
                            System.out.println("Invalid email! The email must contain '@'. Please try again.");
                        } else {
                            break;
                        }
                    }
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    int age;
                    while (true) {
System.out.print("Enter Age: ");
age = scanner.nextInt();
scanner.nextLine();
if (age < 12) {
System.out.println("Age must be 12 or older. Please enter a valid age.");
} else {
break;
                        }}

                    System.out.print("Enter Gender (Male/Female): ");
                    String gender = scanner.nextLine();

                    customerData.register(firstName, lastName, email, password, phoneNumber, address, age, gender);
                    System.out.println("Registration successful!");
                    break;
                case 2:
                    System.out.println("=== Login ===");
                    System.out.print("Enter Email: ");
                    String loginEmail = scanner.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.nextLine();

                    if (customerData.login(loginEmail, loginPassword)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed! Check your email or password.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;


            }
        }
    }
}
