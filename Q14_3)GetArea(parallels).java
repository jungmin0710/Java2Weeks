public class Parallels extends Shape implements Plane2D{
  private int width;
  private int height;

  public Parallels(int width, int height){
    this.width = width;
    this.height = height;
  }

  public String toString() {
    return "Parallels(width:" + width + ",height: " + height + ")";
  }

  public void draw() {
    for(int i = 1; i <= height; i++) {
      for(int j = 1; j <= height; j++)//평행사변형이기 때문에 height을 한번 더 돌린다
        System.out.print(" ");//공백을 찍은 후에
        for(int k = 1; k <= width; k++)
          System.out.print("#");//# 찍기
        System.out.println("");  
      
    }
  }

  //면적
  public int getArea() {return width * height;}

}
