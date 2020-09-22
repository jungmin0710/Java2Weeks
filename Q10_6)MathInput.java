import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("실수값:");
    double n = stdIn.nextDouble();
    System.out.println("절댓값:"+Math.abs(n));
    System.out.println("제곱근:"+Math.sqrt(n));
    System.out.println("면  적:"+Math.pow(n,2)*Math.PI);
  }
}

//비슷한 기능의 메서드 상수를 모아놓은 유틸리티 클래스
//Math 클래스:수치 계산 관련 메서들의 묶음 
