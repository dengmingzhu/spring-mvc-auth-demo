package com.shopp.controller;
import com.shopp.entity.SysConfig;
import com.shopp.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/25 15:06
 * @Version 1.0
 */
@Controller
//@RequestMapping("/sysConfig")
public class SysConfigController {

    @Autowired
    private SysConfigService sysConfigService;

    @RequestMapping("/index")
//    @RequestMapping("/querySysConfig")
    public ModelAndView querySysConfig(SysConfig sysconfig) throws Exception {
        //调用service查找数据库，查询列表，这里先使用静态的数据模拟
        List<SysConfig> itemsList = sysConfigService.SysConfigList(sysconfig);


        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法
        modelAndView.addObject("itemsList",itemsList);
        //指定视图
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }

}
