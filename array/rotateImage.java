package array;

public class rotateImage {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        int m=3;
        int[][] arr=new int[n][m];

        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][m-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}