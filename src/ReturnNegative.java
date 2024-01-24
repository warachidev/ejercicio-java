import static java.lang.Math.abs;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        return (-1) * Math.abs(x); // Your code here.
        //return -abs(x);
    }

    public static void main(String[] args) {
        System.out.println(makeNegative(42));
    }
}
