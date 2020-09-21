import java.util.Scanner;

class Main {

  static int min(int a,int b,int c) {

    int result = a;
    if (b < result) result = b;
    else if (c < result) result = c;

    return result;
  }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("정수 a:");
    int a = stdIn.nextInt();
    System.out.print("정수 b:");
    int b = stdIn.nextInt();
    System.out.print("정수 c:");
    int c = stdIn.nextInt();

    System.out.println("최솟값은 " + min(a,b,c) + "입니다.");

  }
}
