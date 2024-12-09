public class DeliveryStaff {


        public String name;
        public String location;

        public DeliveryStaff(String name, String location) {
            this.name = name;
            this.location = location;
        }

        public void deliverOrder(Order order) {
            System.out.println("Delivering order: \n" + order);
        }
    }


