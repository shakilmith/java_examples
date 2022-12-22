package practice.array;

import java.util.Arrays;

public class ArrayExample {
    //main method
    public static void main(String[] args) {
        //declare an array; we don't initialize array here.
        int [] arr; //We can also create array like: int [] arr = new int[10];
        //or int [] arr ={1,2,3,4,5,6,7,8,9,10}; Here we initialize values at the time of
        //array declaration.
        //initialize values to this array; (We say it allocates memory;
        //allocates memory for 10 integer numbers
        arr = new int[10];
        //initialize the first element of assign values to the first index.
        arr[0] = 100;
        //initialize the second number
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        arr[5] = 600;
        arr[6] = 700;
        arr[7] = 800;
        arr[8] = 900;
        arr[9] = 1000;

        //print out
        System.out.println("Element(1) of index 0 is: "+arr[0]);
        System.out.println("Element(2) of index 1 is: "+arr[1]);
        System.out.println("Element(3) of index 2 is: "+arr[2]);
        System.out.println("Element of index 3 is: "+arr[3]);
        System.out.println("Element of index 4 is: "+arr[4]);
        System.out.println("Element of index 5 is: "+arr[5]);
        System.out.println("Element of index 6 is: "+arr[6]);
        System.out.println("Element of index 7 is: "+arr[7]);
        System.out.println("Element of index 8 is: "+arr[8]);
        System.out.println("Element(10) of index 9 is: "+arr[9]);
        //definitely the below one will be array out of bounds as we have toal 10 elements of our
        //'arr' array and the first element started from 0 index and ended to index num 9;
        //Hope this one make sense.
        // System.out.println("Element of index 10 is :"+arr[10]);
        System.out.println(Arrays.stream(arr).sum());




    }
}
