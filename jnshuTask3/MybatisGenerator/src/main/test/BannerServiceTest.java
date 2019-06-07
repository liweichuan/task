import com.jnshu.mapper.BannerMapper;
import com.jnshu.model.Banner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Application.xml"})
public class BannerServiceTest {
    private static Logger logger= LogManager.getLogger(BannerServiceTest.class);
    @Autowired
    BannerMapper bannerMapper;
    @Test
    public void insertSelective(){
        Banner banner=new Banner();
        banner.setId((long) 5);
        banner.setStatus(0);
        banner.setEditor("学生");
        banner.setPage("C:\\Users\\liweichuan\\Pictures\\Saved Pictures\\14.jpg");//注意这里有转义字符
        banner.setUrl("C:\\Users\\liweichuan\\Pictures\\Saved Pictures\\14.jpg");
        banner.setCreate_time((long) 123456789);
        bannerMapper.insertSelective(banner);
    }
}
