package Javademos;

public class TwoRockets {
    public static void main(String[] args){{
        printUpperbody();
        printMiddleline();
        printSideline();
        printMiddleline();
        printUnitedbody();
        printMiddleline();
        printSideline();
        printMiddleline();
        printUpperbody();}
    }
    public static void printUpperbody()
    {
        System.out.println("   /\\    "+"    /\\");
        System.out.println("   /\\    "+"    /\\");
        System.out.println("   /\\    "+"    /\\");
    }
    public static void printMiddleline(){
        System.out.println("  +_____+ "+"   +_____+");
    }
    public static void printSideline(){
        System.out.println("   |     |"+"   ||");
        System.out.println("   |     |"+"   ||");
    }
    public static void printUnitedbody(){
        System.out.println("|United"+"|United|");
        System.out.println("|United"+"|United|");
    }


}
