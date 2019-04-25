package Service;
import pojo.Student;
import java.util.List;
/**
 * @ClassName StudentService
 * @Description TODO
 * @Author liweichuan
 * @Date 2019/4/22 17:44
 * @Version 1.0
 **/
public interface StudentService {
    //增加方法
    public int add(Student student)throws Exception;
    //删除方法
    public void deleteByName(String name)throws Exception;
    //更新方法
    public int update(Student student)throws Exception;
    //靠Id查询
    public Student findById(int id)throws Exception;
    //根据学员名字查询
    public Student findByName(String name)throws Exception;
    //根据学员学号查询
    public Student findByStuId(int student_id)throws Exception;
    //查询所有
    List<Student> findAll()throws Exception;
}