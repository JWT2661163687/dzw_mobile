package com.accp.test.pjw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.pjw.WeixiuBiz;
import com.accp.pojo.Weixiu;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class WeixiuTest {
		@Autowired
		private WeixiuBiz weixiubiz;
		
		/*
		 *  	查询
		 */
		@Test
		public void selectid() {
			PageInfo<Weixiu> page=weixiubiz.selectcid(1, 1, 1,"1001");
			System.out.println("分页"+page.getList().get(0).getXmleixing());
		}
		
		/*
		 * 	新增
		 */
		@Test
		public void insertweixiu() {
			Weixiu weixiu=new Weixiu();
			weixiu.setXmleixing("中国上汽");
			weixiu.setXmbianma("1001");
			weixiu.setXmmingcheng("轮胎更换");
			weixiu.setXmshoujia("车型");
			weixiu.setXmzhonglei("工时费");
			weixiu.setXmbiaozhun(50);
			weixiu.setXmhuiyuan(30);
			weixiu.setCid(1);
			int zeng=weixiubiz.insertweixiu(weixiu);
			System.out.println("新增:"+zeng);
		}
		
		/*
		 * 	修改
		 */
		@Test
		public void updateweixiu() {
			Weixiu xiugai=new Weixiu();
			xiugai.setXmleixing("中国上汽");
			xiugai.setXmbianma("1001");
			xiugai.setXmmingcheng("保养");
			xiugai.setXmshoujia("车型");
			xiugai.setXmzhonglei("工时费");
			xiugai.setXmbiaozhun(2);
			xiugai.setXmhuiyuan(1);
			xiugai.setXmid(1);
			int gai=weixiubiz.updateweixiu(xiugai);
			System.out.println("修改:"+gai);
		}
		
}
