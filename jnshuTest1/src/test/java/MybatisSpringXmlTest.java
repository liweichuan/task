import Service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;


/**测试spring和mybatis整合的xml方法
 * @ClassName MybatisSpringXmlTest
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/25 13:53
 * @Version 1.0
 **/
public class MybatisSpringXmlTest {
       private ApplicationContext applicationContext;
       @Before
    public void init(){
           applicationContext= new ClassPathXmlApplicationContext("classpath:application.xml");
       }
       @Test
    public void testAdd()throws Exception{
           StudentService studentService =  applicationContext.getBean(StudentService.class);
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
       }
       @Test
    public void testDelete()throws Exception{
           StudentService studentService = applicationContext.getBean(StudentService.class);
           studentService.deleteByName("程一凡");
           System.out.println("True");
       }
       @Test
    public void testUpdate()throws Exception{
           StudentService studentService =  applicationContext.getBean(StudentService.class);
           Student student=new Student();
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
       @Test
    public void testFindByName()throws Exception{
           StudentService studentService = applicationContext.getBean(StudentService.class);
           Student student = studentService.findByName("程一凡");
           System.out.println(student);
       }
       @Test
    public void testFindByStuId()throws Exception{
           StudentService studentService = applicationContext.getBean(StudentService.class);
           Student student =studentService.findByStuId(7200);
           System.out.println(student);
       }
}