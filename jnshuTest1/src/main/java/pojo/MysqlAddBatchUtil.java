package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MysqlAddBatchUtil {
    //配置数据库连接参数，以及SQL语句
    private String sql ="insert into student value(null,?,?,?,?,?,?,?,?,?)";
    private String charset = "utf-8";
    private String url = "jdbc:mysql://localhost:3306/jnshu?useServerPrepStmts=false&rewriteBatchedStatements=true&useSSL=false";//useServerPrepStmts也就是预编译提交，这里设置成了false就是阻止了程序默认的自动编译没一条SQL语句，而后面的rewriteBatchedStatement就是批量处理的核心语句了，因为jdbc在默认情况下是将这个方法的参数值设置称为false的，当我们在连接声明的时候将其设置为true时，程序就能执行批次处理语句了，这里是批量插入的关键所在，如果去掉的话就只能执行普通批次的插入了
    private String name = "root";
    private String password ="123456";
    public void doStore()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,name,password);
        conn.setAutoCommit(false);//这里将系统默认的自动事务提交关闭了，所以程序执行的时候，插入数据不会实时动态提交到mysql
        int count =0;//计数变量
        PreparedStatement ps = conn.prepareStatement(sql);//预编译SQL语句
        long start=System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            ps.setString(1,"程一凡");
            ps.setInt(2,453166067);
            ps.setString(3,"产品经理");
            ps.setString(4,"2018年10月18日");
            ps.setString(5,"海南软件职业技术学院");
            ps.setInt(6,7132);
            ps.setString(7,"http://www.jnshu.com/daily/81699?dailyType=others&total=7&page=1&uid=32111&sort=0&orderBy=3");
            ps.setString(8,"背负着信任与希望来到修真院，学好前端不让关心你的人失望。");
            ps.setString(9,"孟晨师兄");
            ps.addBatch();//加入批量处理
            count++;
        }
        ps.executeBatch();//执行批量处理
        conn.commit();//事务提交
        long end = System.currentTimeMillis();
        System.out.println("数量="+count);
        System.out.println("插入时间："+(end-start)/1000+"秒");
        conn.close();//连接关闭
    }
    public static void main(String[] args) {
        try {
            new MysqlAddBatchUtil().doStore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}