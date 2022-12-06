package j15_제네릭;

import lombok.Getter;

public class Information<T> {
    @Getter // T target에도 게터가능.
    private T target;
    public Information(T target) { //T 생성자 (다른것과 똑같이)
        this.target = target;
    }
    public void printInfo(){
        System.out.println(target);
    }
}
