

public class Main {
    public static void main(String[] args) {
        System.out.println("The program is running well");

        //switch expression

        int num = 20;
        String result= "The num is ";

        switch (num) {
            case 1 -> System.out.println("num is 1");
            case 10 -> System.out.println("num is 10");
            case 20 -> System.out.println("The num is "+num);


            //default case statement
            default -> System.out.println("Not the number you are searching");
        }


    }
}