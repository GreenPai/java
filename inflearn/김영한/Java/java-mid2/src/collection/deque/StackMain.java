package collection.deque;

import java.util.Stack;

/**
 * 스택 자료 구조
 *
 * Stack는 자바 1.0에 개발되었기 때문에 Deque를 사용하는 것이 더 좋다.ㄴ
 */
//Stack은 사용하면 안됨 -> Deque를 대신 사용
public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}