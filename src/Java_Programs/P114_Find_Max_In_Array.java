package Java_Programs;

public class P114_Find_Max_In_Array {
    public static void main(String[] args) {
        //do without shorting
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int max = matrix[0][0];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Max is: "+max);
    }
}
