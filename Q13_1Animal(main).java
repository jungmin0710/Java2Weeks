class Main {
  public static void main(String[] args) {
    
    //추상클래스는 인스턴스를 생성할 수 없다.
    //Animal x = new Animal();

    Animal[] a = new Animal[2];

    a[0] = new Dog("뭉치", "치와와");//Dog클래스 참조
    a[1] = new Cat("마이클", 7);//Cat클래스 참조

  //방법1
    // for (Animal s : a) {
    //   System.out.print(s.getName()+" ");
    //   s.bark();
    //   System.out.println();
    // }


  //방법2
  for (int i = 0; i < a.length; i++){
    System.out.print(a[i].getName() +" ");
    a[i].bark();
    System.out.println();
  }

  }
}
