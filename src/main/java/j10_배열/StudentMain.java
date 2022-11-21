package j10_배열;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("정진호",1);
        students[1] = new Student("정진이",2);
        students[2] = new Student("정진삼",3);

        for( int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].getName() + ", 학년 : " + students[i].getYear());
        }



    }


}
