package com.accp.test.kwt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.kwt.EngineBiz;
import com.accp.pojo.Engine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ctx.xml"})
public class EngineTest {

    @Autowired
    private EngineBiz biz;

    @Test
    public void SelectAll() {
        List<Engine> lists = biz.SelectPage();
        lists.forEach(i -> {
            System.err.println(i);
        });
    }

    @Test
    public void insert() {
        Engine e = new Engine();
        e.setEnginename("百利通");
        int count = biz.addEngine(e);
        if (count > 0) {
            System.err.println("新增成功！");
        } else {
            System.err.println("新增失败！");
        }
    }

    @Test
    public void SelectByName() {
        List<Engine> lists = biz.SelectByname("上");
        lists.forEach(i -> {
            System.err.println(i);
        });
    }
}
