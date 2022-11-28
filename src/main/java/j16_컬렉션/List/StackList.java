package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {
    public static void main(String[] args) {
        ArrayList<String> stack = new ArrayList<String>();
        //임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현

//        stack.add("임지현");
//        stack.add(0,"신경수");
//        stack.add(0,"고희주");
//        stack.add(0,"문승주");
//        stack.add(0,"장건녕");
//        stack.add(0,"박수현");
//        stack.add(0,"황석민");
//        stack.add(0,"박준현");
//        for(String name : stack){
//                System.out.print(name);
//                if(!name.equals(stack.get(stack.size() -1))){
//                    System.out.print(", ");
//                }
//        }

        stack.add("임지현");
        stack.add("신경수");
        stack.add("고희주");
        stack.add("문승주");
        stack.add("장건녕");
        stack.add("박수현");
        stack.add("황석민");
        stack.add("박준현");
        ArrayList<String> copyList = new ArrayList<String>(); // stack 리스트에서 삭제한거 넣는 리스트.
        int a = stack.size();
        for(int i = 0; i < a; i++){
            copyList.add(0,stack.remove(a-i-1));
        }
        System.out.println(copyList);





    }
}
