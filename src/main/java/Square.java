public class Square extends Figure{
    public Square(String color, String form) {
        super(color, form);
    }

    @Override
    public void hasColor() {
        System.out.println(toString() + "I'm red");
    }
}

