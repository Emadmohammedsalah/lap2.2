import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=in.nextInt();
        System.out.println("enter the value of y:");
        int y=in.nextInt();
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("the value of x is "+x);
        System.out.println("the value of y is "+y);



    }
}
