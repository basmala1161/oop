import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public String First_name;
    public String Last_name;
    private String email;
    private String password;
    private ArrayList<Restaurant> restaurants;

    public Admin() {
        this.restaurants = new ArrayList<>();
    }

    public void AddResturant() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Restaurant name:");
        String name = input.nextLine();
        System.out.println("Enter Restaurant location:");
        String location = input.nextLine();
        System.out.println("Enter Restaurant category:");
        String category = input.nextLine();

        Restaurant res = new Restaurant( location, category);
        restaurants.add(res);
        System.out.println("Restaurant added successfully.");
    }

    public void Remove_Resturant() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Restaurant name to remove:");
        String name = input.nextLine();

        restaurants.removeIf(res -> res.name.equalsIgnoreCase(name));
        System.out.println("Restaurant removed successfully.");
    }

    public void Update_restaurants() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Restaurant name to update:");
        String name = input.nextLine();

        for (Restaurant res : restaurants) {
            if (res.name.equalsIgnoreCase(name)) {
                System.out.println("Enter new name:");
                res.name = input.nextLine();
                System.out.println("Enter new location:");
                res.location = input.nextLine();
                System.out.println("Enter new category:");
                res.category = input.nextLine();
                System.out.println("Restaurant updated successfully.");
                return;
            }
        }
        System.out.println("Restaurant not found.");
    }
}



