import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("x와 y를 곱하고 나눕니다.");
    System.out.print("x의 값:");
    int x = stdIn.nextInt();

    System.out.print("y의 값:");
    int y = stdIn.nextInt();

    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);
    System.out.println(x%y);
  }
}
