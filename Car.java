public class Car{
    public String name;
    public String engine;
    public int price;
    public String color;
    
    public Car(String name, String engine, int price, String color){
        this.name = name;
        this.engine = engine;
        this.price = price;
        this.color = color;
    }

    public void output(){
        System.out.println("The name of class is "+ name);
        System.out.println("The engine of class is "+ engine);
        System.out.println("The price of class is "+ price);
        System.out.println("The color of class is "+ color);
    }
}
