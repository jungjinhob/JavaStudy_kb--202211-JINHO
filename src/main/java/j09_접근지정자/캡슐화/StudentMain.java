package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("정진호","남");

        s1.setName("홍길동");

        s1.printInfo();
        System.out.println(s1.getGender());
    }

}
