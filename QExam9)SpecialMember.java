
public class SpecialMember extends Member{
   
    private String privilage;
    
    public SpecialMember(String name, int no, int age, String privilage) {
        super(name, no, age);
        this.privilage = privilage;
        // TODO Auto-generated constructor stub
    }
   
    @Override 
    public void print() {
        super.print();
        System.out.println("혜택:"+privilage);
    }
}
