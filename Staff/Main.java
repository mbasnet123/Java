package Staff;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> qualifications = new ArrayList<String>();
        qualifications.add("BEIT");
        qualifications.add("BIT");
        qualifications.add ("MBA");

        Staff sunil = new Staff("Sunil", 19, qualifications, 300000, "IT");
        sunil.output();
        qualifications.clear();

        System.out.println();
        System.out.println();
        qualifications.add("Phd");
        qualifications.add("CSIT");

        Staff rajesh = new Staff("Rajesh", 32, qualifications, 400000, "Admin" );
        rajesh.output();
        qualifications.clear();

        System.out.println();
        System.out.println();
        qualifications.add("MBBS");
        qualifications.add("MBA");

        Staff asis = new Staff("asis", 32, qualifications, 300000, "Head" );
        asis.output();
}
}