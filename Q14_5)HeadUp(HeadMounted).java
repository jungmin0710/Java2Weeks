public class HeadMounted implements Wearable, Skinnable {
  
  private int skin;

  public void putOn() {
    System.out.println("디스플레이를 착용했습니다.");
  }

  public void putOff() {
    System.out.println("디스플레이를 벗었습니다.");
  }

  public void changeSkin(int skin) {
    this.skin = skin;
  }

  public void putSkin() {
    switch (skin){
      case BLACK: System.out.println("BLACK DISPLAY"); break;
      case RED: System.out.println("RED DISPLAY"); break;
      case GREEN: System.out.println("GREEN DISPLAY"); break;
      case BLUE: System.out.println("BLUE DISPLAY"); break;
      case YELLOW: System.out.println("YELLOW DISPLAY"); break;
    }
  }

}


//클래스의 파생(상속) 인터페이스 구현과 가장 큰 차이점: 인터페이스는 복수의 구현이 가능하다. 클래스 파생(상속)은 단일 상속만 가능하다. 복수의 친구관계가 성립한다.
