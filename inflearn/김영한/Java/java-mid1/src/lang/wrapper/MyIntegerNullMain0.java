package lang.wrapper;

/**
 * Wrapper 클래스 - 2026 6월 17일
 * int 형으로 할 경우
 * 만약 값이 있는 지 찾을 때 없다면 어떠한 값을 출력할 지 애매하다.
 * -1을 찾을때 없을때 -1을 출력한다면 있는것일까 없는것일까 알기 힘들다.
 */
public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
