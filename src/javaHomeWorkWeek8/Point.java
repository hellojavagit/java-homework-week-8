package javaHomeWorkWeek8;
//program to find the distance between two points by using constructors and methods.

public class Point{
    int x,y;

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2)=" + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public Point()
    {
    }
    public Point(int x, int y )
    {
        this.x = x;
        this.y = y;
    }
    public  int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int X)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y =y;
    }
    public double distance()
    {
        //return Math.sqrt((this.x*this.x) + (this.y)*(this.y));
        return distance(0,0);
    }
    public double distance(int x, int y)
    {
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }
    public  double distance(Point point)
    {
        //int x = point.getX();
       // int y = point.getY();
       // return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        return distance(point.getX(),point.getY());
    }


}
