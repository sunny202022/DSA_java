package array;


public class removeMAxstone {
    public static void main(String[] args) {
        int[][] arr={{0,0},{0,2},{1,1},{2,0},{2,2}};
        System.out.println(removeStones(arr));
    }
    public static int removeStones(int[][] stones) {
        int count=0;
        int[] val=new int[2];
        int n=stones.length-1;
        for(int i=stones.length-1;i>0;i--){
             for(int j=stones[0].length-1;j>=0;j--){
                val[j]=stones[i][j];
            }
            
            for(int k=n;k>0;k--){
                if(val[0]==stones[k-1][0]||val[1]==stones[k-1][0]||val[0]==stones[k-1][1]||val[1]==stones[k-1][1]){
                    count++;
                    n--;
                    break;
                }
            }
            
        }
        return count;
    }
}
