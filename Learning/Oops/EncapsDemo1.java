package Learning.Oops;

public class EncapsDemo1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String newname) {
        name = newname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newage) {
        if(newage>0){
            age=newage;
        }
        else
            System.out.println("Age should be positive");
    }

    public static void main(String[] args) {
        EncapsDemo1 stud = new EncapsDemo1();
        stud.setName("Arjun");
        stud.setAge(7);

        System.out.println(stud.getName());
        System.out.println(stud.getAge());
    }
}
