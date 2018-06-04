package ru.stqa.pft.sandbox;

public class MyFirstProgram5 {


    public static void main(String[] args) {
        hello("world");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямогугольника " +  r.a  +  " и "  +  r.b  + " = " + r.area());

        Point p = new Point(2, 4);
        p.x = 2;
        p.y = 4;

        Point p1 = new Point(3, 5);
        p1.x = 3;
        p1.y = 5;


      System.out.println("Заданы координаты точек А и В. Точка А" +  "("+ p.x+ ";" + p.y +")" +  "("+ p1.x +";" + p1.y +")" );


    }




  public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }






}