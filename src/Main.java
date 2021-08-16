import java.util.*;
import java.math.*;

class Main{
    public static BigInteger fibo(int n) {
        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            y = y.add(x);
            x = y.subtract(x);
        }
        return x;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
}