import java.util.Scanner;

class Main {//클래스 안에 메서드가 있어야함
  static void printseason(int m){//과정적인 기술 차원에서 메서드를 위쪽에 배치하는것이 이해에 좋다. void는 return해서 나가는 함수가 아닐때 사용
    switch (m) {//1부터 시작할 필요는 없다.
      case 3: case 4: case 5: System.out.print("봄"); break;
      case 6: case 7: case 8: System.out.print("여름"); break;
      case 9: case 10: case 11: System.out.print("가을"); break;
      case 12: case 1: case 2: System.out.print("겨울"); break;
    }
  }


  public static void main(String[] args) {//출력단계
    Scanner stdId = new Scanner(System.in);
    System.out.print("몇월입니까(1~12):");
    int n = stdId.nextInt();
    System.out.print("해당 월의 계절은 ");
    printseason(n);
    System.out.print("입니다.");
  }
}

/*return을 사용하는 printseason메서드를 만들면?
class main{
  static String printSeason(int m){
    switch(m){
      case 3: case 4: case 5: return "봄";
      case 6: case 7: case 8: return "여름";
      case 9: case 10: case 11: return "가을";
      case 12: case 1: case 2: return "겨울";
    }
  }

  public static void main(String[] args) {//출력단계
    Scanner stdId = new Scanner(System.in);
    System.out.print("몇월입니까(1~12):");
    int n = stdId.nextInt();
    System.out.print("해당 월의 계절은 " + printSeason(n) + "입니다.");
    
  }
}
*/
