package study.data_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 * Id를 직접 입력하는 경우
 * save에서 merge로 행동을 한다.
 * id가 null인지 여부를 파악하고 저장하는데 String에 값을 넣어서 생성자에 넣어서
 * 전달하는 경우에는 null이 아니고 새로운 아이템이 아니라고 인식하기에
 * db에서 조회 후 없는 것을 확인하고 없기에 새 것으로 파악 후 저장하는 비효율적인 경우가 발생한다.
 *
 * Persistable를 하는 경우에는 isNew로 파악이 가능하다.
 *
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item implements Persistable<String> {

    @Id
    private String id;

    @CreatedDate
    private LocalDateTime createdDate;

    public Item(String id){
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return createdDate == null;
    }

}
