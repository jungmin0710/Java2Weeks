class Main {
  public static void main(String[] args) {

    SkinnableSoftware x = new SkinnableSoftware();
    SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);

    x.changeSkin(Skinnable.YELLOW);

    System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
    System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");
  }
}
//인터페이스 추가
//이름 부여 방법은 클래스와 같다. 관용적으로 뒤에 ...able을 사용한다.
//접근성도 클래스와 같다. public의 특성이 기본, public 없이 선언하면 패키지 접근성을 가지게 된다.
