package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220010)
                .name("정진호")
                .build();
        Teacher teacher = Teacher.builder()
                .teacherCode(20220010)
                .name("정진호")
                .build();

        Information<Student> studentInformation
                = new Information<>(student);//teacher 못들어감 <student> 이때 자료형이 정해짐

        Information<Teacher> teacherInformation
                = new Information<>(teacher);

        Information2 i1 = new Information2(student); // teacher 도 들어감 but 다운캐스팅해야함.(OBJECT라)
        Information2 i2 = new Information2(teacher);



        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름 : " + studentInformation.getTarget().getName()); // type이 student
        System.out.println("학생이름2 : " + ((Student)i1.getTarget()).getName()); //type이 오브젝트 (업캐스팅)그래서 안됨
        //즉 제네릭을 쓰면 업캐스팅 할 필요 가 없다.
    }



}
