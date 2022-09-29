public class RoomMain{
    public static void main(String[] args) {
        Bedroom room = new Bedroom(32, 32, 43);
        int area = room.getArea();
        int volume = room.getVolume();
        System.out.println("The area is "+ area);
        System.out.println("The volume is "+volume);
    }
}

