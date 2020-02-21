package springMVC_t2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.accp.springMVC_t2.Biz.flightInfoBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })

public class flightInfoBizTest {
	@Resource
	private flightInfoBiz biz;

	@Test
	public void queryById() {
		biz.queryById("CA999");
	}
}
