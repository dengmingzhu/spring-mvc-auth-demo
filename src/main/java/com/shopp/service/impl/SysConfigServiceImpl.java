package com.shopp.service.impl;


import com.shopp.entity.SysConfig;
import com.shopp.mapper.SysConfigMapper;
import com.shopp.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/25 15:14
 * @Version 1.0
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {

    @Autowired
    private SysConfigMapper sysconfigMapper;

    @Override
    public List<SysConfig>  SysConfigList(SysConfig sysconfig) throws Exception {

        //通过ItemsMapperCustom查询数据库
        return sysconfigMapper.selectAll();
    }

}
