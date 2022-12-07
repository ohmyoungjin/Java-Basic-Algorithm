package main.java.study;

//FoolException이 상속받은 클래스는 RuntimeException이다. Exception은 크게 두가지로 구분된다.
//RuntimeException
//Exception
//RuntimeException은 실행시 발생하는 예외이고 Exception은 컴파일시 발생하는 예외이다.
//즉, Exception은 프로그램 작성시 이미 예측가능한 예외를 작성할 때 사용하고
//RuntimeException은 발생 할수도 발생 안 할수도 있는 경우에 작성한다.
//그래서 Exception을 Checked Exception, RuntimeException을 Unchecked Exception 이라고도 한다.
//**Exception을 throw로 던지게 되면 해당 하는 지역에서 벗어나게 된다.
//main문에서 throw를 던지게 되면 main문 자체가 catch 문으로 나가게 되어 exception 에러가 난 이후 처리가 안된다.
class FoolException extends java.lang.Exception {
}

public class Exception {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }

    public static void main(String[] args) {
        Exception sample = new Exception();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}