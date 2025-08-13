package Static_and_nonStatic;

public class staticBlock_and_instanceBlock {
    // Constructor
    public staticBlock_and_instanceBlock(){
        System.out.println("constructor is runing");
    }
    // instance block
    {
        System.out.println("instance block running");
    }
    //static block
    static{
        System.out.println("static block running");
    }

    public static void main(String[] args) {
        System.out.println("main block running");
        staticBlock_and_instanceBlock blocks =new staticBlock_and_instanceBlock();
        System.out.println("main block running");
    }

}
