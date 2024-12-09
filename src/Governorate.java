
    import java.util.ArrayList;

    public class Governorate {
        private String name;
        private ArrayList<Area> areas;

        public Governorate(String name) {
            this.name = name;
            this.areas = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addArea(Area area) {
            areas.add(area);
        }

        public ArrayList<Area> getAreas() {
            return areas;
        }


}
