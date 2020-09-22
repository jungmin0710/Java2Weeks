import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("x값 : "); int x = stdIn.nextInt(); 
    System.out.print("y값 : "); int y = stdIn.nextInt();
    System.out.print("z값 : "); int z = stdIn.nextInt();
    System.out.print("배열 a의 요소수 : ");
    int n = stdIn.nextInt();
    int [] a = new int [n];
    for (int i = 0; i < n ; i++){
      System.out.print("a[" + i + "]:");
      a[i] = stdIn.nextInt();
    }

    System.out.println("x,y 의 최솟값은 " + MinMax.min(x,y) + "입니다.");
    System.out.println("x,y 의 최댓값은 " + MinMax.max(x,y) + "입니다.");
    System.out.println("x,y,z 의 최솟값은 " + MinMax.min(x,y,z) + "입니다.");
    System.out.println("x,y,z 의 최댓값은 " + MinMax.max(x,y,z) + "입니다.");
    System.out.println("배열 a의 최솟값은 " + MinMax.min(a) + "입니다.");

    int xmin[] = MinMax.minIndexArray(a);
    System.out.print("인덱스는( ");
    for (int i = 0; i < xmin.length; i++)
      System.out.print(xmin[i] + " ");
      System.out.println(")입니다.");

    System.out.println("배열 a의 최댓값은 " + MinMax.max(a) + "입니다.");

    int ymin[] = MinMax.maxIndexArray(a);
    System.out.print("인덱스는( ");
    for (int i = 0; i < ymin.length; i++)
      System.out.print(ymin[i] + " ");
      System.out.println(")입니다.");

  }
}
