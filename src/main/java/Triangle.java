public class Triangle extends Figure{
    public Triangle(String color, String form) {
        super(color, form);
    }

    @Override
    public void hasColor() {
        System.out.println(toString() + "I'm black");
    }
}
