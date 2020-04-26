public class Class1 {

    private int number;
    private String name;

    public Class1(int input_1, String input_2){
        this.number = input_1;
        this.name   = input_2;
    }

    public int get_number(){
        return this.number;
    }

    public void set_number(int input){
        this.number = input;
    }

    public String get_name(){
        return this.name;
    }

    public void set_name(String input){
        this.name = input;
    }
}
