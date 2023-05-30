package dataType;

import java.math.BigDecimal;

public class DataType01 {
    double bigDecimal = 20000000000000000000000.00000000000000000000;
    public static void main(String[] args){
        long B = 2147483648L;
        byte A = (byte)B;
        byte C = (byte) 300;
        int D = (int)C;

        System.out.println(A);
        System.out.println(D);
        System.out.println();
    }
}
