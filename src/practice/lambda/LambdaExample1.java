package practice.lambda;

//create an interface (this is a functional interface)

interface Drawable{
    // create an empty method means, the method doesn't have body.
    public void draw();
}

public class LambdaExample1 {
    public static void main(String[] args) {

        int width = 30;

        //lambda expression
        Drawable draw = () -> System.out.println("The width of the rectangle :"+ width + " cm");
        draw.draw();
    }

}
