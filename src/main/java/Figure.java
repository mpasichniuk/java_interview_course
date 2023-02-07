public class Figure {
    private String color;
    private String form;

    public Figure(String color, String form) {
        this.color = color;
        this.form = form;
    }
    public void hasColor() {
        System.out.println(toString() + color);
    }

    @Override
    public String toString() {
        return "I'm " + form + " and I'm " + color + " color. " ;
    }
}


