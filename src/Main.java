import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // تعريف الفئات الغذائية
        FoodCategory grills = new FoodCategory("Grills");
        FoodCategory seafood = new FoodCategory("Seafood");
        FoodCategory pizza = new FoodCategory("Pizza");
        FoodCategory fastFood = new FoodCategory("Fast Food");
        FoodCategory lebanese = new FoodCategory("Lebanese Sandwiches");

        // إنشاء الطعام
        Food food1 = new Food("Shawarma", grills, 50.0);    // ينتمي إلى فئة Grills
        Food food2 = new Food("Seafood Platter", seafood, 100.0);  // ينتمي إلى فئة Seafood
        Food food3 = new Food("Margherita Pizza", pizza, 80.0);   // ينتمي إلى فئة Pizza
        Food food4 = new Food("Chicken Burger", fastFood, 30.0);   // ينتمي إلى فئة Fast Food
        Food food5 = new Food("Falafel Sandwich", lebanese, 20.0);  // ينتمي إلى فئة Lebanese Sandwiches

        // إنشاء المطاعم
        Restaurant res1 = new Restaurant("Grill Master", "Cairo");
        res1.addFood(food1);
        res1.addFood(food2);

        Restaurant res2 = new Restaurant("Seafood Delights", "Alexandria");
        res2.addFood(food2);
        res2.addFood(food3);

        // إنشاء المناطق
        Area area1 = new Area("Abbasiya");
        area1.addRestaurant(res1);
        Area area2 = new Area("Nasr City");
        area2.addRestaurant(res2);

        // إنشاء المحافظات
        Governorate governorate1 = new Governorate("Cairo");
        governorate1.addArea(area1);
        Governorate governorate2 = new Governorate("Alexandria");
        governorate2.addArea(area2);

        // عرض الخيارات للمستخدم
        System.out.println("Welcome to the Food Ordering System");

        System.out.println("Choose a Governorate:");
        System.out.println("1. " + governorate1.getName());
        System.out.println("2. " + governorate2.getName());
        System.out.print("Choose an option: ");
        int governorateChoice = scanner.nextInt();
        scanner.nextLine(); // لتفريغ السطر

        Governorate selectedGovernorate = governorateChoice == 1 ? governorate1 : governorate2;

        System.out.println("Choose an Area in " + selectedGovernorate.getName() + ":");
        for (int i = 0; i < selectedGovernorate.getAreas().size(); i++) {
            System.out.println((i + 1) + ". " + selectedGovernorate.getAreas().get(i).getName());
        }

        System.out.print("Choose an Area: ");
        int areaChoice = scanner.nextInt();
        scanner.nextLine(); // لتفريغ السطر

        Area selectedArea = selectedGovernorate.getAreas().get(areaChoice - 1);

        System.out.println("You selected " + selectedGovernorate.getName() + " - " + selectedArea.getName());

        // عرض المطاعم في المنطقة المحددة
        System.out.println("Available Restaurants:");
        for (int i = 0; i < selectedArea.getRestaurants().size(); i++) {
            System.out.println((i + 1) + ". " + selectedArea.getRestaurants().get(i).getName());
        }

        System.out.print("Choose a Restaurant: ");
        int restaurantChoice = scanner.nextInt();
        scanner.nextLine(); // لتفريغ السطر

        Restaurant selectedRestaurant = selectedArea.getRestaurants().get(restaurantChoice - 1);

        System.out.println("You selected: " + selectedRestaurant.getName());
        selectedRestaurant.displayMenu();  // عرض قائمة الطعام في المطعم

        // عرض فئات الطعام المتاحة
        System.out.println("Food categories available:");
        System.out.println("1. Grills");
        System.out.println("2. Seafood");
        System.out.println("3. Pizza");
        System.out.println("4. Fast Food");
        System.out.println("5. Lebanese Sandwiches");
        System.out.print("Choose a food category: ");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine(); // لتفريغ السطر

        // اختيار الفئة الغذائية
        FoodCategory selectedCategory = null;
        switch (categoryChoice) {
            case 1: selectedCategory = grills; break;
            case 2: selectedCategory = seafood; break;
            case 3: selectedCategory = pizza; break;
            case 4: selectedCategory = fastFood; break;
            case 5: selectedCategory = lebanese; break;
            default: System.out.println("Invalid choice!"); return;
        }

        System.out.println("Food items in " + selectedCategory.getName() + ":");
        for (Food food : selectedRestaurant.getMenu()) {
            if (food.getCategory().getName().equals(selectedCategory.getName())) {
                System.out.println(food);  // عرض الأطعمة التي تتطابق مع الفئة المحددة
            }
        }
    }
}
