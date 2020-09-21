import java.util.Scanner;

class Main {

  static void aryExchange(int[] a, int[] b){//양 배열의 요소를 바꾸는 함수
    if (a.length >= b.length){//둘의 길이가 같거나 b가 더 적으면
      int[] c = new int[b.length];//b의 길이만큼 임시배열 c를 만든다
      for (int i = 0; i < b.length; i++){//a와 b를 c를 이용해 교환한다
          c[i] = a[i];
          a[i] = b[i];
          b[i] = c[i];
      }
    }
    else {//a의 길이가 더 작으면
      int[] c = new int[a.length];//a의 길이만큼 임시배열 c를 만든다
      for (int i = 0; i < a.length; i++){//a와 b를 c를 이용하여 교환한다
          c[i] = a[i];
          a[i] = b[i];
          b[i] = c[i];
      }
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("배열 a의 요소 수:");
    int n = stdIn.nextInt();

    int []a = new int [n];
    for (int i = 0; i < n; i++) {
      System.out.print("a[" + i + "]:");
      a[i] = stdIn.nextInt();
    }

    System.out.print("배열 b의 요소 수:");
    int m = stdIn.nextInt();

    int []b = new int [m];
    for (int i = 0; i < m; i++) {
      System.out.print("b[" + i + "]:");
      b[i] = stdIn.nextInt();
    }

    aryExchange(a, b);
    System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
    for (int i = 0; i < n; i++)
      System.out.println("a[" + i + "] = " + a[i]);
    for (int i = 0; i < m; i++)
      System.out.println("b[" + i + "] = " + b[i]);
  }
}
