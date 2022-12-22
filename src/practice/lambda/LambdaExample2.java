package practice.lambda;

//create and interface that doesn't take any argument

interface PrintYourName{
    public String getName(); // this method doesn't have body.
}
public class LambdaExample2 {
    public static void main(String[] args) {

        //implement the(PrintYourName) interface through lambda expression
        String name = "Shakil Ahmed"; // You can omit it too.
        PrintYourName print =() ->{
            return  "My name is "+ name;
        };
        System.out.println(print.getName());
    }
}
