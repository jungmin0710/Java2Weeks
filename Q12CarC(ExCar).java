class ExCar extends Car{
//car class : 부모, 상위, 기본, 슈퍼
//ExCar class: 자식, 하위, 파생, 서브

  private double totalMileage;

  //생성자
  public ExCar(String name, int width, int height, int length, double fuel, String purchaseDay) {
    super(name, width, height, length, fuel, purchaseDay);
    totalMileage = 0.0;
  }

  public double getTotalMileage() {
    return totalMileage;
  }

  public void putSpec() {
    super.putSpec();//상위 클래스의 기능을 가져온다 + 아래 기능을 더 붙인다 
    //오버라이드표시는 새롭게 만드는 것이 아니라는 것을 컴퓨터도 인식하게 한다.
    System.out.printf("총 주행거리 : %.2fkm\n", totalMileage);
  }

    public boolean move(double dx, double dy) {
      double dist = Math.sqrt(dx * dx + dy * dy);
      if (!super.move(dx,dy)) return false;
      else {
        totalMileage += dist;
        return true;
      }
    //자바에서는 여러 클래스로부터 다중 상속은 지원하지 않는다
    //서브 클래스는 슈퍼 클래스를 알고 있지만, 슈퍼 클래스는 서브 클래스를 모른다.
  }


}
