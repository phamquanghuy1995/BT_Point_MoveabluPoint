package com.huy;

public class Main {

    public static void main(String[] args) {
        System.out.println("kiemthuPoint");
        Point point = new Point();
        System.out.println(point);
        point = new Point(2, 3);
        System.out.println(point);
        point.setXY(5, 6);
        System.out.println(point);
        //kiemthu moveablePoint
        System.out.println("kiemthu moveablePoint");
        MovablePoint moveablePoint=new MovablePoint();
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(1,2);
        for (int i=0;i<10;i++) {
            System.out.println(moveablePoint.move());
        }

        System.out.println("test Ép kiểu");
        Point movepoin02=new MovablePoint();
        movepoin02.setXY(2,3);
        MovablePoint mv=(MovablePoint)movepoin02;
        mv.setSpeed(2,2);
        for (int i=0;i<10;i++) {
            System.out.println(mv.move());
        }
    }
}
