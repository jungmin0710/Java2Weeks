public class Member {
    private String name;
    private int no;
    private int age;

    public Member(String name, int no, int age) {
        this.name = name;
        this.age = age;
        this.no = no;
    }
    
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("No."+no+":"+name+"("+age+"세)");
    }

}
