import com.taskDemo.pojo.Student;
import com.taskDemo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName junitTest
 * @Description TODO用来测试数据库连接
 * @Author liweichuan
 * @Date 2019/5/8 15:40
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Application.xml")
public class junitTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testfindByName(){
        Student student = studentService.findStudentByName("李伟川");
        System.out.println(student);
    }
}