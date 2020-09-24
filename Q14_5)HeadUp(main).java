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

//
