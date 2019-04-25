import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * @ClassName StudnetTest
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/15 17:38
 * @Version 1.0
 **/
public class MybatisTest {
    @Autowired
    private StudentService studentService;
    private SqlSessionFactory sqlSessionFactory = null;
    @Before   //初始化方法
    public void init()throws Exception{
        //1.要建设就要先找工程队，所以创建工程对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2.找到工程队了，要建工厂要有设计图，可以用reader可以用输入
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //3.有了设计图就开始建工厂,这个工厂必须是能一直使用，能共用的。不能说每次都要建一个，这样浪费资源
        this.sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
    }
    @Test
    public void testaddStu()throws Exception{
        //4.有了工厂就应该创建会议（机器），可以是多个
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //5.有了会议（机器）那么我们就可以执行sql语句，进行增删查改。
             Student student =new Student();
             student.setName("程一凡");
             student.setType("前端工程师");
             student.setQq(453166067);
             student.setStart_time("2018年10月18日");
             student.setStudent_id(7132);
             student.setSchool("海南软件职业技术学院");
             student.setWish("背负着信任与希望来到修真院，学好前端不让关心你的人失望。");
             student.setBro("孟晨师兄");
             student.setLink("http://www.jnshu.com/daily/81699?dailyType=others&total=7&page=1&uid=32111&sort=0&orderBy=3");
             studentService.add(student);
             System.out.println("增加成功");
            sqlSession.insert("add",student);//重要，这里才将数据库导入数据库
            //6.打印结果
            System.out.println(student);
            //进行事务提交
            sqlSession.commit();
            //7.释放资源
            sqlSession.close();
    }
    @Test
    public void testupdateStu()throws Exception{
        //4.创建会议，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.有了会议,进行增删查改
        Student student =new Student();
        student.setName("程一凡");
        student.setType("前端工程师");
        student.setQq(453166067);
        student.setStart_time("2018年10月18日");
        student.setStudent_id(7132);
        student.setSchool("海南软件职业技术学院");
        student.setWish("背负着信任与希望来到修真院，学好前端不让关心你的人失望。");
        student.setBro("孟晨师兄");
        student.setLink("http://www.jnshu.com/daily/81699?dailyType=others&total=7&page=1&uid=32111&sort=0&orderBy=3");
        studentService.add(student);
        System.out.println("增加成功");
        sqlSession.update("update",student);//重要
        //6.打印结果
        System.out.println("True");
        //进行事物提交
        sqlSession.commit();
        //7.释放资源
        sqlSession.close();
    }
    @Test
    public void testdeleteByName()throws Exception{
        //4.创建会议，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.有了会议，进行增删查改
        sqlSession.delete("deleteByName","程一凡");
        //6.打印结果
        System.out.println("True");
        //进行事物提交
        sqlSession.commit();
        //7.释放资源
        sqlSession.close();
    }
    @Test
    public void testfindById()throws Exception{
        //4.创建会议，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.有了会议，进行增删查改
        Student student=sqlSession.selectOne("findById",5);//重要
        //6.打印结果
        System.out.println(student);
        //进行事物提交
        sqlSession.commit();
        //7.释放资源
        sqlSession.close();
    }
    @Test
    public void testfindAll()throws Exception{
        //4.创建会议，执行sql语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.有了会议，进行增删查改
        List<Student> list = sqlSession.selectList("程一凡");//重要
        //6.打印结果
        for (Student student:list){
            System.out.println(student);
        }
        //进行事物提交
        sqlSession.commit();
        //7.释放资源
        sqlSession.close();
    }
}