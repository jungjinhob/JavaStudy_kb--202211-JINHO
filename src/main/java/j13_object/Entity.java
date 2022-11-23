package j13_object;

import lombok.*;

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
