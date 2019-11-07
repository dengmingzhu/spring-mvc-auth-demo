package com.shopp.service.impl;

import com.shopp.entity.SysUser;
import com.shopp.mapper.SysUserMapper;
import com.shopp.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author DengMingZhu
 * @Date 2019/10/28 21:47
 * @Version 1.0
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void insert(SysUser user) {
        int insert = sysUserMapper.insert(user);
    }

    @Override
    public List<SysUser> SelectAll(SysUser sysUser) throws Exception {
        return sysUserMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Long Id, SysUser user) throws Exception {
//        user.setId(Id);
        return sysUserMapper.updateByPrimaryKey(user);
    }


}
