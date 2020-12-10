package com.accp.test.kwt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.kwt.MakeBiz;
import com.accp.pojo.Make;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class MakeTest {

    @Autowired
    private MakeBiz biz;

    @Test
    public void updateMakes() {
        Make make = new Make();
        make.setMakeid(1254);
        make.setMakename("桑塔纳");
        make.setAcronym("S");
        int count = biz.updateByid(make);
        if (count > 0) {
            System.err.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
    }
}
