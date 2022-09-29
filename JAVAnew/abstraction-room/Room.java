

//abstract is used to restrict object creation
public abstract class Room {
    int length, breadth;
    Room(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int getArea(){
        return length*breadth;
    }
}
