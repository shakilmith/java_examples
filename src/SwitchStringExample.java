

//Java Allows us to use String literal in
// Switch expression. Below I write an example of String literal


public class SwitchStringExample {

    public static void main(String[] args) {
        String position ="Expert";

        int level =0;
        //switch expression
        switch (position){
            case "Beginner" -> level =1;
            case "Intermediate" -> level =2;
            case "Expert" -> level =3;
            default -> level=0;
        }
        System.out.println("Your level is "+level);
    }

}
