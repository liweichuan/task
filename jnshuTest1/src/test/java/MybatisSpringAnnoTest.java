import Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Student;

import java.util.List;

/**测试Mybatis和spring整合的注释方法
 * @ClassName MybatisSpringAnnoTest
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/22 20:01
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MybatisSpringAnnoTest {
    @Autowired
    private StudentService studentService;
    //测试增加方法
    @Test
    public void testAdd()throws Exception{
            Student student = new Student();
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
    }
    //测试靠id删除方法
    @Test
    public void testDelete()throws Exception{
        studentService.deleteByName("程一凡");
        System.out.println("True");
    }
    //测试更新方法
    @Test
    public void testUpdate()throws Exception{
        Student student =new Student();
        student.setId(1);
        student.setName("程一凡");
        student.setType("前端工程师");
        student.setQq(453166067);
        student.setStart_time("2018年10月18日");
        student.setStudent_id(7132);
        student.setSchool("海南软件职业技术学院");
        student.setWish("背负着信任与希望来到修真院，学好前端不让关心你的人失望。");
        student.setBro("孟晨师兄");
        student.setLink("http://www.jnshu.com/daily/81699?dailyType=others&total=7&page=1&uid=32111&sort=0&orderBy=3");
        studentService.update(student);
        System.out.println("True");
    }
    //测试靠id查询报名帖
    @Test
    public void testFindById()throws Exception{
        Student student =new Student();
        student= studentService.findById(5);
        System.out.println(student);
    }
    //测试靠姓名查询报名帖
    @Test
    public void testFindByName() throws Exception{
        Student student =new Student();
        student= studentService.findByName("程一凡");
        System.out.println(student);
    }
    //测试靠学号查询报名帖
    @Test
    public void testFindByStuId() throws Exception{
        Student student =new Student();
        student= studentService.findByStuId(5402);
        System.out.println(student);
    }
//    //测试查询所有
//    @Test
//    public void testFindAll() throws Exception {
//        List<Student> st = studentService.findAll();
//        for (Student s : st){
//            System.out.println(s.getName());
//        }
//    }
}