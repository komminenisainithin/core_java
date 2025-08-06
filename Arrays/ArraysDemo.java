package Arrays;

import java.util.Scanner;

public class ArraysDemo {
    static int[] numbers;
    int[] arr = {1,2,3,4,5};

    
    public static void main(String[] args) {
        ArraysDemo arrs=new ArraysDemo();
        numbers=new int[4];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
    
    
        System.out.println(numbers[3]);
        System.out.println(arrs.arr[4]);

    

        int[] arr = new int[5];
        
        arr[0]=10;
        arr[1]=20;
        arr[3]=40;
        arr[4]=50;
        for(int i=0 ; i<arr.length;i++ ){
            System.out.println(arr[i]);
        }

        int[] numbers ={1,2,4,5,6,7,9};
        int l=numbers.length;
        int sum =0;
        double avg=0.0;
        for(int i=0; i<l;i++){
            sum+=numbers[i];
            

        }
        avg =(double) sum/l;
        System.out.println("sum of array elements"+sum);
        System.out.println("avrage of array elements is "+ avg);

        String[] names = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<names.length;i++){
            System.out.println("enter a name:");
            names[i]=sc.nextLine();
        }

        for(String x: names){
            System.out.println(x);
        }
        sc.close();

    }

    
    

}
