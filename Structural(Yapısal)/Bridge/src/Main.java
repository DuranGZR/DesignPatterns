
public class Main {
    public static void main(String[] args) {

        Shape redTriangle = new Triangle(new Red());
        Shape blueCircle = new Circle(new Blue());

        redTriangle.draw();
        blueCircle.draw();


    }
}