public class FlipVerticalAxis {
    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,1}};

    }
    public static int[][] flipItVerticalAxis(int[][] matrix) {
        int[][] arr;
        int temp;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix.length - 1 - j] = temp;
            }


        }
    return  matrix;
    }
}
