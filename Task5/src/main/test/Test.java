import com.jnshu.Tool.DesUtil;
import com.jnshu.Tool.Md5Util;

public class Test {
    public static void main(String[] args) { //主方法
        String passWord="123456";
        //定义一个字符串。6位
        //调用md5进行加密
        String passWord1= Md5Util.getMd5(passWord);
        System.out.println("加密前的密码是"+passWord+".........");
        System.out.println("用MD5加密后的密码是"+passWord1+"........");
        System.out.println("用MD5加盐加密的密码是："+Md5Util.generate(passWord));
        System.out.println("验证密码是否正确"+Md5Util.verify(passWord,Md5Util.generate(passWord)));
        try {
            DesUtil desUtil=new DesUtil(passWord);
            String passWord3=desUtil.encrypt(passWord);
            System.out.println("用DES加密后的密码是"+passWord3+".........");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}