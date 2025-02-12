public class House {
    private int numOfRooms; // Private
    protected String address; // Protected
    public double price; // Public

    // Default constructor
    public House() {
        this.numOfRooms = 3;
        this.address = "Default Address";
        this.price = 100000.0;
    }

    // Constructor 1
    public House(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    // Constructor 2
    public House(String address) {
        this.address = address;
    }

    // Constructor 3
    public House(double price) {
        this.price = price;
    }

    // Constructor 4
    public House(int numOfRooms, String address) {
        this.numOfRooms = numOfRooms;
        this.address = address;
    }

    // Constructor 5
    public House(int numOfRooms, double price) {
        this.numOfRooms = numOfRooms;
        this.price = price;
    }

    // Constructor 6
    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }

    // Constructor 7
    public House(int numOfRooms, String address, double price) {
        this.numOfRooms = numOfRooms;
        this.address = address;
        this.price = price;
    }

    // Getters
    public int getNumOfRooms() {
        return numOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }
}
