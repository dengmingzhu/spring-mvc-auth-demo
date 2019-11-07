package com.shopp.controller;

import com.shopp.entity.SysUser;
import com.shopp.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/28 21:40
 * @Version 1.0
 */

@Controller
@RequestMapping("/auth")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @ResponseBody
    @RequestMapping("/addUser")
    public SysUser Insert(SysUser user) {
        user.setCaKey("1439276876290099");
        user.setEmail("dmz163.com");
        user.setId(7890L);
        user.setUsername("tom");
        user.setUsertype(3);
        user.setPassword("123");
        user.setPhone("1243256");
        user.setRealname("test");
        short sh = 9;
        user.setSort(sh);
        user.setRegionId("2414");
        user.setCaKey("124");
        user.setUpdateBy("34");
        Date data = new Date();
        data.getTime();
        user.setUpdateDate(data);
        user.setCreateBy("14");
        user.setCreateDate(data);
        user.setDelFlag("3");
        user.setDeptId("wet");
        user.setRemark("3466");
        user.setEnterpriseId(1244346363L);
        authorityService.insert(user);
        return user;
    }

    @RequestMapping("/SelectUser")
    public ModelAndView querySysConfig(SysUser user) throws Exception {
        //调用service查找数据库，查询列表，这里先使用静态的数据模拟
        List<SysUser> itemsList = authorityService.SelectAll(user);

        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法
        modelAndView.addObject("itemsList", itemsList);
        //指定视图
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }

    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(SysUser user) throws Exception {
        user.setCaKey("1439276876211099");
        user.setEmail("QQ163.com");
        user.setUsername("jack");
        user.setUsertype(3);
        user.setPassword("fgh");
        user.setPhone("999909");
        user.setRealname("test");
        short sh = 9;
        user.setSort(sh);
        user.setRegionId("99");
        user.setCaKey("99");
        user.setUpdateBy("34");
        Date data = new Date();
        data.getTime();
        user.setUpdateDate(data);
        user.setCreateBy("14");
        user.setCreateDate(data);
        user.setDelFlag("3");
        user.setDeptId("test");
        user.setRemark("3466");
        user.setEnterpriseId(98346363L);
        user.setId(1244L);
        authorityService.updateByPrimaryKey(user.getId(),user);
        return 1;
    }
}
