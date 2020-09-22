class Id{

  static int counter = 0;//클래스 종속
  private int id;

  //생성자
  public Id() {
    id = ++counter;//전에 더한다
  }

  public int getId() {return id;}


}
