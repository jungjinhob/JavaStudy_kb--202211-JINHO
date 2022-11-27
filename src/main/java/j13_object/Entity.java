package j13_object;

import lombok.*;
//롬복프로젝트 import해서 밑에 어노테이션 사용
import java.util.Objects;
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor //모든값 생성자
//@Getter// Get
//@Setter// Set
//@EqualsAndHashCode // equals, hashCode
//@ToString //toString
@Data
public class Entity {

    private String name;
    private int age;
    private String address;

    public boolean cmp(Object obj) {
        return this.getClass() == Entity.class;
    }

}
