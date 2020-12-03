package com.accp.action.pjw;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.pjw.ShangpinBiz;
import com.accp.pojo.Shangpin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/shangpin")
public class ShangpinAction {
    @Autowired
    private ShangpinBiz shangpinbiz;

    /*
     *  分页查询商品表  信息
     *  @Param   sousuo  fid
     */
    @GetMapping("select/{page1}/{page2}/{sousuo}/{daid}")
    public PageInfo<Shangpin> selectshangpin(@PathVariable Integer page1, @PathVariable Integer page2, @PathVariable String sousuo, @PathVariable Integer daid) {
        System.out.println("进来了");
        shangpinbiz.selectshangpin(page1, page2, sousuo, daid).getList().forEach(temp -> {
            System.out.println("a " + temp);
        });
        return shangpinbiz.selectshangpin(page1, page2, sousuo, daid);
    }

}
