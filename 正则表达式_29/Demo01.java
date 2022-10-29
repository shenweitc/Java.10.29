package 正则表达式_29;
/*
请编写正则表达式验证用户名是否满足要求。
要求:大小写字母，数字，下划线一共4-16位

请编写正则表达式验证身份证号码是否满足要求。
简单要求: 18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
 */
public class Demo01 {
    public static void main(String[] args) {
        String regex1="\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        String regex2="[1-9]\\d{16}(\\d|X|x)";
        System.out.println("340721199812104219".matches(regex2));
    }
}
