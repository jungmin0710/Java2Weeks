  public class Main {
    public static void main(String[] args) {
      Member[] m = {
        new Member("길동", 101, 27),
        new SpecialMember("철수", 102, 31, "회비 무료"),
        new SpecialMember("영희", 103, 52, "회비 반값 할인"),
      };
      //배열 m의 모든 요소에 대해 메서드 print를 호출한다

      for (Member k:m) {
        k.print();
        System.out.println();
      }
    }
  }
