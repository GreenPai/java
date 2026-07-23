package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 문제와 풀이2 : Queue
 * 프린터 대기
 */
public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}