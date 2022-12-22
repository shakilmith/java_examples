

public class SwitchMonthExample {


    public static void main(String[] args) {
        int number = 10;
        String month =" ";

        //switch expression
        switch (number){
            case 1 -> month="January";
            case 2 -> month ="February";
            case 3 -> month ="March";
            case 4 -> month ="April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month  = "July";
            case 8-> month ="August";
            case 9 -> month ="September";
            case 10-> month ="October";
            case 11 -> month =" November";
            case 12 -> month ="December";
            //default case
            default -> month ="No month";
        }
        //printing the month of the given num
        System.out.println("The "+ number +" month is "+month);
    }

}
