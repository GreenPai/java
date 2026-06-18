package enumeration.ex2;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    /**
     * 만약 외부에서 public으로 생성한다면 문제가 생길 수 있다.
     * 
     *  ClassGrade newClassGrade = new ClassGrade(); //x009
     *  int result = discountService.discount(newClassGrade, price);
     *  System.out.println("newClassGrade 등급의 할인 금액: " + result);
     *  
     *  새로운 참조값 추소가 들어가 Service에서 문제를 일으킴
     */

    //private 생성자 추가
    private ClassGrade() {}
}
