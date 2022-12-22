package practice.lambda;

//create and interface that will take 1 or multiple argument
interface Expression{
    public String getYourExpression(String exp);
}
public class LambdaExample3 {
    //main method
    public static void main(String[] args) {
        //call the interface
        Expression e = (exp) -> {
            return "Lambda is "+exp;
        };
        System.out.println("How do you feel about Lambda in Java? ");
        System.out.println(e.getYourExpression("Awesome!"));
    }
}
