
package j15_제네릭;

import lombok.Getter;

public class Information2 {
    @Getter
    private Object target;

    public Information2(Object target) { //student를 넣어줌 target에
        this.target = target;
    }
    public void printInfo(){
        System.out.println(target);
    }
}
