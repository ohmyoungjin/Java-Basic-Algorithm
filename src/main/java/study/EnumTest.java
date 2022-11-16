package main.java.study;

interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA= 3 ;
}
interface COMPANY {
    int APPLE = 1, GOOGLE = 2 , ORACLE = 3 ;
}

public class EnumTest {

    public static void main(String[] args) {
        //컴파일 되기 전에 지정할 상수부분을 정의하는 경우가 생긴다.
        //이 때는 static 변수로 설정하는 경우도 있고
        //interface로 정의하는 경우도 있다.
        //하지만 이와 같이 이름이 겹치는 과정에서
        //FRUIT.APPLE COMPANY.APPLE 이 둘은 비교 대상이 되면 안되는데 비교가 가능하고
        //숫자가 똑같다면 같다는 답이 나온다.
        //이건 정상적인 로직이 아니다 이를 해결하기 위해서 enum class가 등장했다.
        //운영중에 오류나는 설계보단 컴파일 과정에서 오류가 나는 아키텍쳐가 잘 설계된 아키텍쳐이다 !! (중요)
        if(FRUIT.APPLE == COMPANY.APPLE) {
            System.out.println("같습니다");
        }

        int type = FRUIT.BANANA;

        switch (type) {
            case FRUIT.APPLE :
                System.out.println("사과 입니다");
                break;
            case FRUIT.PEACH:
                System.out.println("복숭아 입니다");
                break;
            case FRUIT.BANANA:
                System.out.println("바나나 입니다");
                break;
        }

    }

}
