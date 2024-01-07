package practice;

public class Calculator {
    // 정수 두 개를 더하는 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 실수 두 개를 더하는 메서드 (Overloading)
    public double add(double a, double b) {
        return a + b;
    }
}

// 부모 클래스
class Animal {
    // 소리를 내는 메서드
    public void makeSound() {
        System.out.println("장!충!동! 왕족발~~! 보쌈~~!!~");
    }
}

// 자식 클래스
class Dog extends Animal {
    // 소리를 내는 메서드를 재정의 (Overriding)
    @Override
    public void makeSound() {
        System.out.println("멍~!! 멍멍!!.");
    }
}
