class Cat extends Animal{
  private int age; //나이
  
  public Cat(String name, int age) {
    super(name); this.age = age;
  }

  public void bark() {System.out.println("냥냥!");}

  public String toString() {
    return age + "살인 " + getName();
  }
}
