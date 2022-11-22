package j11_상속.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal[] animals = new Animal[5];
        //업캐스팅 animals 부분 .
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = human;
        animals[3] = tiger;
        animals[4] = human;
        System.out.println("[업캐스팅]"); // move는 오버라이드 된것 실행.
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();
        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human){ //animals의 하위 객체가 human일시
                Human h = (Human)animals[i]; // (human) 만 다운캐스팅 부분.
                h.readBooks();
            }else if ( animals[i] instanceof Tiger){ //animals의 하위 객체가 Tiger일시
                Tiger t = (Tiger)animals[i];
                t.hunting();

            }else{ //둘다 아닐때
                System.out.println("다운불가");
            }

        }





    }
}
