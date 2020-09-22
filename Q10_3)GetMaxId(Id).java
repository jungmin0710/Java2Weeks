class Id{

  private static int counter = 0;//직접접근ㄴ 우회적으로 접근
  private int id;

  public Id() {
    id = ++counter;
  }

  public int getId() {
    return id;
  }

  public static int getMaxId() {//특정 인스턴스에 소속되지 않는다.(이때문에 a의 id는 1이지만 getmaxid는 2가 나온다))
    return counter;//메서드를 통해 외부로 가지고 나간다
  }
}
//인스턴스 메서드는 개별 인스턴스에 소속된다
//자원 소속된 인스턴스의 변수, 메서드와 모두가 공유하는 변수, 메서드 양쪽에 접근 할 수 있다.

//클래스 메서드는 인스턴스에 속하지 않기 때문에 자신이 소속된 인스턴스의 변수, 메서드를 가지지 않는다. 따라서 모두가 공유하는 변수, 메서드만 접근할 수 있다.

//예를 들어, 클래스 메서드 getMaxId안에서는 인스턴스 변수 id에 접근할 수 없다. 어떤 인스턴스의 id에 접근해야 할 지를 결정할 수 없기 때문이다. 예외)) 자신이 속한 클래스형의 인스턴스 참조를 매개변수 r로 받아 r.id형식으로 인스턴스 변수에 접근 할 수는 있다.
