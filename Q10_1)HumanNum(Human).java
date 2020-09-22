class Human{

  private static int counter = 0;//카운터는 마지막 번호를 담는다/static은 정적 필드를 의미(변하지 않음, 고정)
  private String name;
  private int height;
  private int weight;
  private int id;

  //생성자
  Human(String name, int height, int weight){

    this.name = name;
    this.height = height;
    this.weight = weight;
    id = ++counter;//전에 더한다
  }

  public int getId() {return id;}

  public void putData() {
    System.out.println("이름 : " + name);
    System.out.println("신장 : " + height + "cm");
    System.out.println("체중 : " + weight + "kg");
  }

}
