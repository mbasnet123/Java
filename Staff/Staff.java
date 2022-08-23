package Staff;

import java.util.ArrayList;

public class Staff {
    public String name;
    public int age;
    public ArrayList<String> qualifications;
    public int salary;
    public String department;

public Staff( String name, int age, ArrayList<String> qualifications, int salary, String department){
    this.name = name;
    this.age= age;
    this.qualifications = qualifications;
    this.salary = salary;
    this.department = department;
}

public void output(){
    System.out.println("The name of the staff is " + name);
    System.out.println("The age of the staff is " + age);
    for(String qualification: qualifications) {

        System.out.println("The qualification of the staff is " + qualification);
    }
    System.out.println("The salary of the staff is " + salary);
    System.out.println("The department of the staff is " + department);
}
}