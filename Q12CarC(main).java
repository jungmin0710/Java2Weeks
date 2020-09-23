class Main {
  public static void main(String[] args) {

    //Q12 - 2    
    // ExCar myCar = new ExCar("W221", 1845,1490,5205,90.0,"2015,12,24");

    // System.out.printf("차의이름: %s\n",myCar.getName());
    // System.out.printf("현재위치: (%.2f,%.2f)\n", myCar.getx(), myCar.gety());
    // System.out.printf("남은연료: (%.2f리터\n",myCar.getFuel());
    // System.out.printf("구 입 일: %s\n", myCar.getPurchaseDay());





    //Q12 - 3
    // ExCar myCar = new ExCar("W221", 1845,1490,5205,90.0,"2015,12,24");
    //  myCar.putSpec();




//파생 클래스에 상속되지 않는 자원: 생성자
//슈퍼 클래스의 생성자는 super.로 호출 가능
//생성자를 하나도 정의하지 않으면 빈 생성자가 컴파일러를 통해 자동으로 정의된다.
// x() {}

//메서드 오버라이딩(덮어쓰기) super(부모클래스명을 의미).멤버명

//상속의 장점 중 하나는 기존 프로그램을 최소한으로 추가 및 수정만 해서 새로운 프로그램을 완성한다는 점이다.(증분 프로그래밍, imcremental programing) 이는 프로그램 개발 시 효율성을 높이고 유지관리 보수를 용이하게 한다. 상속이 큰 효과를 발휘하는 것은 다형성 항목이다.


  // //Q12 - 4
  // Car car1 = new Car("W140", 1885,1490,5220,95.0,"2018,10,13");
  // ExCar car2 = new ExCar("W221", 1845,1490,5205,90.0,"2015,12,24");

  // Car x; //클래스형 변수
  // x = car1; //자기자신의 형 인스턴스를 참조할 수 있다.
  // x = car2; //하위 클래스형의 인스턴스도 참조할 수 있다.
  // System.out.println("x구입일 : " +x.getPurchaseDay());

  // //is - A관계 : ExCar는 Car의 자식으로 Car 가족의 일원이라고 볼 수 있다.
  // //ExCar는 Car의 일종이다.
  // //car1 : 자동차 클래스 Car의 인스턴스
  // //car2 : ExCar형의 인스턴스(총 주행거리가 있는 인스턴스)

  // ExCar y;//클래스형 변수
  // //y = car1;//상위 클래스 형의 인스턴스는 참조할 수 없다!(실행하면 에러가 남)
  // y = car2;//자기자신의 형 인스턴스는 참조할 수 없다.

  // System.out.println("y구입일 : " + y.getPurchaseDay());
  // System.out.println("y의 총 주행 거리 : " + y.getTotalMileage());


  //ExCar형의 변수 y는 슈퍼클래스 Car형의 car1인스턴스를 참조할 수 없다.
  //상위 클래스 형의 변수는 하위 클래스의 인스턴스를 참조할 수 있지만 하위 클래스형의 변수 상위 클래스의 인스턴스를 참조할 수 없다(우회방법이 있긴 있음.)

  //Q12 - 5
  // Car car1 = new ExCar("w221", 1845, 1490, 5205, 90.0, "2015,12,24");

  // car1.putSpec();

  //매서드 putSpec과 move같은 메서드를 하위클래스에서 새롭게 정의하는 것을 오버라이딩이라고 한다.
  //Car형의 클래스형 변수 car1이 ExCar형의 인스턴스를 참조한다. 따라서 변수와 참조 대상의 형이 다르다.
  //참조 대상의 인스턴스가 ExCar형이기 때문에 ExCar형의 putSpec을 호출한다.
  //호출해야 할 메서드가 실행시에 결정되므로 이러한 방식을 동적결합 또는 지연결합(결속)이라고 한다.
  //클래스 형 변수가 파생관계에 있는 다양한 클래스형의 인스턴스를 참조한 것을 다형성이라고 한다.(폴리 다양한 많은 모피즘 형태), 다양성, 다상성...
  //다형성이 있는 메서드 호출은 프로그램 실행시에 호출할 메서드가 결정된다.


  //Annotation (사람과 컴퓨터가 모두 볼 수 있는 주석)


  //Q12 - 6
  Car car1 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

  // car1.move(10,10);
  // System.out.println("총 주행거리 : "+ car1.getTotalMileage()); => 얘는 오류나는게 맞음!
  System.out.println("총 주행거리 : "+ ((ExCar)car1).getTotalMileage());

  //ExCar 클래스의 인스턴스 자동차가 이동한 총 주행거리 getTotalMileage + @
  //상속하지 않고 override
  //메써드 호출 시 ExCar의 move가 호출된다
  //캐스트를 사용해서 ExCar형의 메서드를 호출

  //객체 지향 프로그래밍의 3대요소 
  //1.클래스 2.상속 3.다형성
  }
}
