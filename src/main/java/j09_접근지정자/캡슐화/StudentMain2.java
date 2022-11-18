package j09_접근지정자.캡슐화;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 s2 = new Student2();

        s2.setName("정진호");
        String nameS2 = s2.getName();
        System.out.println(nameS2);
    }


}
