package IUH_Exercises;

public class TestSomeThing {
    public static void main(String[] args) {
        Circle circle_01
                = new Circle(10.3F);
        Circle circle_02
                = new Circle(5.7F);
        System.out.println(circle_01.radius);
        System.out.println(circle_01.PI);
        circle_01.PI = 7.8F;
        System.out.println(circle_01.radius);
        System.out.println(circle_01.PI);
        System.out.println(circle_02.radius);
        System.out.println(circle_02.PI);
        circle_01.PI = 7.9F;
        System.out.println(circle_01.radius);
        System.out.println(circle_01.PI);

        System.out.println(circle_02.radius);
        System.out.println(circle_02.PI);
    }

}
class Circle{
    public float radius = 0;
    public static float PI = 3.15F;
    public static float PIA = 3.15F;
    public Circle(float radius) {
        this.radius = radius;
    }
}
