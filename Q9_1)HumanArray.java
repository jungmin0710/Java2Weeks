class Human{
  private String name;//private을 걸어주면 클래스 외부의 접근이 제한되고 (비공개) 안에서만 접근할 수 있게 권한을 부여해준다.(따라서 생성자를 통해서 접근함. 직접접근X) 
  private int height;
  private int weight;

  //생성자(constructor)란? 
  //1.이름이 클래스와 같다.
  //2.반환형이 없다(메서드와 가장 큰 차이)
   

  Human(String n, int h, int w) {//Human이라는 객체를 찍어낼것이다(인수 3개를 받는다)
    name = n; //Human의 name은 n이 된다
    height = h; //Human의 height은 h가 된다
    weight = w;//Human의 weight는 w가된다
  }

  String getName() //이름 속성 부여
    {return name;}
  int getHeight() //신장 속성 부여
    {return height;}
  int getWeight() //무게 속성 부여
    {return weight;}

  void gainweight(int w) {weight += w;}//몸무게 증가
  void reduceweight(int w) {weight -= w;}//몸무게 감소

}
