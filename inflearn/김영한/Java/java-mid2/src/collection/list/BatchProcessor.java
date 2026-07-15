package collection.list;

/**
 * 컬렉션 프레임워크
 * */
public class BatchProcessor {

    /**
     * BatchProcessor은 밑의 코드를 사용할 경우 구체적인 클래스에 의존된다.
     * 구체적인 클래스에 직접 의존하면 MyArrayList를 MyLinkedList로 변경할 때 마다
     * BatchProcessor 코드를 수정해야된다.
     *
     * 구체적인 클래스에 의존하는 대신 추상적인  MyList 인터페이스에 의존하는 방법도 있다.
     */
    // private final MyLinkedList<Integer> list = new MyLinkedList<>(); //코드 변경

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

}