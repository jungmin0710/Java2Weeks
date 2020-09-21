import java.util.Random;
import java.util.Scanner;

class Main {

  static boolean retry(){
    Scanner stdIn = new Scanner(System.in);

    int c;
    do {
      System.out.print("다시 한번?<Yes...1/No...0>:");
      c = stdIn.nextInt();
    } while (c != 0 && c != 1);
    return c == 1;
  }


  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);
    System.out.println("암산 훈련!!");
    
    do{
      int x = 100 + rand.nextInt(900);
      int y = 100 + rand.nextInt(900);
      int z = 100 + rand.nextInt(900);

      int p = rand.nextInt(4);
      int answer = 0;
 
      switch(p) {
        case 0 : answer = (x + y + z); break;
        case 1 : answer = (x + y - z); break;
        case 2 : answer = (x - y + z); break;
        case 3 : answer = (x - y - z); break;
      }
      
      while (true) {
        System.out.print(x + ((p < 2)? " + " : " - ") + y + ((p % 2 == 0)? " + ": " - ") + z + " = " );
        
        int k = stdIn.nextInt();
        
        if (k == answer)
          break;
        System.out.println("틀렸습니다!");
      }
    } while (retry());


  }
}
