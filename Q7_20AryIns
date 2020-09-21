import java.util.Scanner;

class Main {

  static void aryIns(int[] a, int idx, int x){//특정 인덱스에 특정값을 삽입하는 함수(맨 뒤의 요소는 밀려나서 삭제)
    if (idx >= 0 && idx <a.length){//다음 조건을 만족하는 경우: 인덱스가 0이상이고, 인덱스가 배열 길이보다 작아야함
      for (int i = a.length-1; i > idx; i--)//마지막 인덱스 번호부터 특정 인덱스까지 1씩 빼며 반복한다
        a[i] = a[i-1]; //특정 인덱스부터 전체의 -1인덱스까지의 범위를 특정 인덱스 다음부터 마지막 인덱스까지로 옮긴다
      a[idx] = x;// 특정 인덱스에 값을 삽입
    }
  }
  
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("요소 수:");
    int n = stdIn.nextInt();
    int []a = new int [n];
    
    for (int i = 0; i < n ; i++) {
      System.out.print("a[" + i + "]:");
      a[i] = stdIn.nextInt();
    }

    System.out.print("삽입할 요소의 인덱스:");
    int startN = stdIn.nextInt();
    System.out.print("삽입할 값:");
    int num = stdIn.nextInt();

    aryIns(a, startN, num);

    for (int i = 0; i < n ; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
