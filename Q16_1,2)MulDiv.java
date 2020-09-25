import java.util.Scanner;
import java.util.InputMismatchException;
//예외처리시 해줘야함

class Main {
  static int mul(int x, int y) {
    return x * y;
  }

  static int div(int x, int y) {
    return x / y;
  }

  static void muldiv(int x, int y) {
    System.out.println("x * y = " + mul(x,y));
    System.out.println("x / y = " + div(x,y));
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    try {
      System.out.print("x값:"); int x = stdIn.nextInt();
      System.out.print("y값:"); int y = stdIn.nextInt();

      muldiv(x,y);
    } catch (InputMismatchException e) {
        System.out.println("입력 오류 발생." + e);
        e.printStackTrace();
    } catch (ArithmeticException e) {
        System.out.println("산술 오류 발생." + e);
        e.printStackTrace();
    } finally{
      System.out.println("프로그램을 종료합니다.");
    }

      
  }
}


//예외 핸들러 InputMismatchException, ArithmeticException
//printStackTrace() 예외가 메서드를 거치면서 전파되는 과정을 추적 
//예외나 오류의 발생을 발견하기는 쉬운데 그 예외나 오류에 대해 어떻게 대처할지 결정하는 것은 아주 어렵거나 불가능하기도 하다. 그 이유는 예외나 오류에 대한 대처방법은 개발자가 아닌 이용자에 의해 정해지는 경우가 많기 때문이다. 개발자가 상황에 따른 대처방법들을 미리 결정할 수 있다면 소프트웨어가 더욱 유연해진다.
