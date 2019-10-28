package com.shopp.service;

import com.shopp.entity.SysConfig;

import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/25 15:11
 * @Version 1.0
 */
public interface SysConfigService {

     List<SysConfig> SysConfigList(SysConfig sysconfig) throws Exception;


}
