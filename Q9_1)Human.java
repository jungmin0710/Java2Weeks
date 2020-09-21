class Human{
  private String name;//private을 걸어주면 클래스 외부의 접근이 제한되고 (비공개) 안에서만 접근할 수 있게 권한을 부여해준다.(따라서 생성자를 통해서 접근함. 직접접근X) 
  private int height;
  private int weight;
 
  //생성자(constructor)란? 
  //1.이름이 클래스와 같다.
  //2.반환형이 없다(메서드와 가장 큰 차이)
   

  public Human(String name, int height, int weight) {
    this.name = name; 
    this.height = height;
    this.weight = weight;
   
  }

  public String getName() 
    {return name;}
  public int getHeight() 
    {return height;}
  public int getWeight() 
    {return weight;}
  
  void gainweight(int w) {weight += w;}//몸무게 증가
  void reduceweight(int w) {weight -= w;}//몸무게 감소

  public String toString() {
    return "{" + name + ":" +height + "cm " + weight + "kg}"; 
  }

}
