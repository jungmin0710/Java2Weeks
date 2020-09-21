import java.util.Scanner;

class Main{
  //n의 부호를 판정하는 함수//
  static int signOf(int n){
    int sign = 0;

    if (n > 0)
      sign = 1;
    else if (n < 0)
      sign = -1;

    return sign;
  }

  //동작 구현(몸체)
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("정수 x:");
    int x = stdIn.nextInt();

    int s = signOf(x);

    System.out.println("signOf(x)는" + s +"입니다.");
  }
}
