package com.ryan.shorturl.utils;

/**
 * @author zhangjianbing
 * time 2019/9/17
 */
public class ConvertUtil {

    private static final String BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * 十进制转六十二进制
     *
     * @param num 十进制数字
     * @return 字符串
     */
    public static String toBase62(long num) {
        StringBuilder sb = new StringBuilder();
        int targetBase = BASE.length();
        do {
            int i = (int) (num % targetBase);
            sb.append(BASE.charAt(i));
            num /= targetBase;
        } while (num > 0);
        return sb.reverse().toString();
    }

    /**
     * 六十二进制转十进制
     *
     * @param input 六十二进制字符串
     * @return 数字
     */
    public static long toBase10(String input) {
        int srcBase = BASE.length();
        long id = 0;
        String r = new StringBuilder(input).reverse().toString();

        for (int i = 0; i < r.length(); i++) {
            int charIndex = BASE.indexOf(r.charAt(i));
            id += charIndex * (long) Math.pow(srcBase, i);
        }
        return id;
    }

    public static void main(String[] args) {
        String s = ConvertUtil.toBase62(2);
        System.out.println(s);
    }

}
