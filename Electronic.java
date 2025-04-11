public class Electronic {
    String status;
    String type;
    float cost;
    void onoroff(boolean val){
        if(val==true) {
            System.out.println("I am is ON now");
        }
        else{
            System.out.println("I am is OFF now");
        }
    };
    void type(){
        System.out.println("I am TV");
    }
    void cost(){
        System.out.println("25000");
    }

    public static void main(String[] args) {
        Electronic fan= new Electronic();
        Electronic computer= new Electronic();
        Electronic tv= new Electronic();

        fan.onoroff(false);
        fan.type();
        fan.cost();
    }
}
