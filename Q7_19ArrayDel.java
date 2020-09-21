import java.util.Scanner;

class Main {

  //idx부터 idx+n-1까지의 부분만 바꾼다! 바꿀 배열의 뒷부분만큼을 앞으로 집어넣을것인데 범위를 초과하면 해당 값이 없으므로 바꾸지 않는다.
  static void aryRmvN(int[] a, int idx, int n){//배열 a에서 idx부터 n개만큼만 바꿀것이다.
    if (n > 0 && idx >=0 && idx + n < a.length) {//다음 조건을 다 만족하면: 바꿀개수가 0이상, 첫인덱스가 0이상, 바꿀부분의 갯수가 배열a개수보다 작을것 
      int idx2 = idx + n -1;// idx2는 배열에서 바꿀 부분의 마지막 인덱스번호
      if (idx2 > a.length -n-1)//만약 마지막 인덱스가 바꿀 범위를 초과하면(이 경우 배열의 갯수보다 인덱스넘버가 커지게 됨)
        idx2 = a.length -n -1;//바꿀 범위의 마지막으로 인덱스번호를 고정한다(범위를 초과하므로 바꾸지 않는다)
      for (int i = idx; i <= idx2; i++)//바꾸는 작업 시행
        a[i] = a[i + n];
    }
  }

  /*
  idx = 1, n = 3 // a = [ 1, 3, 4, 7, 9, 11]
  여기서 바꿀 범위는 a[1]~a[3]까지다.
  idx2 = 3(1+3-1) => 즉 a[3]이 마지막 인덱스 번호가 된다
  제일 아래 for문을 시행하면
  a[1] = a[1+3] = a[4] = 9
  a[2] = a[2+3] = a[5] = 11
  a[3] = a[3+3] = a[3] = 7 ==>>a[6]이 없으므로 바꿀 배열의 제일 마지막 숫자인 7이 오게된다.
  따라서 바뀐 배열은 a = [1, 9, 11, 7, 9, 11]이 된다.
  */

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("요소 수:");
    int n = stdIn.nextInt();
    int []a = new int[n];

    for (int i=0 ; i < n; i++){
      System.out.print("a[" + i + "]:");
      a[i] = stdIn.nextInt();
    }

    System.out.print("삭제를 시작할 인덱스:");
    int startN = stdIn.nextInt();
    System.out.print("삭제할 요소의 수:");
    int num = stdIn.nextInt();

    aryRmvN(a, startN, num);
    for (int i = 0; i < n ; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
