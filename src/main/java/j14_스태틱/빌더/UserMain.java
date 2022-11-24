package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()

                .password("1234")
                .username("jinho")
                .build(); //결과값
        System.out.println(user);


    }
}
