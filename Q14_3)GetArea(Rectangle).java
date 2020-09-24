public class Rectangle extends Shape implements Plane2D {
//Shape를 상속받고(가져다 쓰고) Plane2D로 인터페이스(확인)도 사용가능

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public String toString() {
    return "Rectangle(width:" + width + ". height:" + height + ")";
  }

//별그리기
  public void draw() {
    for (int i = 0; i <= height ; i++){
      for (int j = 0; j <= width; j++)
        System.out.print("*");
        System.out.println();
    }
  }
//면적구하기
  public int getArea() {return width * height;}


}
