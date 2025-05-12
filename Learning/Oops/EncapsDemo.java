package Learning.Oops;

public class EncapsDemo {
    //Create a instance variable in Encapsulation form( Restricted Access)
    private String name;
    private int age;
    private String location;

    //Getter method in Encapsulation
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLocation(){
        return location;
    }
    //Setter method in Encapsulation
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        EncapsDemo person = new EncapsDemo();
        person.setName("Siddhu");
        System.out.println(person.getName());

    }
}
