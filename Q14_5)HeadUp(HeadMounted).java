class Main {
  public static void main(String[] args) {

    HeadMounted hmd = new HeadMounted();
    hmd.putOn();
    hmd.putOff();
    hmd.changeSkin(Skinnable.YELLOW);
    hmd.putSkin();

    Wearable w = hmd;
    w.putOn();
    w.putOff();

    Skinnable s = hmd;
    s.changeSkin(Skinnable.BLACK);

    hmd.putSkin();


    
  }
}
//간략하게 정리(연결고리로 이어진 느낌인듯)
//인터페이스: 꼭 만들어야 하는 메서드의 틀만 잡아줌(상수 정의 가능, 메서드 자체는 정의 안됨)
//클래스에서 인터페이스에서 잡혀진 메서드의 틀로 실제 메서드를 만들어야함(꼭)
//메인에서 클래스의 메서드를 끌어와서 실행시킴

//클래스형 인스턴스
//HeadMounted 클래스 형의 변수 hmd, Wearable형의 변수 w, Skinnable형의 변수 s는 모두 생성된 동일 인스턴스를 참조한다. 변수 hmd, w,s의 형이 각각 다르기 때문에 해당 형에서 호출 가능한 메서드만 호출한다.
