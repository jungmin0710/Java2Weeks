import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("좌표 p를 입력하세요:");
    System.out.print("x좌표 : "); double x = stdIn.nextDouble();
    System.out.print("y좌표 : "); double y = stdIn.nextDouble();

    Coordinate p = new Coordinate(x,y);
    System.out.println("p = (" + p.getx() + ", " + p.gety() + ")");

    Coordinate q = p;
    q.set(9.9,9.9);

    System.out.println("p = (" + p.getx() + ", " + p.gety() + ")");
    System.out.println("q = (" + p.getx() + ", " + q.gety() + ")");



  }
}
