package j11_상속.동물;

public class Human extends Animal{
    public Human() {
        super(); //Animal 생성자 가리킴.

    }
    @Override // @문법 -> 어노테이션
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
