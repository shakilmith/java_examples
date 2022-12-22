package practice;

public class Bicycle {
    int cadence=0;
    int speed=0;
    int gear = 1;

    //creating methods
    void changeCadence(int newValue){
        cadence= newValue;
    }
    void changeGear(int newValue){
        gear=newValue;
    }
     void speedUp(int increment){
        speed = speed+increment;
     }

     void applyBrakes(int decrement){
        speed = speed-decrement;
     }

     //creating methods that will present data
    void printStates(){
        System.out.println("Cadence: "+cadence + " speed: "+speed+" gear: "+gear);
    }
}
