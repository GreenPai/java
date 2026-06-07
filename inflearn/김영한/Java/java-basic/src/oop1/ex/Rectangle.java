package oop1.ex;

/**
 * 객체 지향 프로그래밍 : 2026/06/06
 */
public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }


}
