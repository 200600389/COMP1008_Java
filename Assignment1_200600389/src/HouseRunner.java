public class HouseRunner {
    public static void main(String[] args) {
        // Create three House objects using different initialization methods.
        House house1 = new House(); // Default constructor
        House house2 = new House(3, "123 Main Street", 150000.0); // All fields constructor
        House house3 = new House(4, 250000.0); // Constructor with rooms and price details

        // Print details of the three House objects.
        System.out.printf("House1: Rooms = %d, Address = %s, Price = %.2f\n",
                house1.getNumOfRooms(), house1.getAddress(), house1.getPrice());
        System.out.printf("House2: Rooms = %d, Address = %s, Price = %.2f\n",
                house2.getNumOfRooms(), house2.getAddress(), house2.getPrice());
        System.out.printf("House3: Rooms = %d, Address = %s, Price = %.2f\n",
                house3.getNumOfRooms(), house3.getAddress(), house3.getPrice());
    }
}
