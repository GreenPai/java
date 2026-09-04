package hello.springmvc.basic;

import lombok.Data;

/**
 * Data 를 사용하면
 * Getter, Setter, ToString, EqualsAndHashCode, RequireArgsConstructor 를 자동으로 등록
 */
@Data
public class HelloData {
    private String username;
    private int age;
}
