public class Circle extends Figure {
    public Circle(String color, String form) {
        super(color, form);
    }

    @Override
    public void hasColor() {
        System.out.println(toString() + "I'm white");
    }
}
