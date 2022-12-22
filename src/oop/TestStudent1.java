package oop;


class Student1{
    int id;
    String name;

}
public class TestStudent1 {
    public static void main(String[] args) {
        System.out.println("Program is running");
        //creating instance of the class
        Student1 s1 = new Student1();
        s1.id=101;
        s1.name="Shakil";
        System.out.println(s1.id + " "+s1.name.toUpperCase());
    }
}
