package j14_스태틱.내부클래스;

import lombok.Getter;

public class A {
    public class B{ //A를 생성하지 않고 접근하려면 static 사용
        @Getter
        private String name;

        public B(String name){
            this.name = name;
        }
    }
}
