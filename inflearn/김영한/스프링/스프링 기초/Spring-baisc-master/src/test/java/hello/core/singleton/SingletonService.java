package hello.core.singleton;

/**
 * 싱글톤 서비스 :
 * 기본 AppConfig는 호출될 때 마다 새로운 객체를 생성했기에 
 * 불필요한 객체가 많이 생성 될 수 있다.
 */

/**
 * 인스턴스의 문제점 :
 * 1. 1~3까지 패턴을 구현하는데 코드가 많이 들어간다.
 * 2. 구체적인 클래스의 의존하기 DIP 위반
 * 3. OCP를 위반하기 쉽다.
 * 4. private 생성자로 자식을 만들기 힘들다.
 * 5. 유연성이 떨어진다.
 */
public class SingletonService {
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();
    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.

    public static SingletonService getInstance() {
        return instance;
    }
    //3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}

