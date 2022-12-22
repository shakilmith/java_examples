package oop;

public class Student {
    //defining fields or instance variables

    int id; //fields or data members
    String name;//data members or instance variables

    //creating a method that will print the id and name of the Student class
    void displayStudent(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println(id +" "+name);
    }

    //method
    void displayInformation(){
        System.out.println(id +" "+ name);
    }

    //main method
    public static void main(String[] args) {
        System.out.println("The program is running..");
        //creating an instance of the Student class
        Student s1= new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //reference variable
        s1.id=1;
        s1.name="Eugue";

        //method invocation
        s1.displayStudent(101, "Shakil");
        s2.displayStudent(102, "Mark Smith");
        s3.displayStudent(103, "Bob Smith");
       s1.displayInformation();
    }
}
