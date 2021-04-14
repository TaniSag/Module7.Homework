package Module7.Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose one of the shape form: Circle, Square, Rectangle, Triangle, Quad");
        String nameInput = scanner.nextLine();

        if (nameInput.equalsIgnoreCase("Circle")) {
            Shape shape = new Circle();
            shape.shape();
        } else
        if (nameInput.equalsIgnoreCase("Rectangle")) {
            Shape shape = new Rectangle();
            shape.shape();
        } else
        if (nameInput.equalsIgnoreCase("Triangle")) {
            Shape shape = new Triangle();
            shape.shape();
        } else
        if (nameInput.equalsIgnoreCase("Quad")) {
            Shape shape = new Quad();
            shape.shape();
        } else
        if (nameInput.equalsIgnoreCase("Square")) {
            Shape shape = new Square();
            shape.shape();

        } else
        throw new RuntimeException("Please, try again and chose from the list!");

    }
}