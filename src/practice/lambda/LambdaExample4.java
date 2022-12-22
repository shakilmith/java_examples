package practice.lambda;

//create an interface that add three int numbers
interface Summation{
    //method which have 3 numerical(int) parameters
    public int sum(int x, int y, int z);
}
public class LambdaExample4 {
    //main method
    public static void main(String[] args) {
        //lambda expression without data type
        Summation s1 =(a, b, c)-> a+b+c;
        System.out.println(s1.sum(10,20,30));

        // with data type in lambda expression
        Summation s2 = (int x ,int y,int z)-> x+y+z;
        System.out.println(s2.sum(10,20,30));
    }
}
