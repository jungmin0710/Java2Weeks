import java.util.Scanner;

//값이 범위 밖에 있는 (0~9가 아닌)것을 나타내는 예외
class RangeError extends RuntimeException {
  RangeError(int n) {super("범위 밖 값:" + n);}
}

//메서드의 매개변수가 범위 밖에 있는 것을 나타내는 예외
class ParameterRangeError extends RangeError {
  ParameterRangeError(int n) {super(n);}
}

//연산 결과가 범위 밖인 것을 나타내는 예외
class ResultRangeError extends RangeError {
  ResultRangeError(int n) {super(n);}
}

class Main {

  static boolean isValid(int n) {
    return n >= 0 && n <= 9;
  }

//인수나 결과가 한자리가 아닌 경우 ParameterRangeError, ResultRangeError 예외를 던진다.
  static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
    if (!isValid(a)) throw new ParameterRangeError(a);
    if (!isValid(b)) throw new ParameterRangeError(b);
    int result = a+b;
    if (!isValid(result)) throw new ResultRangeError(result);
    return result;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("정수 a:"); int a = stdIn.nextInt();
    System.out.print("정수 b:"); int b = stdIn.nextInt();

    try{
      System.out.println("합은 " + add(a,b) +"입니다.");
    } catch (RangeError e) {
      System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
    }
  }
}
