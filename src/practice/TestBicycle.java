package practice;

public class TestBicycle {

    public static void main(String[] args) {
        //creating 2 bicycle instances objects
        Bicycle bike1= new Bicycle();
        Bicycle bike2 = new Bicycle();

        //invoking methods
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        System.out.println("For bike1");
        bike1.printStates();

        //providing values for bike2
        bike2.changeGear(100);
        bike2.speedUp(25);
        bike2.changeCadence(5);
        System.out.println("For bike2");
        bike2.printStates();
    }
}
