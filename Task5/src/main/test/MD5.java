import com.jnshu.Tool.Md5Util;
import com.jnshu.Tool.StrConvertUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class MD5 {
    /**
     * 根据输入的字符串生成固定的32位MD5码
     * 获取十六进制字符串形式的MD5摘要
     * @param str
     * 输入的字符串
     * @return MD5码
     */
    public final static String getMd5(String str) {
        //MessageDigest 类为应用程序提供信息摘要算法的功能
        MessageDigest mdInst = null;
        try {
            //返回实现指定摘要算法的 MessageDigest 对象。public static MessageDigest getInstance(String algorithm)
            //algorithm 所请求算法的名称
            mdInst = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        mdInst.update(str.getBytes());//  使用指定的 byte 数组更新摘要。
        byte[] md = mdInst.digest();// 获得密文, 通过执行诸如填充之类的最终操作完成哈希计算。在调用此方法之后，摘要被重置。
        return StrConvertUtil.byteArrToHexStr(md);//
    }

    /**
     * MD5加盐加密
     */
    public static String generate(String passWord) {
        // 生成一个16位的随机数
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        //生成可变的字符串
        //public int nextInt(int n)该方法的作用是生成一个随机的int值，该值介于[0,n)的区间
        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
        int len = sb.length();
        //长度不满足16位，后面补0
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        // 生成最终的加密盐
        String salt = sb.toString();
        //将这16位数字和密码相加，然后再获取MD5算法摘要
        passWord = MD5.getMd5(passWord + salt);
        //创建一个字符数组，长度位为48
        char[] cs = new char[48];
        for (int i = 0; i < 48; i += 3) {
            cs[i] = passWord.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = passWord.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }
    /**
     * 验证加盐后是否和原文一致,校验密码是否正确
     */
    public static boolean verify(String passWord, String md5) {
        //假设md5从上面来，48位，cs2取出的是随机数值部分，而cs1取出的是password部分
        char[] cs1 = new char[32];
        char[] cs2 = new char[16];
        for (int i = 0; i < 48; i += 3) {
            cs1[i / 3 * 2] = md5.charAt(i);//cs1 0,1=md5 0,2  2,3;3,5
            cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
            cs2[i / 3] = md5.charAt(i + 1);//cs2 0=md5 1, 1 4 ,2 7
        }
        String salt = new String(cs2);
        return Md5Util.getMd5(passWord + salt).equals(new String(cs1));
    }
}
