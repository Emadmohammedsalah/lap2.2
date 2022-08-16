import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float Area , length, width;
        System.out.println("enter length:");
        length=in.nextFloat();
        System.out.println("enter width:");
        width=in.nextFloat();
        Area=width*length;
        System.out.println("Area ="+Area);


    }
}
