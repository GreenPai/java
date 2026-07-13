package generic.ex5;

// 여기서 T는 런타임에 모두 Object가 되어버린다.
// instanceof는 항상 Object와 비교하게 된다. 항상 참이 되는 문제 발생
public class EraserBox<T> {

    /**
     *  return param instanceof T
     *  컴파일 시정에 Object로 바뀐다.
     *  return param instanceof Object -> 항상 참
     */
    public boolean instanceCheck(Object param){
        // return param instanceof T; // 오류
        return false;
    }

    /**
     *  new T()는 항상 Object가 된다.
     *  따라서 자바는 매개 변수에 new를 허용하지 않는다.
     *
     *  예) Dog를 만들고 싶어도 Object가 만들어진다. 
     *  -> 개발자의 의도와 다름
     *  */
    public void create(){
        // return new T(); // 오류
    }


}
