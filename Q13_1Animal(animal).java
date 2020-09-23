abstract class Animal{

  private String name;
  public Animal(String name) { this.name=name;}
  public abstract void bark();
  public String getName() {return name;}

//추상 클래스는 설계도 공통적인 개념
//인스턴스를 생성할 수 없거나 생성해서는 안된다
//메서드의 내용을 정의 할 수 없다. 내용은 서브클래스 구현

//추상 메서드 : 이 클래스에서는 메서드 자체를 정의할 수 없으니 나로부터 파생된 클래스에서 정의해주세요.(선언만 하고 실제 메서드는 파생된 곳에서.)
//추상 메서드는 {}대신에 ;선언
//추상 메서드를 1개라도 가지는 클래스는 반드시 추상클래스로 선언해야한다.


}
