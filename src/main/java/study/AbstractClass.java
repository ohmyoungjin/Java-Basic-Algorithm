package main.java.study;

//추상 클래스
//추상 메서드가 한 개 라도 있으면 class 앞에 abstract를 붙여줘야 한다.
//추상 클레스는 static 키워드를 가질 수 없다.
public abstract class AbstractClass {
    //추상 메서드
    public abstract int b();
    //abstract는 선언된 메서드 앞에서만 쓰일 수 있다. (구현되지않은)
//    public abstract int c() {
//        System.out.println("hello!");
//    }
    //***추상 클래스 안에서는 추상 메소드가 아닌 메소드가 존재할 수 있다
    public void d() {
        System.out.println("AbstractClass!");
    }

    //추상 클래스를 상속 받은 클래스
    static class AbstractClassSon extends AbstractClass {
        //상속 받은 자식에서는 추상 메서드를 반드시 재정의(override)해줘야 한다.
        @Override
        public int b() {
            return 1;
        }
    }
    public static void main(String[] args) {
        //이건 오류 난다 => 추상 클레스를 오버라이드 없이 바로 인스턴스화 시킬려고 했기 때문
        //AbstractClass abstractClass = new AbstractClass();
        AbstractClassSon abstractClassSon = new AbstractClassSon();

    }

}
