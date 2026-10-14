package hello.ch05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        //문자열 분리
        String[] tokens = board.split(",");

        //인덱스 별로 읽기
        System.out.println("tokens.length = " + tokens.length);

        for(int i=0; i<tokens.length; i++){
            System.out.println("tokens[i] = " + tokens[i]);
        }
    }
}
