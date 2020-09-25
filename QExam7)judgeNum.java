import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("a : "); int a = stdIn.nextInt();
    System.out.print("b : "); int b = stdIn.nextInt();

  if (a > 0 && b > 0){
    if (a % 2 == 1 && b % 2 == 1) 
      System.out.println("양쪽 모두 홀수입니다.");
    else if (a % 2 == 1 || b % 2 == 1)
      System.out.println("한쪽만 홀수입니다.");
    else System.out.println("양쪽 모두 짝수입니다.");
    }
  else System.out.println("0이나 음수를 입력했습니다.");
  }
}

/*
    Scanner stdIn = new Scanner(System.in);
    System.out.print("a : "); int a = stdIn.nextInt();
    System.out.print("b : "); int b = stdIn.nextInt();
    int c = 0;

  if (a % 2 == 0) c = c + 1;
  if (b % 2 == 0) c = c + 1; //둘다 짝수면 2, 하나만 짝수면 1, 둘다 홀수면 0

  if (c == 0) System.out.println("양쪽 모두 홀수입니다.");
  else if (a == 1) System.out.println("한쪽만 홀수입니다.");
  else if (a == 2)System.out.println("양쪽 모두 짝수입니다.");
  


*/
