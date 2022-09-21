package Day11._2WeClass;

public interface Shape {
    void draw();
}

interface Rectangle {
    void draw();
}
class Square implements Shape,Rectangle{

    @Override
    public void draw() {
        System.out.println("Inside draw method of Square class");
    }
    static void m1(){
        System.out.println("Inside m1 of square class");
    }
    public static void main(String[] args) {
        Shape shape = new Square();
        shape.draw();
    }
}