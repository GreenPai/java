package collection.list;

/**
 * 리스트 추상화2 - 의존관계 주입
 * BatchProcessor을 MyList로 추상화를 의존시키는 경우
 * MyArrayList를  MyLinkedList로 바꾸는 경우에도
 * BatchProcessor 코드를 수정할 필요 없다.
 */
public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}