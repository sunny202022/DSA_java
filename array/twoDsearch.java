package array;

public class twoDsearch {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=10;
        System.out.println(searchMatrix(matrix, target));

    }

public static boolean searchMatrix(int[][] matrix, int target) {
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(target==matrix[i][j]){
                return true;
            }
        }
    }
    return false;
}
}