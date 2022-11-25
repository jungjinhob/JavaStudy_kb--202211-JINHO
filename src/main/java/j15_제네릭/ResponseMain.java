package j15_제네릭;

public class ResponseMain {
    public static CMRespDto<? extends Object> response(String msg, Object data){ // <?>(자료형)  -> 어떤 자료형이 들어올지 모르겠다
        // extends object밑(자신포함) 에 것만 참조된다. super는 부모만(나자신 포함)
        // 만약 <student> 하면 response에 student 밖에 못들감
        return new CMRespDto<>(msg, data);
    }
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220011)
                .name("정진호")
                .build();

        System.out.println(response("학생데이터 응답", student)); //-> student 자리가 T data자리
        System.out.println(response("student code error !!", "학번에 오류가 있습니다."));
    }
}
