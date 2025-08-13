package Strings;

public class StringImmutability {
    public static void main(String[] args) {
        String object = "hello";
        System.out.println(object.concat(" good morning"));
        System.out.println(object); // orignal string never changed/ modified
        System.out.println(System.identityHashCode(object));
        object = object.concat(" good morning"); // new string object is created
        System.out.println(object);
         System.out.println(System.identityHashCode(object));


         // string vs string buffer vs string Builder
        long startTime = System.currentTimeMillis();
        String str = "java";
        for(int i = 0; i<10000; i++){
            str = str + " programming";
        }
        long stopTime =System.currentTimeMillis();

        System.out.println("Time taken using Strings : "+ (stopTime-startTime));


        //StringBuilder

        long startBuildeTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder("java");

        for(int i =0; i<10000; i++){
            sbd.append(" Programming");

        }
        long stopBuilderTime = System.currentTimeMillis();
        System.out.println("Time taken using Builder String : "+ (stopBuilderTime-startBuildeTime));


         //StringBuffer
         
        long startBufferTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Java");

        for(int i = 0 ; i<10000 ; i++){
            sbf.append(" Programming");
        }
        long stopBufferTime = System.currentTimeMillis();

        System.out.println("Time taken using Buffer string : "+(stopBufferTime-startBufferTime));
        
    }

   
    

}
