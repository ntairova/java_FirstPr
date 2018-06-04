package ru.stqa.pft.sandbox;

public class Task1 {

  public static void main (String[] args) {
    System.out.println("Задание 1");



    Point p = new Point(0, 0);
    p.x = 0;
    p.y = 0;

    Point p1 = new Point(3, 4);
    p1.x = 3;
    p1.y = 4;


    System.out.println("Заданы координаты точек А и В. Точка А" +  "("+ p.x+ ";" + p.y +")" + ", точка В" + "("+ p1.x +";" + p1.y +")" );
    System.out.println("Расстояние между точками " + Point.distance(p, p1));



  }




  }





