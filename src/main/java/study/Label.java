package main.java.study;

public class Label {

    //기존 break 문을 사용하게 되면 for문 한개만 나가게 된다.
    //이중 포문의 경우 두 개 이상의 for 문을 나가고 싶으면 나가고 싶은 for 문 앞에 label을 붙여주면 된다.
    //break
    public static void main(String[] args) {
        label :for (int i = 0; i < 10; i++) {
            System.out.println("first for i >>" + i);
                for (int j = 0; j < 10; j++) {
                    if (j >= 5) {
                        break label;
                    }
                    System.out.println(i + " " + j);
                }
            }
        //continue
//            all: for(int i = 0; i<10; i++) {
//                System.out.println("first for i >>" + i);
//                for(int j = 0; j<10; j++) {
//                    if(j>=5) {
//                        continue;
//                    }
//                    System.out.println(i + " " + j);
//                }
//                System.out.println("for(j) end");
//            }
        //return
//        for(int i = 0; i<10; i++) {
//            for(int j = 0; j<10; j++) {
//                if(j>=5) {
//                    return;
//                }
//                System.out.println(i + " " + j);
//            }
//            System.out.println("for(j) end");
//        }
    }
}

