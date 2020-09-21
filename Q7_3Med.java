import java.util.Scanner;

class Main {

  static int med(int a,int b,int c) {

    int result = a;
    if (c <= b && b <= result || result <= b && b <= c) result = b;
    else if (b <= c && c <= result || result <= c && c<= b) result = c;

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

    System.out.println("중간값은 " + med(a,b,c) + "입니다.");

  }
}
