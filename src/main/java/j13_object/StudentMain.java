package j13_object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Student student = new Student(20220001,"정진호");
        Student student2 = new Student(20220001,"정진호");


        System.out.println(student.hashCode() == student2.hashCode());


        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Field[] fields = c.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
        }//변수의 이름 출력
        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
}    }// 메서드 이름 출력


}
