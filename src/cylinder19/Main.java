package cylinder19;

//program to calculate the  the are of circle and cylinder by taking radius ,height,
//volume and created circle and cylinder in separate classess
//and using inheritance type by keyword extends.

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = "+ circle.getRadius());
        System.out.println("circle.are ="+circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("Cylinder.radius=" +cylinder.getRadius());
        System.out.println("Cylinder.height=" +cylinder.getHeight());
        System.out.println("Cylinder.area=" +cylinder.getArea());
        System.out.println("Cylinder.volume=" +cylinder.getVolume());
    }
}
