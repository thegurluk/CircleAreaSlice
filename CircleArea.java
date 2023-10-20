import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        System.out.println("please write radius for area of the circle slice: ");
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        System.out.println("please write angle for area of the circle slice: ");
        double a=input.nextDouble();
        double pi=3.14;
        double sliceArea=(pi*(r*r)*a)/360;
        System.out.println("Area is:"+sliceArea);


    }
}
