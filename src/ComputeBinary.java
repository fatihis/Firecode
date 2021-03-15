public class ComputeBinary {
    public static String computeBinary(int val) {
        if(val == 0) { return "0";}
        if(val == 1) { return "1";}
        return computeBinary(val/2)+ String.valueOf(val%2);
    }

    public static void main(String[] args) {
        System.out.println(computeBinary(10));

    }
}
