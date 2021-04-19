package Module7.Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose one of the shape form: Circle, Square, Rectangle, Triangle, Quad");
        String nameInput = scanner.nextLine();

        switch (nameInput.toLowerCase()) {
            case "circle":
                Circle circle = new Circle();
                circle.shape();
                break;
            case "square":
                    Square square = new Square();
                    square.shape();
                break;
            case "rectangle":
                Rectangle rectangle = new Rectangle();
                rectangle.shape();
                break;
            case "triangle":
                Triangle triangle = new Triangle();
                triangle.shape();
                break;
            case "quad":
                Quad quad = new Quad();
                quad.shape();
                break;

            default: throw new RuntimeException("Doesn't exist! Please, return and make right chose!");
        }

    }
}
