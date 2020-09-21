class Coordinate{
  private double x = 0.0;
  private double y = 0.0;

  //생성자 public선언해주면 접근성 변경됨
  //public이 없을 때: 해당 클래스는 동일 패키지 내에서만 사용
  //public이 있을 때: 해당 클래스는 어디에서든 사용가능
  //대부분의 경우 public을 사용
  
  public Coordinate(){ }
  
  public Coordinate(double x, double y) {set(x,y);}
  
  public Coordinate(Coordinate c) {
    this(c.x, c.y)
  }

  public double getx() {return x;}
  public double gety() {return y;}

  public void setx(double x) {return x;}
  public void sety(double y) {return y;}

  // private double x;
  // private double y;
  
  // //생성자(클래스 이름과 꼭 똑같이 할것)

  // Coordinate(double x, double y){
  //   this.x = x;
  //   this.y = y;
  // }

  // double getx() {return x;}
  // double gety() {return y;}

  // void setx(double x) {this.x = x;}
  // void sety(double y) {this.y = y;}

  // void set(double x, double y) {this.x = x; this.y = y;} ==>> p와 q가 함께 바뀌는 문제가 발생

}
