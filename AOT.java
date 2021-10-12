public class AOT {

  public static void main(String[] args) {
    Point A = new Point(10, 20);
    Point B = new Point(10, 60);
    Point C = new Point(80, 20);
    System.out.println("area of triangle using formula 1: "
        + Triangle.area(A, B, C));
    
 }
}
class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
    
}
class Triangle {
  public static float area(Point A, Point B, Point C) {
    float area = (A.x * (B.y - C.y) 
                    + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
    return Math.abs(area);
  }
}