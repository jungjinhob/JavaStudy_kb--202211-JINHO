package j14_스태틱.빌더;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
public class User {
    private String username;
    private String password;
    private String email;
    private String name;


}
