package final1;

/**
 *  Final 변수와 상수 : 2026/06/07
 *  상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다.
 *  상수는 static final을 사용한다.
 *  대문자를 사용하고 구분은 _(언더스코어)로 한다.
 *  
 *  기본 변수는 hoursInDay  로 할 수 있지만 
 *  전부 대문자를 관례를 가지는 상수는 구분을 위해 _ 을 사용
 */
//상수
public class Constant {
    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    //애플리케이션 설정 상수
    public static final int MAX_USERS = 2000;
}