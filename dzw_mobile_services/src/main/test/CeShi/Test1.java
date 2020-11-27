package CeShi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.lzj.MemBerBiz;
import com.accp.pojo.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class Test1 {

	@Autowired
	private MemBerBiz biz;
	
	@Test
	public void queryMember() {
		biz.queryMember("123",1,2).getList().forEach(temp->{
			System.out.println("aa  "+temp);
		});
	}
	
	@Test
	public void queryClient() {
		biz.queryClient(1).forEach(temp->{
			System.out.println("aa  "+temp);
		});
	}
	
	@Test
	public void updateClientGrand() {
		biz.updateClientGrand(1);
	}
	
	@Test
	public void insertMemberClient() {
		Member memBer = new Member(null, "123456", "123456", 1, "ÕÅÈı", 0);
		biz.insertMemberClient(memBer);
	}
	
	@Test
	public void updateMember() {
		biz.updateMember(4, 1);
	}
	
	@Test
	public void deleteMember() {
		biz.deleteMember(4);
	}
}
