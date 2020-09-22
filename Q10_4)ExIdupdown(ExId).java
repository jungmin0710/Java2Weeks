class ExId{

  static int counter = 0;
  private static int step = 1;
  private int id;

  //생성자

  public ExId() {//인스턴스
    id = counter += step;
  }

  public int getId(){
    return id;
  }

  public static int getStep() {//현재의 스텝 값을 알려줌
    return step;
  }

  public static int setStep(int s) {//스텝 값의 변화를 주는 메서드
    step = (s >= 1)? s : 1;
    return step;
  }

  public static int getMaxId() {//최후의 id값
    return counter;
  }


}
