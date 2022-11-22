package j12_추상.추상클래스;

public class Tiger extends Animal{
    public Tiger(String kind){
        super("호랑이");
    }

    @Override
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
}
