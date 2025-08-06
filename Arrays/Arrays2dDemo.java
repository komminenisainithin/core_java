package Arrays;

public class Arrays2dDemo {
    public static void main(String[] args) {
        int[][] arr={{1,3,5},{2,4,6}};
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }


        // print a matrix
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("print matrix");
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
