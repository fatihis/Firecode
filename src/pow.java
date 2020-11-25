public class pow {
    /*Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!
    Examples:
    pow(2,3) ==> 8.0*/
    //lets try recursion
    public static double pow(double x, int n) {
        if(n <= 0){
            return 1;
        }
        if(n < 0){
            return x;
        }

        x = x*x;
        n = n-1;
        return pow(x,n);
        }
}
