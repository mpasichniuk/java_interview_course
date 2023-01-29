import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("red", "square");

        Square square = new Square("red", "square");
        Triangle triangle = new Triangle("black", "triangle");
        Circle circle = new Circle("white", "circle");

        List<Figure> figures = Arrays.asList(figure, square, triangle, circle);
        for (Figure f : figures) {
            f.hasColor();
        }
    }
}

