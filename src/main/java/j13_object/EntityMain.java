package j13_object;

public class EntityMain {
    public static void main(String[] args) {
        Entity entity = new Entity("정진호",29,"구포동");
        Entity entity2 = new Entity("정진호",29,"구포동");
        System.out.println(entity); //롬복 tostring 생략.
        System.out.println(entity.equals(entity2));
        System.out.println(entity.hashCode());
        System.out.println(entity2.hashCode());
        System.out.println(entity.getAddress());

        System.out.println(entity.getClass());
        Class c = Entity.class;

        Object s= new Student(20220001,"정진호");
        System.out.println(Entity.class == entity.getClass());
        System.out.println(Entity.class.equals(s.getClass()));
        System.out.println(s.getClass());
        System.out.println(Entity.class);
        Object o = new Object();
        System.out.println(o.getClass());
        System.out.println(o instanceof Entity); //여기선  s 는 student객체고 Entity는 Entity이므로 속하지 않음.

    }


}
