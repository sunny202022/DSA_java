package array;

public class gridPathORuniquepath {
    public static void main(String[] args) {
        System.out.println(uniquePathsPC(3, 2));
    }
    // Recursion TC e^
    // public static int uniquePaths(int m, int n) {
    //     return countPaths(0,0,m,n);
    // }
    // public static int countPaths(int i,int j,int n,int m)
    // {
    //     if(i==(n-1)&&j==(m-1)) return 1;
    //     if(i>=n||j>=m) return 0;
    //     else return countPaths(i+1,j,n,m)+countPaths(i,j+1,n,m);
    // }
    //DP TC N*M
    // public static int DPuniquePaths(int m, int n) {
    //     int a[][] = new int[m][n];
    //     return dest(a,m,n,0,0);
    // }

    // static int dest(int a[][],int m, int n, int i, int j){
    //     if(i>=m || j>=n)
    //         return 0;
    //     if(i==m-1 && j==n-1)
    //         return 1;
    //     if(a[i][j]>0)
    //         return a[i][j];
    //     return a[i][j] = dest(a,m,n,i+1,j) + dest(a,m,n,i,j+1);
    // }
    //Combination 
    public static int uniquePathsPC(int m, int n){
        int N=n+m-2;
        int r=m-1;
        double res=1;
        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }
}