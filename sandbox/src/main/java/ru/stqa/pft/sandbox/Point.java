package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;
  public Point()
  {
  }
    public Point(double _x, double _y)
  {
    x = _x;
    y = _y;
  }

  public static double distance (Point p, Point p1) {

    double dx = p1.x - p.x;
    double dy = p1.y - p.y;
    return Math.sqrt(dx * dx + dy * dy);
  }








}




