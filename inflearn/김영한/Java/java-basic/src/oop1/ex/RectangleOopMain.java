package oop1.ex;

/**
 * 객체 지향 프로그래밍 : 2026/06/06
 */
public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);

    }
}
