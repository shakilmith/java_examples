package enum_example;

 enum Level {
     LOW,
     MEDIUM,
     HIGH
}

public class EnumExample {
    public static void main(String[] args) {
        Level medium= Level.MEDIUM;
        //switch
        switch (medium){
            case LOW -> System.out.println("Low Level");
            case MEDIUM -> System.out.println("Medium Level");
            case HIGH -> System.out.println("High Level");
        }
        //loop through all the enums
        for (Level lv : Level.values()){
            System.out.println(lv);
        }
        //enum in if statement
        Level level = Level.HIGH;
        if(level ==Level.LOW){
            System.out.println("Low level");
        } else if (level == Level.MEDIUM){
            System.out.println("Medium Level");
        } else {
            System.out.println("High level");
        }
    }


}
