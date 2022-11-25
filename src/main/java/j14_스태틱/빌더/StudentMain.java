package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220010)
                .name("정진호")
                .address("부산")
                .build();
        System.out.println(student); //student.toString(); (생성자 는 없었음)

        Student.StudentBuilder sb = new Student.StudentBuilder();
    }
}
