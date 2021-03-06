public class Day{
  private int year = 1;
  private int month = 1;
  private int date = 1;

  //생성자

  public Day() {} //기본으로 생성자를 한개 만들자
  public Day(int year) {this.year = year;} //들어오는 형태에 따라 여러개의 생성자를 만든다
  public Day(int year, int month) {this(year); this.month = month;}
  public Day(int year, int month, int date) {this(year,month); this.date = date;}
  public Day(Day d) {this(d.year, d.month, d.date);}

  public int getYear() {return year;}
  public int getMonth() {return month;}
  public int getDate() {return date;}

  public void setYear(int year) {this.year = year;}
  public void setMonth(int month) {this.month = month;}
  public void setdate(int date) {this.date = date;}

  public void set(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }
}
