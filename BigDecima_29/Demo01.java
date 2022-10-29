package BigDecima_29;

import java.math.BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        //传递字符串表示小数
        BigDecimal b1=new BigDecimal("0.01");
        BigDecimal b2=new BigDecimal("0.09");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
        System.out.println(0.01+0.09);
        //静态方法调用
        BigDecimal b4 = BigDecimal.valueOf(10);
        System.out.println(b4);


    }
}
