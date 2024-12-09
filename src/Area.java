
    import java.util.ArrayList;

    public class Area {
        private String name;
        private ArrayList<Restaurant> restaurants;

        public Area(String name) {
            this.name = name;
            this.restaurants = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addRestaurant(Restaurant restaurant) {
            restaurants.add(restaurant);
        }

        public ArrayList<Restaurant> getRestaurants() {
            return restaurants;
        }


}
