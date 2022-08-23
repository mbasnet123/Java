public class Main{ 
public static void main(String[] args) {
    Car tesla = new Car("Tesla", "Electric", 200000, "Red");
    tesla.output();
    Car lexus = new Car("Lexus", "Petrol", 30000, "Green");
    lexus.output();
    Car landRover = new Car("landRover", "Petrol", 30000, "Silver");
    landRover.output();
}
}