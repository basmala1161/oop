import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String location;
    private ArrayList<Food> menu;

    public Restaurant( String location) {
        this.location = location;
        this.menu = new ArrayList<>();
    }

    public void addFood(Food food) {
        menu.add(food);
    }

    public void displayMenu() {
        System.out.println("Menu for " + name + ":");
        for (Food food : menu) {
            System.out.println(food);
        }
    }

    public ArrayList<Food> getMenu() {
        return menu;
    }

    public String getName() {
    }
}
