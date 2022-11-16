package main.java.study;

import java.util.Arrays;

//Enum class의 사용 이유
//코드가 단순해진다.
//인스턴스 생성과 상속을 방지한다.
//키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
enum E_Fruit {
    //필드 하나 당 인스턴스 한개 씩 생성한다.

    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    public String getColor() {
        return this.color;
    }

    //생성자를 생성과 동시에 상수값을 정의하게 된다.
    E_Fruit(String color) {
        //결과
        //Call Constructor = APPLE
        //Call Constructor = PEACH
        //Call Constructor = BANANA
        System.out.println("Call Constructor = " + this);
        //지역 변수(매개변수)가 전역변수보다 우선순위가 높다.
        //자바는 큰 범위보다 작은 범위가 우선순위가 높다.
        this.color = color;
    }
}

enum E_Company {
    GOOGLE, APPLE, ORACLE
}

public class EnumTestV3 {

    public static void main(String[] args) {
        //컴파일 되기 전에 지정할 상수부분을 정의하는 경우가 생긴다.
        //이 때는 static 변수로 설정하는 경우도 있고
        //interface로 정의하는 경우도 있다.
        //하지만 이와 같이 이름이 겹치는 과정에서
        //FRUIT.APPLE COMPANY.APPLE 이 둘은 비교 대상이 되면 안되는데 비교가 가능하고
        //숫자가 똑같다면 같다는 답이 나온다.
        //이건 정상적인 로직이 아니다 이를 해결하기 위해서 enum class가 등장했다.
        //운영중에 오류(Runtime error)나는 설계보단 컴파일 과정(compile error)에서 오류가 나는 아키텍쳐가 잘 설계된 아키텍쳐이다 !! (중요)
//        if(FRUIT.APPLE == COMPANY.APPLE) {
//            System.out.println("같습니다");
//        }

        E_Fruit type = E_Fruit.BANANA;

        for(E_Fruit f : E_Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }

        switch (type) {
            case APPLE :
                System.out.println("사과 입니다 색은!? " + E_Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println("복숭아 입니다 색은!? " + E_Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println("바나나 입니다 색은!? " + E_Fruit.BANANA.getColor());
                break;
        }

    }

}
