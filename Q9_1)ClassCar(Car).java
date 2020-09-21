class Car {

private String name;
private String number;
private int width;
private int height;
private int length;

private double x; //현재 위치 x
private double y; //현재 위치 y
private double tankage; //탱크 용량
private double fuel;  // 남은 연료
private double sfc; //연비

// 생성자 //

Car(String name, 
    String number, 
    int width, 
    int height,
    int length, 
    double x, 
    double y, 
    double tankage,
    double fuel, 
    double sfc) {
    this.name = name; 
    this.number = number;
    this.width = width;
    this.height = height;
    this.length = length;
    this.x = x; //현재 위치 x 좌표
    this.y = y; // 현재 위치 y 좌표
    this.tankage = tankage;
    this.fuel = (fuel <= tankage) ? fuel : tankage;
    this.sfc = sfc;
    x = y = 0.0;
    }

double getX() { return x;}
double getY() { return y;}
double getFuel() { return fuel;}
}


