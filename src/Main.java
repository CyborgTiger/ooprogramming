import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Insert Height");
        rectangleOne.setHeight(input.nextDouble());
        System.out.println("Insert Width");
        rectangleOne.setWidth(input.nextDouble());

        System.out.println("Height: " + rectangleOne.getHeight() + " Width: " + rectangleOne.getWidth());
        System.out.println("Perimeter: " + rectangleOne.getPerimeter());
        System.out.println("Area: " + rectangleOne.getArea());

    }
}
