package BigInteger_29;

import java.math.BigInteger;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        //获取一个随机的大整数
        Random r=new Random();
        BigInteger b1=new BigInteger(4,r);
        System.out.println(b1);//[0,15]

        //获取指定的大整数
        BigInteger b2=new BigInteger("999999999999");
        System.out.println(b2);

        //静态方法获取BigInteger的对象
        BigInteger b3=BigInteger.valueOf(100);
        System.out.println(b3);

        System.out.println("============");

        BigInteger bb1=BigInteger.valueOf(10);
        BigInteger bb2=BigInteger.valueOf(5);
        //加法
        System.out.println(bb1.add(bb2));
        //减法
        System.out.println(bb1.subtract(bb2));
        //乘法
        System.out.println(bb1.multiply(bb2));
        //除法
        System.out.println(bb1.divide(bb2));
        BigInteger[] arr = bb1.divideAndRemainder(bb2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
